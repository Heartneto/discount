package com.project.discount.business.manager;

import com.project.discount.model.bean.customer.Customer;
import com.project.discount.model.exception.NotFoundException;

import java.util.ArrayList;
import java.util.List;

public class CustomerManager {

    /**
     * Return the request customer
     * @param pId the Customer id
     * @return the {@link Customer}
     * @throws NotFoundException if Customer is not found
     */
    public Customer getCustomer(Integer pId) throws NotFoundException{
        if (pId < 1){
            throw new NotFoundException("Customer no found : ID = " + pId);
        }
        Customer vCustomer = new Customer(pId);
        vCustomer.setName("Customer n°" + pId);
        return vCustomer;
    }

    /**
     * Return list of {@link Customer}
     * @return list
     */
    public List<Customer> getListCustomer(){
        List<Customer> vList = new ArrayList<>();
        for (int i = 0; i < 9; i++){
            Customer vCustomer = new Customer(i);
            vCustomer.setName("Customer n°" + i);
        }
        return vList;
    }
}
