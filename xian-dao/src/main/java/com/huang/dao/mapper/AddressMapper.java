package com.huang.dao.mapper;

import com.huang.dao.entity.Address;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AddressMapper {
    /**
     * @param userId
     * @return
     */
    List<Address>getAllAddressByUserId(@Param("userId")int userId);

}

