package com.project.discount.model.bean.customer;

import com.project.discount.model.bean.categories.Categories;

public class CustomerCatInterest {
    private Customer customer;
    private Categories categories;

    /**
     * Default Constructor
     */
    public CustomerCatInterest() {
    }

    // ==== Getters/Setters ====

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Categories getCategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
    }

    // ==== Methods ====

    @Override
    public String toString() {
        return "CustomerCatInterest{" +
                "customer=" + customer +
                ", categories=" + categories +
                '}';
    }
}
