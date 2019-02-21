package com.xinhuanet.controller;

import com.xinhuanet.entity.NameOrder;
import com.xinhuanet.service.NameOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController    // 包含@Controller与ResponseBody
@RequestMapping("/nameorder")
public class NameOrderController {

    @Autowired
    private NameOrderService nameOrderService;

    @RequestMapping("/findOne")
    public NameOrder hello(Long id) {
        return nameOrderService.get(id);
    }

}
