/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;


import DB.DBConnection;
import Models.OrderDetail;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class OrderDetailDAO {
    Connection conn;

    public OrderDetailDAO(){
        try {
            conn = DBConnection.connect();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(OrderDetailDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(OrderDetailDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public LinkedList<OrderDetail> getAllOrderDetails() {
        LinkedList<OrderDetail> orderDetailList = new LinkedList<>();
        String sql = "select * from [order_detail]";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                OrderDetail odt = new OrderDetail(rs.getInt("o_id"), rs.getInt("pro_id"), rs.getInt("quantity"));
                orderDetailList.add(odt);
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrderDetailDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return orderDetailList;
    }

    public OrderDetail getOrderDetailByID(int o_id) {
        OrderDetail obj = null;
        try {
            PreparedStatement ps = conn.prepareStatement("select * from [order_detail] where o_id=?");
            ps.setInt(1, o_id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                obj = new OrderDetail(rs.getInt("o_id"), rs.getInt("pro_id"), rs.getInt("quantity"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrderDetailDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }

    public int addOrderDetail(OrderDetail obj) {
        int count = 0;
        try {
            PreparedStatement ps = conn.prepareStatement("insert into [order_detail] values(?, ?, ?)");
            ps.setInt(1, obj.getO_id());
            ps.setInt(2, obj.getPro_id());
            ps.setInt(3, obj.getQuantity());
            count = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(OrderDetailDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }

    public int editOrderDetail(int o_id, OrderDetail obj) {
        int count = 0;
        try {
            PreparedStatement ps = conn.prepareStatement("update [order_detail] set quantity=? where o_id=?");
            ps.setInt(1, obj.getQuantity());
            ps.setInt(2, o_id);
            count = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(OrderDetailDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }

    public int deleteOrderDetail(int o_id) {
        int count = 0;
        try {
            PreparedStatement ps = conn.prepareStatement("delete from [order_detail] where o_id=?");
            ps.setInt(1, o_id);
            count = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(OrderDetailDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }
}
