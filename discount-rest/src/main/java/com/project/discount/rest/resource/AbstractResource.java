package com.project.discount.rest.resource;

import com.project.discount.business.ManagerFactory;

public abstract class AbstractResource {
    private static ManagerFactory vManagerFactory;

    protected static ManagerFactory getManagerFactory(){
        return vManagerFactory;
    }

    public static void setManagerFactory(ManagerFactory pManagerFactory){
        vManagerFactory = pManagerFactory;
    }
}
