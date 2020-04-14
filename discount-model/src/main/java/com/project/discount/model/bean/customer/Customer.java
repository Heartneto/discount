package com.project.discount.model.bean.customer;

public class Customer {
    private Integer id;
    private String name;
    private String address;
    private Integer mobile;
    private Boolean notification;
    private Boolean activation;
    private String uid;

    /**
     * Default Constructor
     */
    public Customer() {
    }

    /**
     * Constructor
     * @param pId
     */
    public Customer(Integer pId) {
        this.id = pId;
    }

    // ====== Getters/Setters ========


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getMobile() {
        return mobile;
    }

    public void setMobile(Integer mobile) {
        this.mobile = mobile;
    }

    public Boolean getNotification() {
        return notification;
    }

    public void setNotification(Boolean notification) {
        this.notification = notification;
    }

    public Boolean getActivation() {
        return activation;
    }

    public void setActivation(Boolean activation) {
        this.activation = activation;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    // ====== Methods ===========
    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", mobile=" + mobile +
                ", notification=" + notification +
                ", activation=" + activation +
                ", uid='" + uid + '\'' +
                '}';
    }
}
