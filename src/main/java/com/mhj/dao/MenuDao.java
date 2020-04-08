package com.mhj.dao;

import com.mhj.entity.Menu;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author mahuijian
 * @since 2020/4/8 15:49
 */
@Repository
public interface MenuDao {

    List<Menu> findAll();
}
