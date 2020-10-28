package com.abashop.mapper;

import com.abashop.pojo.Carousel;

public interface CarouselMapper {
    int deleteByPrimaryKey(Long imgId);

    int insert(Carousel record);

    int insertSelective(Carousel record);

    Carousel selectByPrimaryKey(Long imgId);

    int updateByPrimaryKeySelective(Carousel record);

    int updateByPrimaryKey(Carousel record);
}