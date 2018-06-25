package com.gj.bos_resopse.service.ServiceImpl;

import com.gj.bos_resopse.dao.TbContentMapper;
import com.gj.bos_resopse.pojo.TbContent;
import com.gj.bos_resopse.pojo.TbContentExample;
import com.gj.bos_resopse.service.ContentService;
import com.gj.bos_resopse.utils.E3Result;
import com.gj.bos_resopse.utils.EasyUIDataGridResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Author: GJ
 * @CreateDate: 2018/6/25 20:28
 * @Description: java类作用描述
 * @UpdateDate: 2018/6/25 20:28
 * @UpdateRemark: 跟新备注
 * @Version: 1.0
 */
@Service
public class ContentServiceImpl implements ContentService {
    @Autowired
    TbContentMapper tbContentMapper;

    @Override
    public E3Result addContent(TbContent tbContent) {
        tbContent.setCreated(new Date());
        tbContent.setUpdated(new Date());
        /* 插入数据*/
        int insert = tbContentMapper.insert(tbContent);

        return E3Result.ok();
    }

    /**
     * 根据cid查询
     *
     * @param cid
     * @return contentList
     */
    @Override
    public List<TbContent> queryContentByCid(Long cid) {
        TbContentExample tbContentExample = new TbContentExample();
        TbContentExample.Criteria criteria = tbContentExample.createCriteria();
        criteria.andCategoryIdEqualTo(cid);

        List<TbContent> tbContents = tbContentMapper.selectByExampleWithBLOBs(tbContentExample);

        return tbContents;
    }
}
