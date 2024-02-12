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
public class product {
    private int pro_id;
    private int cat_id;
    private String pro_name;
    private String origin;
    private String brand;
    private int mass;
    private String ingredient;
    private int pro_quantity;
    private int pro_price;

    private int discount;
    private String pro_description;
    private Date create_date;
    private int isDelete;

    public product() {
    }

    public product(int pro_id, int cat_id, String pro_name, String origin, String brand, int mass, String ingredient,
            int pro_quantity, int pro_price, int discount, String pro_description, Date create_date, int isDelete) {
        this.pro_id = pro_id;
        this.cat_id = cat_id;
        this.pro_name = pro_name;
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

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
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

    public int getPro_price() {
        return pro_price;
    }

    public void setPro_price(int pro_price) {
        this.pro_price = pro_price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
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
