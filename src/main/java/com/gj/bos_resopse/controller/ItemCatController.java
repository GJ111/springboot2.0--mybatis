package com.gj.bos_resopse.controller;

import com.gj.bos_resopse.service.ItemCatService;
import com.gj.bos_resopse.utils.EasyUiTreeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: GJ
 * @CreateDate: 2018/6/19 18:37
 * @Description: 商品 ItemCatController
 * @UpdateDate: 2018/6/19 18:37
 * @UpdateRemark: 跟新备注
 * @Version: 1.0
 */
@RestController
public class ItemCatController {
    @Autowired
    private ItemCatService itemCatService;

    /**
     * @param pId
     * @return List<EasyUiTreeNode> json
     */
    @RequestMapping("ItemCat/Pid/{pId}")
    public List<EasyUiTreeNode> queryItemCatByPid(@PathVariable Long pId) {
        List<EasyUiTreeNode> easyUiTreeNodes = itemCatService.queryItemCatByPid(pId);
        return easyUiTreeNodes;
    }

}
