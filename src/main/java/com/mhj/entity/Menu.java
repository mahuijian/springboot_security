package com.mhj.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * @author mahuijian
 * @since 2020/4/8 15:34
 */
@Getter
@Setter
public class Menu {

    private Integer id;

    private Integer parentId;

    private String name;

    private Integer level;

    private Integer state;

    private Integer isDeleted;


}
