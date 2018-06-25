package com.gj.bos_resopse.utils;

import java.util.List;

/**
 * @Author: GJ
 * @CreateDate: 2018/6/19 13:24
 * @Description: easyuiresult
 * @UpdateDate: 2018/6/19 13:24
 * @UpdateRemark: {total:”2”,
 * rows:[{“id”:”1”,”name”:”张三”},{“id”:”2”,”name”:”李四”}]}
 * @Version: 1.0
 */
public class EasyUIDataGridResult {
private Long total;
private List rows;

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List getRows() {
        return rows;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }
}
