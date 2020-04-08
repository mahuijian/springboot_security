package com.mhj.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * @author mahuijian
 * @since 2020/4/8 15:39
 */
@Getter
@Setter
public class Organization {

    private Integer id;

    private Integer parentId;

    private String name;
}
