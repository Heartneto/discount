package com.project.discount.rest.resource.customer;

import com.project.discount.business.contract.manager.CustomerManager;
import com.project.discount.model.bean.customer.Customer;
import com.project.discount.model.exception.NotFoundException;
import com.project.discount.rest.resource.AbstractResource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Resource REST for the {@link Customer}
 */
@Path("/customers")
@Produces(MediaType.APPLICATION_JSON)
public class CustomerResource extends AbstractResource {
    /**
     * Return the {@link Customer} identified by {@code pId}
     * @param pId id of {@link Customer}
     * @return the {@link Customer}
     * @throws NotFoundException if the {@link Customer} isn't found
     */
    @GET
    @Path("{id}")
    public Customer get(@PathParam("id") Integer pId) throws NotFoundException{
        CustomerManager vCustomerManager = getManagerFactory().getCustomerManager();
        Customer vCustomer = vCustomerManager.getCustomer(pId);
        return vCustomer;
    }

    /**
     * Return All the {@link Customer}
     * @return List
     */
    @GET
    public List<Customer> get(){
        CustomerManager vCustomerManager = getManagerFactory().getCustomerManager();
        List<Customer> vListCustomer = vCustomerManager.getListCustomer();
        return vListCustomer;
    }
}
