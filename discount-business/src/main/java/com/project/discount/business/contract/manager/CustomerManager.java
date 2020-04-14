package com.project.discount.business.contract.manager;

import com.project.discount.model.bean.customer.Customer;
import com.project.discount.model.exception.NotFoundException;

import java.util.List;

public interface CustomerManager {
    /**
     * Return the request customer
     * @param pId the Customer id
     * @return the {@link Customer}
     * @throws NotFoundException if Customer is not found
     */
    Customer getCustomer(Integer pId) throws NotFoundException;

    /**
     * Return list of {@link Customer}
     * @return list
     */
    List<Customer> getListCustomer();
}
