package com.gj.bos_resopse.controller;

import com.gj.bos_resopse.pojo.TbContent;
import com.gj.bos_resopse.pojo.TbContentCategory;
import com.gj.bos_resopse.service.ContentService;
import com.gj.bos_resopse.service.TbContentCategoryService;
import com.gj.bos_resopse.utils.E3Result;
import com.gj.bos_resopse.utils.EasyUIDataGridResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
public class ContentController {

    @Autowired
    ContentService contentService;


    /**
     * @param tbContent
     * @return
     */

    @RequestMapping("content/save")
    public E3Result addContentCat(@RequestBody TbContent tbContent) {
        E3Result e3Result = contentService.addContent(tbContent);

        return e3Result;
    }

    @RequestMapping("/content/cid")
    public List<TbContent> queryContentByCid(Long cid) {

        List<TbContent> tbContents = contentService.queryContentByCid(cid);
        return tbContents;
    }

}
