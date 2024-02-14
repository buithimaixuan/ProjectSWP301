/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import Models.Account;
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
public class AccountDAO {

    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;

    public AccountDAO() {
        try {
            conn = DB.DBConnection.connect();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Account getAccount(String us, String pass) {

        Account acc = null;
        String sql = "select * from account where username=? and password=?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, us);
            ps.setString(2, Utils.Hashing.getMd5(pass));
            rs = ps.executeQuery();
            if (rs.next()) {
                acc = new Account(rs.getInt("acc_id"), rs.getString("username"), rs.getString("password"),
                        rs.getString("fullname"), rs.getString("phone_number"), rs.getString("email"),
                        rs.getInt("code_reset"), rs.getInt("isDelete"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return acc;

    }

}
