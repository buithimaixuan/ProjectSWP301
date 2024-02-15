/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.sql.Date;

/**
 *
 * @author Admin
 */
public class Order {
    private int o_id;
    private int cus_id;
    private String image_payment;
    private String address;
    private String status;
    private Date o_date;
    private long total_price;
    private int isDelete;

    public Order() {
    }

    public Order(int o_id, int cus_id, String image_payment, String address, String status, Date o_date, long total_price, int isDelete) {
        this.o_id = o_id;
        this.cus_id = cus_id;
        this.image_payment = image_payment;
        this.address = address;
        this.status = status;
        this.o_date = o_date;
        this.total_price = total_price;
        this.isDelete = isDelete;
    }

    public int getO_id() {
        return o_id;
    }

    public void setO_id(int o_id) {
        this.o_id = o_id;
    }

    public int getCus_id() {
        return cus_id;
    }

    public void setCus_id(int cus_id) {
        this.cus_id = cus_id;
    }

    public String getImage_payment() {
        return image_payment;
    }

    public void setImage_payment(String image_payment) {
        this.image_payment = image_payment;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getO_date() {
        return o_date;
    }

    public void setO_date(Date o_date) {
        this.o_date = o_date;
    }

    public long getTotal_price() {
        return total_price;
    }

    public void setTotal_price(long total_price) {
        this.total_price = total_price;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }
    
    
}
