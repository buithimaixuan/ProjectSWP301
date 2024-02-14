/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import DB.DBConnection;
import Models.order_status_history;
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
public class OrderStatusHistoryDAO {

    Connection conn;

    public OrderStatusHistoryDAO() {
        try {
            conn = DBConnection.connect();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(OrderStatusHistoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(OrderStatusHistoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public LinkedList<order_status_history> getAllOrderStatus() {
        LinkedList<order_status_history> orderStatusList = new LinkedList<>();
        String sql = "select * from [order_status_history]";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                order_status_history ods = new order_status_history(rs.getInt("o_id"), rs.getInt("staff_id"), rs.getString("status"), rs.getDate("create_date"));
                orderStatusList.add(ods);
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrderStatusHistoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return orderStatusList;
    }

    public order_status_history getOrderStatusByID(int o_id) {
        order_status_history obj = null;
        try {
            PreparedStatement ps = conn.prepareStatement("select * from [order_status_history] where o_id=?");
            ps.setInt(1, o_id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                obj = new order_status_history(rs.getInt("o_id"), rs.getInt("staff_id"), rs.getString("status"), rs.getDate("create_date"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrderStatusHistoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }

    public int addOrderStatus(order_status_history obj) {
        int count = 0;
        try {
            PreparedStatement ps = conn.prepareStatement("insert into [order_status_history] values(?, ?, ?, ?)");
            ps.setInt(1, obj.getO_id());
            ps.setInt(2, obj.getStaff_id());
            ps.setString(3, obj.getStatus());
            ps.setDate(4, obj.getCreate_date());
            count = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(OrderStatusHistoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }

    public int editOrderStatus(int o_id, order_status_history obj) {
        int count = 0;
        try {
            PreparedStatement ps = conn.prepareStatement("update [order_status_history] set status=?, create_date=? where o_id=?");
            ps.setString(1, obj.getStatus());
            ps.setDate(2, obj.getCreate_date());
            ps.setInt(3, o_id);
            count = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(OrderStatusHistoryDAO.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(OrderStatusHistoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }
}
