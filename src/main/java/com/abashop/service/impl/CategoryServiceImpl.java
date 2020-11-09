package com.abashop.service.impl;

import com.abashop.mapper.CategoryMapper;
import com.abashop.pojo.Category;
import com.abashop.service.CategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName CategoryServiceImpl
 * @Description 标签/分类抽象类具体实现
 * @Author Zhang Qing
 * @Date 2020/11/5 11:05
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Resource
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> listByParentId(Long parentId) {
        return categoryMapper.selectByParentId(parentId);
    }

    @Override
    public List<Category> tableCategory(Long shopId) {
        return categoryMapper.selectByShopId(shopId);
    }

    @Override
    public int saveCategroy(Category category) {

        return categoryMapper.insertSelective(category);
    }

    @Override
    public int updateCategroy(Category category) {

        return categoryMapper.updateByPrimaryKeySelective(category);
    }

    @Override
    public List<Category> listAll() {
        return categoryMapper.selectAll();
    }

   /* @Override
    public List<Category> treeSelect(Long shopId, int grade) {
        return null;
    }*/
}
