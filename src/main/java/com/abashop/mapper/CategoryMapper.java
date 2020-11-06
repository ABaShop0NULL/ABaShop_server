package com.abashop.mapper;

import com.abashop.pojo.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryMapper {
    int deleteByPrimaryKey(Long categoryId);

    int insert(Category record);

    int insertSelective(Category record);

    Category selectByPrimaryKey(Long categoryId);

    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKey(Category record);

    List<Category> selectByParentId(Long parentId);

    List<Category> selectByShopId(Long shopId);

    List<Category> selectAll();
}