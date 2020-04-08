package com.mhj.controller;

import com.mhj.entity.Menu;
import com.mhj.service.MenuService;
import com.mhj.util.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author mahuijian
 * @since 2020/4/8 15:59
 */
@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @GetMapping("/getMenus")
    public ResponseObject<List<Menu>> getMenus() {
        return ResponseObject.success(menuService.findAllMenu());
    }
}
