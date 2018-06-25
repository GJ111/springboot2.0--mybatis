package com.gj.bos_resopse.controller;

import com.gj.bos_resopse.dao.TbContentCategoryMapper;
import com.gj.bos_resopse.pojo.TbContentCategory;
import com.gj.bos_resopse.pojo.TbContentCategoryExample;
import com.gj.bos_resopse.service.TbContentCategoryService;
import com.gj.bos_resopse.utils.E3Result;
import com.gj.bos_resopse.utils.EasyUiTreeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: GJ
 * @CreateDate: 2018/6/25 9:31
 * @Description: java类作用描述
 * @UpdateDate: 2018/6/25 9:31
 * @UpdateRemark: 跟新备注
 * @Version: 1.0
 */
@RestController
public class ContentCatGroyController {
    @Autowired
    TbContentCategoryService tbContentCategoryService;

    // 根据id 作为pId 查询结构
    @RequestMapping(value = "/content/category/{pId}", method = RequestMethod.GET)
    public List<TbContentCategory> getContentCatByPid(@PathVariable("pId") Long pId) {
        List<TbContentCategory> contentCatByPid = tbContentCategoryService.getContentCatByPid(pId);
        return contentCatByPid;
    }

    /**
     * 插入
     *
     * @param parentId
     * @param name
     * @return
     */
    @RequestMapping("/category/{parentId}/and/{name}")
    public E3Result addContentCat(@PathVariable Long parentId, @PathVariable String name) {
        E3Result e3Result = tbContentCategoryService.addContentCat(parentId, name);
        return e3Result;
    }


}
