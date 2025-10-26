package com.example.ApiTest.Entity;

public class Dishes {

    private Integer Id;
    private String Name;
    private Double Price;
    private String Description;

    public Dishes(Integer Id, String Name, Double Price, String Description) {
       this.Id = Id;
       this.Name = Name;
       this.Price = Price;
       this.Description = Description;


    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }


}
