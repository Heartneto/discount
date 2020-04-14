package com.project.discount.business.impl;

import com.project.discount.business.contract.CategoriesManager;
import com.project.discount.business.contract.CustomerManager;

public class ManagerFactory {
    private CustomerManager vCustomerManager;
    private CategoriesManager vCategoriesManager;

    // ==== Getters/Setters ====
    public CustomerManager getCustomerManager(){
        return vCustomerManager;
    }

    public void setCustomerManager(CustomerManager pCustomerManager){
        vCustomerManager = pCustomerManager;
    }

    public CategoriesManager getCategoriesManager(){
        return vCategoriesManager;
    }
    public  void setCategoriesManager(CategoriesManager pCategoriesManager){
        vCategoriesManager = pCategoriesManager;
    }
}
