package com.abashop.utils;

import java.util.List;

/**
 * @ClassName PageResult
 * @Description 分页返回结果
 * @Author Zhang Qing
 * @Date 2020/11/4 8:53
 */
public class PageResult {

    private int pageNum;
    private int pageSize;
    //    记录总数
    private long totalSize;
    //    页码总数
    private int totalPages;
    private List<?> content;

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

    public long getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(long totalSize) {
        this.totalSize = totalSize;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public List<?> getContent() {
        return content;
    }

    public void setContent(List<?> content) {
        this.content = content;
    }
}
