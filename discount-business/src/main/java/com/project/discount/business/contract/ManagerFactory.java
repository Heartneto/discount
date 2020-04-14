package com.project.discount.business.contract;

import com.project.discount.business.contract.manager.CategoriesManager;
import com.project.discount.business.contract.manager.CustomerManager;

public interface ManagerFactory {
    // ==== Getters/Setters ====
    CustomerManager getCustomerManager();

    void setCustomerManager(CustomerManager pCustomerManager);

    CategoriesManager getCategoriesManager();

    void setCategoriesManager(CategoriesManager pCategoriesManager);
}
