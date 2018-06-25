package com.gj.bos_resopse.service.ServiceImpl;

import com.gj.bos_resopse.dao.TbItemCatMapper;
import com.gj.bos_resopse.pojo.TbItem;
import com.gj.bos_resopse.pojo.TbItemCat;
import com.gj.bos_resopse.pojo.TbItemCatExample;
import com.gj.bos_resopse.service.ItemCatService;
import com.gj.bos_resopse.service.ItemService;
import com.gj.bos_resopse.utils.E3Result;
import com.gj.bos_resopse.utils.EasyUiTreeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: GJ
 * @CreateDate: 2018/6/19 18:05
 * @Description: 商品分类管理
 * @UpdateDate: 2018/6/19 18:05
 * @UpdateRemark: 跟新备注
 * @Version: 1.0
 */
@Service
public class ItemCatServiceImpl implements ItemCatService {
    @Autowired
    private TbItemCatMapper tbItemCatMapper;

    /**
     * 查询id
     *
     * @param pId
     * @return
     */
    @Override
    public List<EasyUiTreeNode> queryItemCatByPid(Long pId) {
        // 创建查询条件 Pid查
        TbItemCatExample tbItemCatExample = new TbItemCatExample();
        TbItemCatExample.Criteria criteria = tbItemCatExample.createCriteria();
        criteria.andParentIdEqualTo(pId);
        List<TbItemCat> tbItemCats = tbItemCatMapper.selectByExample(tbItemCatExample);
        // 创建商品分类集合
        List<EasyUiTreeNode> tbItemList = new ArrayList<>();
        // 遍历商品分类 转换成 EasyUiNode
        for (TbItemCat itemCat : tbItemCats) {
            EasyUiTreeNode easyUiTreeNode = new EasyUiTreeNode();
            easyUiTreeNode.setId(itemCat.getId());
            easyUiTreeNode.setText(itemCat.getName());
            easyUiTreeNode.setState(itemCat.getIsParent() ? "closed" : "open");
            tbItemList.add(easyUiTreeNode);

        }
        return tbItemList;
    }

    /**
     * 添加子节点
     *
     * @param parentId
     * @param name
     * @return
     */

}
