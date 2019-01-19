package com.pinyougou.grouppojo;

import java.io.Serializable;
import java.util.List;

/**
 * @author Songleen
 * @creat 01-16-17:19
 * 分页的实体类封装
 */
public class PageResult implements Serializable{

    private long total;

    private List rows;

    public PageResult(long total, List rows) {
        this.total = total;
        this.rows = rows;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List getRows() {
        return rows;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }
}
