package com.abashop.utils;

import com.github.pagehelper.PageInfo;

/**
 * @ClassName PageUtils
 * @Description 封装分页信息
 * @Author Zhang Qing
 * @Date 2020/11/4 8:57
 */
public class PageUtils {

    /**
     * @return
     * @Author Zq
     * @Param pageRequest, page
     **/
    public static PageResult getPageResult(PageRequest pageRequest, PageInfo<?> pageInfo) {
        PageResult pageResult = new PageResult();
        pageResult.setPageNum(pageInfo.getPageNum());
        pageResult.setPageSize(pageInfo.getPageSize());
        pageResult.setTotalSize(pageInfo.getTotal());
        pageResult.setTotalPages(pageInfo.getPages());
        pageResult.setContent(pageInfo.getList());
        return pageResult;
    }

}
