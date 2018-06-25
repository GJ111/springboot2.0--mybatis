package com.gj.bos_resopse.service.ServiceImpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gj.bos_resopse.dao.TbItemDescMapper;
import com.gj.bos_resopse.dao.TbItemMapper;
import com.gj.bos_resopse.pojo.TbItem;
import com.gj.bos_resopse.pojo.TbItemDesc;
import com.gj.bos_resopse.pojo.TbItemExample;
import com.gj.bos_resopse.service.ItemService;
import com.gj.bos_resopse.utils.E3Result;
import com.gj.bos_resopse.utils.EasyUIDataGridResult;
import com.gj.bos_resopse.utils.IDUtils;
import com.gj.bos_resopse.utils.TbItemExt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Author: GJ
 * @CreateDate: 2018/6/17 11:29
 * @Description: 商品信息
 * @UpdateDate: 2018/6/17 11:29
 * @UpdateRemark: 跟新备注
 * @Version: 1.0
 */
@Service
public class ItemServiceImpl implements ItemService {
    /**
     * 条目信息
     */
    @Autowired
    private TbItemMapper tbItemMapper;
    @Autowired
    private TbItemDescMapper tbItemDescMapper;

    /**
     * @param
     * @return TbItem 商品信息
     */
    @Override
    public EasyUIDataGridResult getItemByPageHelper(Integer pageNum, Integer pageSize) {

        // 查询条数
        PageHelper.startPage(pageNum, pageSize);
        TbItemExample tbItemExample = new TbItemExample();
        List<TbItem> tbItems = tbItemMapper.selectByExample(tbItemExample);
        // 控制查询书
        PageInfo<TbItem> pageInfo = new PageInfo(tbItems);
        // 总条数
        long total = pageInfo.getTotal();
        //  返回数据类型
        EasyUIDataGridResult easyUIDataGridResult = new EasyUIDataGridResult();
        easyUIDataGridResult.setTotal(total);
        easyUIDataGridResult.setRows(tbItems);

        return easyUIDataGridResult;
    }

    /**
     * 添加商品描述
     *
     * @param tbItemExt
     * @return E3Result
     */
    @Override
    public E3Result addItem(TbItemExt tbItemExt) {
        // desc 对象
        TbItemDesc tbItemDesc = new TbItemDesc();

        //创建id毫秒值加两位随机数
        long id = IDUtils.genItemId();
        tbItemDesc.setItemId(id);
        //创建时间
        tbItemDesc.setCreated(new Date());
        tbItemDesc.setUpdated(new Date());
        tbItemDesc.setItemDesc(tbItemExt.getDesc());
        tbItemDescMapper.insert(tbItemDesc);

// ext 类操作
        tbItemExt.setId(id);
        tbItemExt.setCid(id);
        tbItemExt.setCreated(new Date());
        tbItemExt.setUpdated(new Date());
        //商品状态，1-正常，2-下架，3-删除
        tbItemExt.setStatus((byte) 1);
        tbItemMapper.insert(tbItemExt);

        return E3Result.ok();
    }
}




