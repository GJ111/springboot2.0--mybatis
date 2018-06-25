package com.gj.bos_resopse.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gj.bos_resopse.dao.TbUserMapper;
import com.gj.bos_resopse.pojo.TbUser;
import com.gj.bos_resopse.pojo.TbUserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @RequestMapping("tuser/{id}/page/{size}")
    public TbUser tbUser(@PathVariable("id") long id, @PathVariable("size") int size) {
        System.out.println(size + "Llllllllllllllll" + id);
        TbUser tbUser = tbUserMapper.selectByPrimaryKey(id);
        return tbUser;
    }
}
