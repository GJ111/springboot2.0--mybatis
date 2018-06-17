package com.gj.bos_resopse.controller;

import com.gj.bos_resopse.dao.TbUserMapper;
import com.gj.bos_resopse.pojo.TbUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: GJ
 * @CreateDate: 2018/6/17 1:19
 * @Description: java类作用描述
 * @UpdateDate: 2018/6/17 1:19
 * @UpdateRemark: 跟新备注
 * @Version: 1.0
 */
@RestController
public class controller {
    @Autowired
    private TbUserMapper tbUserMapper;

    @RequestMapping("tuser")
    public TbUser tbUser() {
        TbUser tbUser =
                tbUserMapper.selectByPrimaryKey(Long.parseLong("1"));

        return tbUser;
    }
}
