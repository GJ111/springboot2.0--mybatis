package com.gj.bos_resopse.controller;

import com.gj.bos_resopse.pojo.TbItem;
import com.gj.bos_resopse.service.ItemService;
import com.gj.bos_resopse.utils.E3Result;
import com.gj.bos_resopse.utils.EasyUIDataGridResult;
import com.gj.bos_resopse.utils.TbItemExt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: GJ
 * @CreateDate: 2018/6/17 11:44
 * @Description: Item 商品信息
 * @UpdateDate: 2018/6/17 11:44
 * @UpdateRemark: 跟新备注
 * @Version: 1.0
 */
@RestController
public class ItemController {
    /* 服务层*/
    @Autowired
    private ItemService itemService;

    /**
     * @return 分页查询商品信息数据
     */
    @RequestMapping("/itemList/{page}/and/{rows}")
    public EasyUIDataGridResult getItemByPageHelper(@PathVariable Integer page, @PathVariable Integer rows) {
        EasyUIDataGridResult itemByPageHelper = itemService.getItemByPageHelper(page, rows);

        return itemByPageHelper;
    }

    /* 添加商品*/
    @RequestMapping(value = "/item/add", method = RequestMethod.POST)
    public E3Result addItem(@RequestBody TbItemExt tbItemExt) {
        E3Result e3Result = itemService.addItem(tbItemExt);

        return e3Result;

    }
}
