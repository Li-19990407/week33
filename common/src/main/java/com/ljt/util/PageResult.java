package com.ljt.util;

import java.io.Serializable;
import java.util.List;

public class PageResult<T> implements Serializable {

    private static final long serialVersionUID = 1L;
    private int pageSize =3;//每页条数
    private int current =1;//当前页
    private long total;//总条数
    private int pages;//总页数


    //存放业务数据
    private List<T> records;


    public PageResult(long total){

        this.total = total;

    }

    public PageResult(int pageSize,long total){
        this.pageSize = pageSize;
        this.total = total;

    }
    public PageResult(long total,List<T> records){

        this.total = total;
        this.records = records;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public int getPages() {

        pages = (int) (total%pageSize==0?(total/pageSize):(total/pageSize+1));

        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public List<T> getRecords() {
        return records;
    }

    public void setRecords(List<T> records) {
        this.records = records;
    }
}
