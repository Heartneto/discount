package com.project.discount.rest;

import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("/")
public class RestApplication extends ResourceConfig {
    /**
     * Default Constructor
     */
    public RestApplication(){
        packages("com.project.discount.rest");
    }
}
