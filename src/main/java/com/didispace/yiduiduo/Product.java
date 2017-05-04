package com.didispace.yiduiduo;

/**
 * Created by lance017 on 2017/5/4.
 */
public class Product {

    private Integer id;

    private String name;

    private Integer brand_id;

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

    public Integer getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(Integer brand_id) {
        this.brand_id = brand_id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", brand_id=" + brand_id +
                '}';
    }
}
