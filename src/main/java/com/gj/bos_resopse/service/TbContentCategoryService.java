package com.gj.bos_resopse.service;

import com.gj.bos_resopse.pojo.TbContentCategory;
import com.gj.bos_resopse.utils.E3Result;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @Author: GJ
 * @CreateDate: 2018/6/25 9:45
 * @Description: java类作用描述
 * @UpdateDate: 2018/6/25 9:45
 * @UpdateRemark: 跟新备注
 * @Version: 1.0
 */

public interface TbContentCategoryService {
    /**
     * 根据pidchaxun
     *
     * @param pId
     * @return
     */
    public List<TbContentCategory> getContentCatByPid(Long pId);

    /**添加节点
     * @param parentId
     * @param name
     * @return
     */
    E3Result addContentCat(Long parentId, String name);

}
