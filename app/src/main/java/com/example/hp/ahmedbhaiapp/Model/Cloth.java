package com.example.hp.ahmedbhaiapp.Model;

/**
 * Created by hp on 6/15/2018.
 */

public class Cloth {
    private String name;
    private String size;
    private String color;
    private String fabric;
    private String price;
    private String image;

    public Cloth() {
    }

    public Cloth(String name, String size, String color, String fabric, String price, String image) {
        this.name = name;
        this.size = size;
        this.color = color;
        this.fabric = fabric;
        this.price = price;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFabric() {
        return fabric;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
