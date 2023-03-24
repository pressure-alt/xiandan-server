package com.huang.web.controller;

import com.huang.web.ResultS;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import org.apache.tomcat.util.json.JSONFilter;
import org.apache.tomcat.util.json.JSONParser;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@RequestMapping("/api")
public class UploadImgHandler {

    //图片存储路径
    @Value("${xiandan.resources.picture.path}")
    private String path;
    //图片访问url前缀
    @Value("${xiandan.resources.picture.picUrl}")
    private String picUrl;
    @ResponseBody
    @PostMapping("/picUpload")
    public List<String> saveImg(@RequestParam("file") List<MultipartFile> multipartFiles ){
//        File filePath = new File(path);
//        System.out.println("文件的保存路径"+path);
//        if(!filePath.exists() && !filePath.isDirectory()){
//            System.out.println("目录不存在，创建目录" + filePath);
//            filePath.mkdir();
//        }
//
        System.out.println(multipartFiles);

        return null;
    }
    @Value("${file.uploadFolder}")
    private String uploadFolder;

//    @PostMapping("/project/upload/{id}")
//    public ResultS<?> fileupload(MultipartFile file, HttpServletRequest req, @PathVariable Long id) throws FileNotFoundException {
//
//        //使用UUID生成唯一标识文件名
//        String randomNumber = UUID.randomUUID().toString().replace("-", "");
//        //获取文件的原始名
//        String oldFilename = file.getOriginalFilename();
//        //获取文件后缀 .pdf
//        String extension = oldFilename.substring(oldFilename.lastIndexOf("."));
//        //生成新的文件名
//        String newFileName = randomNumber + extension;
//
//        File dateDir = new File(uploadFolder);
//
//        if (!dateDir.exists()) {
//            //判断目录是否存在，不存在则直接创建
//            dateDir.mkdirs();
//        }
//        try {
//            file.transferTo(new File(dateDir, newFileName));
//        } catch (IOException e) {
//            e.printStackTrace();
//            return ResultS.fail("上传失败");
//        }
//
//        //上传完毕，可以把上传地址保存到数据库或者直接返回前端显示
//        String invented_address = req.getScheme()+"://"+req.getServerName()+":"+req.getServerPort() + "/api/file/" + newFileName;
//
//
//        Project project = new Project();
//        project.setId(id);
//        project.setInterfaceDocUrl(invented_address);
//        projectService.updateById(project);
//
//        return ResultS.ok("上传成功");
//    }
}
