package com.driver.service;

import com.driver.Dao.CategoryMapper;
import com.driver.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceTest {
    @Autowired
    CategoryMapper categoryMapper;

    public Category getCategory(int id){
        return categoryMapper.getCategory(id);
    }
}
