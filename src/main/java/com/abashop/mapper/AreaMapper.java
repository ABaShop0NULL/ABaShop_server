package com.abashop.mapper;

import com.abashop.pojo.Area;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AreaMapper {
    int deleteByPrimaryKey(Long areaId);

    int insert(Area record);

    int insertSelective(Area record);

    Area selectByPrimaryKey(Long areaId);

    int updateByPrimaryKeySelective(Area record);

    int updateByPrimaryKey(Area record);
}