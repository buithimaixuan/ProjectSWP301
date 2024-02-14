/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import Models.Categories;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dell
 */
public class CategoriesDAO {

    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;

    public CategoriesDAO() {
        try {
            conn = DB.DBConnection.connect();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CategoriesDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CategoriesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public LinkedList<Categories> getAllCat() {
        LinkedList<Categories> list = new LinkedList<>();
        String sql = "select * from categories";
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Categories cat = new Categories(rs.getInt("cat_id"), rs.getNString("cat_name"),
                        rs.getNString("typeCategories"), rs.getNString("cat_description"));
                System.out.println(cat.getCat_name());
                list.add(cat);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoriesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public LinkedList<String> get4CatName() {
        LinkedList<String> list = new LinkedList<>();
        String sql = "select distinct top 4 cat_name from categories";
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String name = rs.getNString("cat_name");
                list.add(name);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoriesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public LinkedList<String> getTypeCategoriesByCatName(String cat_name) {
        LinkedList<String> list = new LinkedList<>();
        String sql = "select typeCategories from categories\n"
                + "where cat_name=?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, cat_name);
            rs = ps.executeQuery();
            while (rs.next()) {
                String name = rs.getNString("typeCategories");
                list.add(name);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoriesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public static void main(String[] args) {
        CategoriesDAO dao = new CategoriesDAO();
        try {
            LinkedList<Categories> list = dao.getAllCat();
            LinkedList<String> listname = dao.get4CatName();
            if (!listname.isEmpty()) {
                System.out.println(listname.get(1));

            } else {
                System.out.println("null oi");
            }
        } catch (Exception e) {
        }

    }
}
