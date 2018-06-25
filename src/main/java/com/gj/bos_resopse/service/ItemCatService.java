package com.gj.bos_resopse.service;

import com.gj.bos_resopse.utils.EasyUiTreeNode;

import java.util.List;

/**
 * @Author: GJ
 * @CreateDate: 2018/6/19 18:03
 * @Description: 商品类目查询
 * @UpdateDate: 2018/6/19 18:03
 * @UpdateRemark: 跟新备注
 * @Version: 1.0
 */
public interface ItemCatService {
    List<EasyUiTreeNode> queryItemCatByPid(Long pId);


}
