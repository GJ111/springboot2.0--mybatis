package com.gj.bos_resopse.service.ServiceImpl;

import com.gj.bos_resopse.dao.TbItemMapper;
import com.gj.bos_resopse.pojo.TbItem;
import com.gj.bos_resopse.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    /**
     * @param id
     * @return TbItem 商品信息
     */
    @Override
    public TbItem getItemById(Long id) {
        TbItem tbItem = tbItemMapper.selectByPrimaryKey(id);
        return tbItem;
    }
}




