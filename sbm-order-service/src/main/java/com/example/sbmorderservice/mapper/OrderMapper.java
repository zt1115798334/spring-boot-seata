package com.example.sbmorderservice.mapper;

import com.example.sbmorderservice.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OrderMapper {

    int insert(@Param("order") Order record);

}