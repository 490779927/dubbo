package com.yang.service.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.yang.interfaces.DTO.UserDTO;
import com.yang.interfaces.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public UserDTO getUserInfo() {
        UserDTO userDTO = new UserDTO();
        userDTO.setAge(23);
        userDTO.setName("yang");
        return userDTO;
    }
}
