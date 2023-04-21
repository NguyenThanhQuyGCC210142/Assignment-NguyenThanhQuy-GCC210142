/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Thanh Quy
 */

public class Comic implements Serializable{
    private String ID, name,author, publis, img;
    private double price;

    public Comic(String ID, String name, String author, Double price, String publis){
    this.ID = ID;
    this.name = name;
    this.price = price;
    this.publis = publis;
    this.author = author;
    this.img = "";
}

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublis() {
        return publis;
    }

    public void setPublis(String publis) {
        this.publis = publis;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
   
    
}




