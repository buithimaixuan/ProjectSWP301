/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import Models.Staff;
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
public class StaffDAO {

    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;

    public StaffDAO() {
        try {
            conn = DB.DBConnection.connect();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StaffDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(StaffDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public Staff getStaff(int acc_id){
        Staff Staff = null;
        String sql = "select * from staff where acc_id=?";
         try {
             ps = conn.prepareStatement(sql);
             ps.setInt(1, acc_id);
             rs = ps.executeQuery();
             if(rs.next()){
                 Staff = new Staff(rs.getInt("staff_id"), rs.getInt("acc_id"), rs.getString("username"), rs.getString("password"),
                        rs.getString("fullname"), rs.getString("phone_number"), rs.getString("email"),
                         rs.getDate("birthday"),rs.getString("gender"),rs.getString("address"),
                         rs.getString("position"),rs.getDate("begin_work"),rs.getDate("end_work"),rs.getInt("code_reset"), rs.getInt("isDelete"));
             }
         } catch (SQLException ex) {
             Logger.getLogger(StaffDAO.class.getName()).log(Level.SEVERE, null, ex);
         }
        
        return Staff;
    }

}
