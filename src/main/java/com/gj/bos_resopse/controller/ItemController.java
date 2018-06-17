package com.gj.bos_resopse.controller;

import com.gj.bos_resopse.pojo.TbItem;
import com.gj.bos_resopse.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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
    @Autowired
    private ItemService itemService;

    @RequestMapping("item/{itemId}")
    @ResponseBody
    private TbItem getItemById(@PathVariable Long itemId) {
        TbItem tbItem = itemService.getItemById(itemId);
        return tbItem;
    }
}
