/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import DB.DBConnection;
import Models.orders;
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
public class OrdersDAO {

    Connection conn;

    public OrdersDAO() {
        try {
            conn = DBConnection.connect();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(OrdersDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(OrdersDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public LinkedList<orders> getAllOrders() {
        LinkedList<orders> orderList = new LinkedList<>();
        String sql = "select * from [orders]";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                orders ord = new orders(rs.getInt("o_id"), rs.getInt("cus_id"),
                        rs.getString("image_payment"), rs.getString("address"), rs.getString("status"), rs.getDate("o_date"),
                        rs.getLong("total_price"), rs.getInt("isDelete"));
                orderList.add(ord);
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrdersDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return orderList;
    }

    public orders getOrderByID(int o_id) {
        orders obj = null;
        try {
            PreparedStatement ps = conn.prepareStatement("select * from [orders] where o_id=?");
            ps.setInt(1, o_id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                obj = new orders(rs.getInt("o_id"), rs.getInt("cus_id"),
                        rs.getString("image_payment"), rs.getString("address"), rs.getString("status"), rs.getDate("o_date"),
                        rs.getLong("total_price"), rs.getInt("isDelete"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrdersDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }

    public int addOrder(orders obj) {
        int count = 0;
        try {
            PreparedStatement ps = conn.prepareStatement("Insert into [orders] values(?, ?, ?, ?, ?, ?, ?, ?)");
            ps.setInt(1, obj.getO_id());
            ps.setInt(2, obj.getCus_id());
            ps.setString(3, obj.getImage_payment());
            ps.setString(4, obj.getAddress());
            ps.setString(5, obj.getStatus());
            ps.setDate(6, obj.getO_date());
            ps.setLong(7, obj.getTotal_price());
            ps.setInt(8, obj.getIsDelete());
            count = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(OrdersDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }

    public int editOrder(int o_id, orders obj) {
        int count = 0;
        try {
            PreparedStatement ps = conn.prepareStatement("update [orders] set image_payment=?, address=?, status=?, o_date=?. total_price=?, isDelete=? where o_id=?");
            ps.setString(1, obj.getImage_payment());
            ps.setString(2, obj.getAddress());
            ps.setString(3, obj.getStatus());
            ps.setDate(4, obj.getO_date());
            ps.setLong(5, obj.getTotal_price());
            ps.setInt(6, obj.getIsDelete());
            ps.setInt(7, o_id);
            count = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(OrdersDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }

    public int deleteOrder(int o_id) {
        int count = 0;
        try {
            PreparedStatement ps = conn.prepareStatement("delete from [orders] where o_id=?");
            ps.setInt(1, o_id);
            count = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(OrdersDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }
}
