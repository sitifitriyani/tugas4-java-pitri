package com.tugas4.pitri.models;

public class Food {
    private Integer id;
    private String name;
    private Long price;
    private String size;

    public Food(Integer id, String name, Long price, String size){
        this.id=id;
        this.name=name;
        this.price=price;
        this.size=size;
    }
    public Food(){
        
    }

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

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

}
