/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.Date;

/**
 *
 * @author Vu MInh Uyen
 */
public class Product {
    private int pro_id;
    private int cat_id;
    private String pro_name;
    private String pro_image;
    private String origin;
    private String brand;
    private double mass;
    private String ingredient;
    private int pro_quantity;
    private double pro_price;

    private double discount;
    private String pro_description;
    private Date create_date;
    private int isDelete;

    public Product() {
    }

    public Product(int pro_id, int cat_id, String pro_name, String pro_image, String origin, String brand, double mass, String ingredient, int pro_quantity, double pro_price, double discount, String pro_description, Date create_date, int isDelete) {
        this.pro_id = pro_id;
        this.cat_id = cat_id;
        this.pro_name = pro_name;
        this.pro_image = pro_image;
        this.origin = origin;
        this.brand = brand;
        this.mass = mass;
        this.ingredient = ingredient;
        this.pro_quantity = pro_quantity;
        this.pro_price = pro_price;
        this.discount = discount;
        this.pro_description = pro_description;
        this.create_date = create_date;
        this.isDelete = isDelete;
    }


    public int getPro_id() {
        return pro_id;
    }

    public void setPro_id(int pro_id) {
        this.pro_id = pro_id;
    }

    public int getCat_id() {
        return cat_id;
    }

    public void setCat_id(int cat_id) {
        this.cat_id = cat_id;
    }

    public String getPro_name() {
        return pro_name;
    }

    public void setPro_name(String pro_name) {
        this.pro_name = pro_name;
    }

    public String getPro_image() {
        return pro_image;
    }

    public void setPro_image(String pro_image) {
        this.pro_image = pro_image;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public int getPro_quantity() {
        return pro_quantity;
    }

    public void setPro_quantity(int pro_quantity) {
        this.pro_quantity = pro_quantity;
    }

    public double getPro_price() {
        return pro_price;
    }

    public void setPro_price(double pro_price) {
        this.pro_price = pro_price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getPro_description() {
        return pro_description;
    }

    public void setPro_description(String pro_description) {
        this.pro_description = pro_description;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }




}
