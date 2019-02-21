package com.xinhuanet.controller;

import com.xinhuanet.entity.Login;
import com.xinhuanet.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController    // 包含@Controller与ResponseBody
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("/findOne")
    public Login hello(Long id) {
        return loginService.get(id);
    }

}
