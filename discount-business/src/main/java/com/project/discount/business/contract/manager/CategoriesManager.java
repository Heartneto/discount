package com.project.discount.business.contract.manager;

import com.project.discount.model.bean.categories.Categories;
import com.project.discount.model.exception.NotFoundException;

import java.util.List;

public interface CategoriesManager {
    /**
     * Return the request categories
     * @param pId the Categories id
     * @return the {@link Categories}
     * @throws NotFoundException if Categories is not found
     */
    Categories getCategories(Integer pId) throws NotFoundException;

    /**
     * Return list of {@link Categories}
     * @return list
     */
    List<Categories> getListCategories();
}
