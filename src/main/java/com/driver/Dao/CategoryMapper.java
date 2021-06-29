package com.driver.Dao;

import com.driver.model.Category;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryMapper {
    Category getCategory(int id);
}
