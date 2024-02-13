/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.sql.Date;

/**
 *
 * @author PC
 */
public class OrderStatus {
    private int o_id;
    private int staff_id;
    private String status;
    private Date createODate;

    public OrderStatus() {
    }

    public OrderStatus(int o_id, int staff_id, String status, Date createODate) {
        this.o_id = o_id;
        this.staff_id = staff_id;
        this.status = status;
        this.createODate = createODate;
    }

    public int getO_id() {
        return o_id;
    }

    public int getStaff_id() {
        return staff_id;
    }

    public String getStatus() {
        return status;
    }

    public Date getCreateODate() {
        return createODate;
    }

    public void setO_id(int o_id) {
        this.o_id = o_id;
    }

    public void setStaff_id(int staff_id) {
        this.staff_id = staff_id;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCreateODate(Date createODate) {
        this.createODate = createODate;
    }
    
    
}
