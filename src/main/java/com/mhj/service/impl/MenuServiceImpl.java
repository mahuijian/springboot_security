package com.mhj.service.impl;

import com.mhj.dao.MenuDao;
import com.mhj.entity.Menu;
import com.mhj.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mahuijian
 * @since 2020/4/8 15:57
 */
@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuDao menuDao;

    @Override
    public List<Menu> findAllMenu() {
        List<Menu> menus = menuDao.findAll();
        if (menus.size() == 0) {
            return new ArrayList<>();
        }
        return menus;
    }
}
