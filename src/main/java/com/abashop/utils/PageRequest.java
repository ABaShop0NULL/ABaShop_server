package com.abashop.utils;

/**
 * @ClassName PageRequest
 * @Description 分页请求
 * @Author Zhang Qing
 * @Date 2020/11/4 8:44
 */
public class PageRequest {
    private int pageNum;
    private int pageSize;

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
