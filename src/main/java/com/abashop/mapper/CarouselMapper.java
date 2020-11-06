package com.abashop.mapper;

import com.abashop.pojo.Carousel;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CarouselMapper {
    int deleteByPrimaryKey(Long imgId);

    int insert(Carousel record);

    int insertSelective(Carousel record);

    Carousel selectByPrimaryKey(Long imgId);

    int updateByPrimaryKeySelective(Carousel record);

    int updateByPrimaryKey(Carousel record);
}