package org.spring.shoppingbackend.dao;

import org.spring.shoppingbackend.dto.Category;
import org.springframework.context.annotation.Bean;

import java.util.List;

public interface CategoryDAO {

    List<Category> list();
    Category get(int id);

}
