package com.project.discount.business.impl;

import com.project.discount.business.contract.ManagerFactory;
import com.project.discount.business.contract.manager.CategoriesManager;
import com.project.discount.business.contract.manager.CustomerManager;

public class ManagerFactoryImpl implements ManagerFactory {
    private CustomerManager vCustomerManager;
    private CategoriesManager vCategoriesManager;

    // ==== Getters/Setters ====
    @Override
    public CustomerManager getCustomerManager(){
        return vCustomerManager;
    }

    @Override
    public void setCustomerManager(CustomerManager pCustomerManager){
        vCustomerManager = pCustomerManager;
    }

    @Override
    public CategoriesManager getCategoriesManager(){
        return vCategoriesManager;
    }
    @Override
    public  void setCategoriesManager(CategoriesManager pCategoriesManager){
        vCategoriesManager = pCategoriesManager;
    }
}
