package com.gj.bos_resopse.service;

import com.gj.bos_resopse.pojo.TbContent;
import com.gj.bos_resopse.utils.E3Result;
import com.gj.bos_resopse.utils.EasyUIDataGridResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author: GJ
 * @CreateDate: 2018/6/25 20:26
 * @Description: java类作用描述
 * @UpdateDate: 2018/6/25 20:26
 * @UpdateRemark: 跟新备注
 * @Version: 1.0
 */
public interface ContentService {
    public E3Result addContent(TbContent tbContent);

    public List<TbContent> queryContentByCid(Long cid);


}
