package com.gj.bos_resopse.service.ServiceImpl;

import com.gj.bos_resopse.dao.TbContentCategoryMapper;
import com.gj.bos_resopse.pojo.TbContentCategory;
import com.gj.bos_resopse.pojo.TbContentCategoryExample;
import com.gj.bos_resopse.service.TbContentCategoryService;
import com.gj.bos_resopse.utils.E3Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Author: GJ
 * @CreateDate: 2018/6/25 9:47
 * @Description: java类作用描述
 * @UpdateDate: 2018/6/25 9:47
 * @UpdateRemark: 跟新备注
 * @Version: 1.0
 */
@Service
public class TbContentCategoryImpl implements TbContentCategoryService {
    @Autowired
    TbContentCategoryMapper tbContentCategoryMapper;

    /* 根据pid查询 */
    @Override
    public List<TbContentCategory> getContentCatByPid(Long pId) {
        //  根据pId查询
        TbContentCategoryExample tbContentCategoryExample = new TbContentCategoryExample();
        TbContentCategoryExample.Criteria criteria = tbContentCategoryExample.createCriteria();
        criteria.andParentIdEqualTo(pId);
        List<TbContentCategory> tbContentCategories = tbContentCategoryMapper.selectByExample(tbContentCategoryExample);
        return tbContentCategories;
    }

    /**
     * 添加子节点
     *
     * @param parentId
     * @param name
     * @return
     */
    @Override
    public E3Result addContentCat(Long parentId, String name) {

        TbContentCategory tbContentCategory = new TbContentCategory();
        tbContentCategory.setParentId(parentId);
        tbContentCategory.setName(name);
        tbContentCategory.setCreated(new Date());
        tbContentCategory.setIsParent(false);
        tbContentCategory.setSortOrder(1);
        // 1z正常2删除
        tbContentCategory.setStatus(1);
        tbContentCategory.setUpdated(new Date());
        // 插入
       tbContentCategoryMapper.insertSelective(tbContentCategory);

// 根据Pid
        TbContentCategory tbContentParent = tbContentCategoryMapper.selectByPrimaryKey(parentId);
        if (tbContentParent.getIsParent() == false) {
            tbContentParent.setIsParent(true);
            tbContentCategoryMapper.updateByPrimaryKey(tbContentParent);

        }

        return new E3Result(tbContentParent);
    }
}
