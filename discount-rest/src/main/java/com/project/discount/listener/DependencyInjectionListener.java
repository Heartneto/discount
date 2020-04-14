package com.project.discount.listener;

import com.project.discount.business.impl.ManagerFactory;
import com.project.discount.business.impl.manager.CategoriesManagerImpl;
import com.project.discount.business.impl.manager.CustomerManagerImpl;
import com.project.discount.rest.resource.AbstractResource;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class DependencyInjectionListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        // Create Instance of ManagerFactory
        ManagerFactory vManagerFactory = new ManagerFactory();

        // Inject instance of CustomerManager in ManagerFactory
        vManagerFactory.setCustomerManager(new CustomerManagerImpl());
        //Inject instance of CategoriesManager in ManagerFactory
        vManagerFactory.setCategoriesManager(new CategoriesManagerImpl());
        // Inject instance of ManagerFactory in AbstractResource
        AbstractResource.setManagerFactory(vManagerFactory);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
