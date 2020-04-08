package com.mhj.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * @author mahuijian
 * @since 2020/4/8 15:30
 */
@Getter
@Setter
public class User {

    private Integer id;

    private Integer orgId;

    private String userName;

    private String password;

    private String salt;

    private String email;

    private String phone;

    private String address;

    private Integer state;
}
