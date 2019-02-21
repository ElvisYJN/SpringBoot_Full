package com.xinhuanet.service.impl;

import com.xinhuanet.entity.Login;
import com.xinhuanet.mapper.LoginMapper;
import com.xinhuanet.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginMapper loginMapper;

    @Override
    public Login get(Long id) {
        return loginMapper.get(id);
    }
}
