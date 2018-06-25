package com.gj.bos_resopse.service;

import com.gj.bos_resopse.pojo.TbItem;
import com.gj.bos_resopse.utils.E3Result;
import com.gj.bos_resopse.utils.EasyUIDataGridResult;
import com.gj.bos_resopse.utils.TbItemExt;

import java.util.List;

/**
 * @Author: GJ
 * @CreateDate: 2018/6/17 11:33
 * @Description: java类作用描述
 * @UpdateDate: 2018/6/17 11:33
 * @UpdateRemark: 跟新备注
 * @Version: 1.0
 */
public interface ItemService {
    /**
     * 展示数据列表
     *
     * @param pageNum
     * @param pageSize
     * @return
     */
    EasyUIDataGridResult getItemByPageHelper(Integer pageNum, Integer pageSize);

    /**
     * 增加商品
     *
     * @param tbItemExt
     * @return
     */
    E3Result addItem(TbItemExt tbItemExt);

}
