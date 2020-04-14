package com.project.discount.model.bean.categories;

public class Categories {
    private Integer id;
    private String label;

    /**
     * Default Constructor
     */
    public Categories() {
    }

    /**
     * Constructor
     * @param pId
     */
    public Categories(int pId) {
        this.id = pId;
    }

    // ===== Getters/Setters =====

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }


    // ==== Methods ====

    @Override
    public String toString() {
        return "Categories{" +
                "id=" + id +
                ", label='" + label + '\'' +
                '}';
    }
}
