/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import Models.Customer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dell
 */
public class CustomerDAO {
     private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;

    public CustomerDAO() {
         try {
             conn = DB.DBConnection.connect();
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    public Customer getCustomer(int acc_id){
        Customer cus = null;
        String sql = "select * from customer where acc_id=?";
         try {
             ps = conn.prepareStatement(sql);
             ps.setInt(1, acc_id);
             rs = ps.executeQuery();
             if(rs.next()){
                 cus = new Customer(rs.getInt("cus_id"), rs.getInt("acc_id"),
                         rs.getString("username"), rs.getString("password"), 
                         rs.getString("fullname"), rs.getString("avatar"), rs.getString("phone_number"), 
                         rs.getString("email"), rs.getInt("code_reset"), rs.getInt("isDelete"));
             }
         } catch (SQLException ex) {
             Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
         }
        
        return cus;
    }
    
    
}
