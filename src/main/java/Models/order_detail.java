/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author PC
 */
public class order_detail {
    private int o_id;
    private int pro_id;
    private int quantity;

    public order_detail() {
    }

    public order_detail(int o_id, int pro_id, int quantity) {
        this.o_id = o_id;
        this.pro_id = pro_id;
        this.quantity = quantity;
    }

    public int getO_id() {
        return o_id;
    }

    public int getPro_id() {
        return pro_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setO_id(int o_id) {
        this.o_id = o_id;
    }

    public void setPro_id(int pro_id) {
        this.pro_id = pro_id;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
