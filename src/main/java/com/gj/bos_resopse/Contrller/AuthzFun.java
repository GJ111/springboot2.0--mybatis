package com.gj.bos_resopse.Contrller;

import com.gj.bos_resopse.dao.AuthFunctionMapper;
import com.gj.bos_resopse.entity.AuthFunction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthzFun {
    @Autowired
    private AuthFunctionMapper authFunctionMapper;

    @RequestMapping("authz")
    public AuthFunction authz() {
        AuthFunction authFunction = authFunctionMapper.selectByPrimaryKey("1");
        return authFunction;

    }
}
