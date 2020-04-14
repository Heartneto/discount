package com.project.discount.business.manager;

import com.project.discount.model.bean.categories.Categories;
import com.project.discount.model.exception.NotFoundException;

import java.util.ArrayList;
import java.util.List;

public class CategoriesManager {
    /**
     * Return the request categories
     * @param pId the Categories id
     * @return the {@link Categories}
     * @throws NotFoundException if Categories is not found
     */
    public Categories getCategories(Integer pId) throws NotFoundException{
        if (pId < 1){
            throw new NotFoundException("Customer no found : ID = " + pId);
        }
        Categories vCategories = new Categories(pId);
        vCategories.setLabel("Customer n°" + pId);
        return vCategories;
    }

    /**
     * Return list of {@link Categories}
     * @return list
     */
    public List<Categories> getListCategories(){
        List<Categories> vList = new ArrayList<>();
        for (int i = 0; i < 9; i++){
            Categories vCategories = new Categories(i);
            vCategories.setLabel("Customer n°" + i);
        }
        return vList;
    }
}
