package com.abashop.controller;

import com.abashop.pojo.Category;
import com.abashop.service.CategoryService;
import com.abashop.utils.RespUtil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.*;

/**
 * @ClassName Category
 * @Description 商品标签/商品分类
 * @Author Zhang Qing
 * @Date 2020/11/5 10:52
 */
@RestController
public class CategoryController {

    @Resource
    private CategoryService service;

    public List<Map<String, Object>> listFormat(List<Category> list) {
        List<Map<String, Object>> listMap = new ArrayList<Map<String, Object>>();
        for (Category category : list) {
            Map<String, Object> map = new HashMap<>();
            map.put("categoryId", category.getCategoryId());
            map.put("parentId", category.getParentId());
            map.put("categoryName", category.getCategoryName());
            listMap.add(map);
        }
        return listMap;
    }


    //    TODO 首页分类信息 所有的分类
    @GetMapping("/sys/category")
    public RespUtil categoryAll() {
        List<Category> categoryList = service.listAll();
        return new RespUtil("success", "所有分类", categoryList.size(), listFormat(categoryList));
    }

    //    获取信息
    @GetMapping("/category/info")
    public RespUtil categoryInfo(@RequestParam(value = "parentId", defaultValue = "0") Long parentId) {
        List<Category> categoryList = service.listByParentId(parentId);
        /*List<Map<String, Object>> listMap = new ArrayList<Map<String, Object>>();
        for (Category category : categoryList){
            Map<String, Object> map = new HashMap<>();
            map.put("categoryId", category.getCategoryId());
            map.put("parentId",category.getParentId());
            map.put("categoryName",category.getCategoryName());
            listMap.add(map);
        }*/
        return new RespUtil("success", "分类信息", categoryList.size(), listFormat(categoryList));
    }

    //    获取商铺里的分类
    @GetMapping("/category/shop")
    public RespUtil categoryByShop(HttpServletRequest servletRequest) {
//        从session中获取商家id TODO 这里强制转换会出问题 注意测试
        Long shopId = (Long) servletRequest.getSession().getAttribute("shopId");
        List<Category> tableCategory = service.tableCategory(shopId);
        return new RespUtil("success", "商铺分类", tableCategory.size(), listFormat(tableCategory));
    }

//    添加/更新分类
   /* @RequestMapping(value = "/category/save",method = RequestMethod.POST)
    public RespUtil categorySave(@RequestBody Category category, HttpServletRequest servletRequest){
        Long shopId = (Long) servletRequest.getSession().getAttribute("shopId");
        int result = 0;
        Date date = new Date();
        if ()
        return new RespUtil("","");
    }*/

}
