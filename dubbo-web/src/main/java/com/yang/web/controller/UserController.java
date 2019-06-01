package com.yang.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yang.interfaces.DTO.UserDTO;
import com.yang.interfaces.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Reference
    private UserService userService;

    @GetMapping("test")
    public UserDTO getUserInfo() {
        UserDTO userInfo = userService.getUserInfo();
        if (userInfo == null) {
            return null;
        }
        return userInfo;
    }
}
