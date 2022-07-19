package com.example.recyclercardview.Models;

public class VerticalitemModels
{
    int image;
    String name,description,rate,price;

    public VerticalitemModels()
    {
    }

    public VerticalitemModels(int image, String name, String description, String rate, String price)
    {
        this.image = image;
        this.name=name;
        this.description = description;
        this.rate = rate;
        this.price = price;

    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

}
