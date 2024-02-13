/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import DB.DBConnection;
import Models.OrderStatus;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class OrderStatusDAO {
    Connection conn;
    
    public OrderStatusDAO(){
        try {
            conn = DBConnection.connect();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(OrderStatusDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(OrderStatusDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public LinkedList<OrderStatus> getAllOrderStatus(){
        LinkedList<OrderStatus> orderStatusList = new LinkedList<>();
        String sql = "select * from [order_status_history]";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {  
                OrderStatus ods = new OrderStatus(rs.getInt("o_id"), rs.getInt("staff_id"), rs.getString("status"), rs.getDate("create_date"));
                orderStatusList.add(ods);
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrderStatusDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return orderStatusList;
    }
    
    public OrderStatus getOrderStatusByID(int o_id){
        OrderStatus obj = null;
        try {
            PreparedStatement ps = conn.prepareStatement("select * from [order_status_history] where o_id=?");
            ps.setInt(1, o_id);
            ps.executeQuery();
            } catch (SQLException ex) {
            Logger.getLogger(OrderStatusDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }
    
    public int addOrderStatus(OrderStatus obj){
        int count = 0;
        try {
            PreparedStatement ps = conn.prepareStatement("insert into [order_status_history] values(?, ?, ?, ?)");
            ps.setInt(1, obj.getO_id());
            ps.setInt(2, obj.getStaff_id());
            ps.setString(3, obj.getStatus());
            ps.setDate(4, obj.getCreateODate());
            count = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(OrderStatusDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }
    
    public int editOrderStatus(int o_id, OrderStatus obj){
        int count = 0;
        try {
            PreparedStatement ps = conn.prepareStatement("update [order_status_history] set status=?, create_date=? where o_id=?");
            ps.setString(1, obj.getStatus());
            ps.setDate(2, obj.getCreateODate());
            ps.setInt(3, o_id);
            count = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(OrderStatusDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }
    
    public int deleteOrderStatus(int o_id) {
        int count = 0;
        try {
            PreparedStatement ps = conn.prepareStatement("delete from [order_status_history] where o_id=?");
            ps.setInt(1, o_id);
            count = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(OrderStatusDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (count > 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
