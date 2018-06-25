package com.gj.bos_resopse.utils;

import com.gj.bos_resopse.pojo.TbItem;

/**
 * @Author: GJ
 * @CreateDate: 2018/6/23 1:28
 * @Description: 商品扩展类家了desc属性
 * @UpdateDate: 2018/6/23 1:28
 * @UpdateRemark: 跟新备注
 * @Version: 1.0
 */
public class TbItemExt extends TbItem {

    private String desc;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
