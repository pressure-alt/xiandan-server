package com.huang.web.controller;

import cn.hutool.core.codec.Base64;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.lang.Dict;
import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.digest.MD5;
import cn.hutool.json.JSONUtil;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/upload")
public class UploadController {
    @Value("${xiandan.resources.picture.path}")
    private String fileTempPath;
    @Value("${xiandan.domain-name}")
    private String DOMAIN;
    @Value("${xiandan.resources.picture.picUrl}")
    private String picUrl;
    @PostMapping(value = "/local", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public Dict local(@RequestParam("file") MultipartFile file) {
        Dict response=Dict.create();

        if (file.isEmpty()) {
            return response.set("code", 400).set("message", "文件内容为空");
        }
            //文件名用md5加密避免中文乱码
            String fileName = file.getOriginalFilename();
            String rawFileName = StrUtil.subBefore(fileName, ".", true);
            String md5FileName= MD5.create().digestHex(rawFileName);
            String fileType = StrUtil.subAfter(fileName, ".", true);
            String localFileName=md5FileName + "-" + DateUtil.current(false) + "." + fileType;
            String localFilePath = StrUtil.appendIfMissing(fileTempPath, "\\")+localFileName ;
            try {
                file.transferTo(new File(localFilePath));
            } catch (IOException e) {
                log.error("{}",e);
                return response.set("code", 500).set("message", "文件上传失败");
            }

            log.info("【文件上传至本地】绝对路径：{}", localFilePath);
            //返回文件名和url访问路径
            return response.set("code",200).set("message","文件上传成功").set("data",Dict.create()
                                                                            .set("fileName",fileName)
                                                                            .set("filePath",DOMAIN+picUrl+localFileName));


    }

}
