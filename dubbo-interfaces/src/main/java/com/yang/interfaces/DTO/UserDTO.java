package com.yang.interfaces.DTO;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserDTO implements Serializable {
    private String name;
    private int Age;
}
