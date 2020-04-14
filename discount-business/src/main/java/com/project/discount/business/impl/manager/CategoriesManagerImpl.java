package com.project.discount.business.impl.manager;

import com.project.discount.business.contract.manager.CategoriesManager;
import com.project.discount.model.bean.categories.Categories;
import com.project.discount.model.exception.NotFoundException;

import java.util.ArrayList;
import java.util.List;

public class CategoriesManagerImpl implements CategoriesManager {
    @Override
    public Categories getCategories(Integer pId) throws NotFoundException{
        if (pId < 1){
            throw new NotFoundException("Customer no found : ID = " + pId);
        }
        Categories vCategories = new Categories(pId);
        vCategories.setLabel("Customer n°" + pId);
        return vCategories;
    }

    @Override
    public List<Categories> getListCategories(){
        List<Categories> vList = new ArrayList<>();
        for (int i = 0; i < 9; i++){
            Categories vCategories = new Categories(i);
            vCategories.setLabel("Customer n°" + i);
        }
        return vList;
    }
}
