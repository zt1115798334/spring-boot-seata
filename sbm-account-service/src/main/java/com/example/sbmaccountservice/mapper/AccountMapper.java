package com.example.sbmaccountservice.mapper;


import com.example.sbmaccountservice.entity.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AccountMapper {

    Account selectByUserId(@Param("userId") String userId);

    int updateById(@Param("account") Account record);

}
