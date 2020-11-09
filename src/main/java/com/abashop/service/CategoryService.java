package com.abashop.service;

import com.abashop.pojo.Category;

import java.util.List;

/**
 * @ClassName CategoryService
 * @Description 标签/分类抽象类
 * @Author ASUS
 * @Date 2020/11/5 11:04
 */
public interface CategoryService {
	/**
	 * 根据parentId获取分类
	 *
	 * @param parentId 0 一级分类
	 * @return
	 */
	List<Category> listByParentId(Long parentId);

	/**
	 * 在店铺里的分类
	 * 获取用于页面表单展现的category列表，根据seq排序
	 *
	 * @return
	 */
	List<Category> tableCategory(Long shopId);

	/**
	 * 保存分类、品牌、参数
	 *
	 * @return
	 */
	int saveCategroy(Category category);

	/**
	 * 修改分类、品牌、参数
	 *
	 * @return
	 */
	int updateCategroy(Category category);
	/**
	 * 删除分类、品牌、参数 以及分类对应的图片
	 * @param qiniu TODO：图片处理
	 * @return
	 */
//	void deleteCategroy(Long categoryId);

	/**
	 * 根据店铺id和层级，获取商品分类树
	 * <p>
	 * 参数 shopId
	 * 参数 grade
	 *
	 * @return
	 */
//	List<Category> treeSelect(Long shopId,int grade);
	List<Category> listAll();
}
