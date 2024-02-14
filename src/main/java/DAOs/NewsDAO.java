/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import DB.DBConnection;
import Models.News;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class NewsDAO {
    Connection conn;
    
    public NewsDAO(){
        try {
            conn = DBConnection.connect();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NewsDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(NewsDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public LinkedList<News> getAll(){
        LinkedList<News> list = new LinkedList<>();
        String sql = "Select * from news";
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                News news = new News(rs.getInt("news_id"), rs.getInt("staff_id"), rs.getString("title"), 
                        rs.getString("image_url"), rs.getString("title_content"), rs.getString("content1"), 
                        rs.getString("content2"), rs.getString("content3"), rs.getDate("create_date"), 
                        rs.getInt("isDelete"));
                list.add(news);
            }
        } catch (SQLException e) {
            Logger.getLogger(NewsDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return list;
    }
    
    public News getNews(int news_id){
        News news = null;
        String sql = "select * from news where idNew = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, news_id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                news = new News(rs.getInt("news_id"), rs.getInt("staff_id"), rs.getString("title"), 
                        rs.getString("image_url"), rs.getString("title_content"), rs.getString("content1"), 
                        rs.getString("content2"), rs.getString("content3"), rs.getDate("create_date"), 
                        rs.getInt("isDelete"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(NewsDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return news;
    }
    
    public LinkedList<News> getTop5News(){
        LinkedList<News> list = new LinkedList<>();
        String sql = "Select top 4 * from news order by create_date ASC";
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                News news = new News(rs.getInt("news_id"), rs.getInt("staff_id"), rs.getString("title"), 
                        rs.getString("image_url"), rs.getString("title_content"), rs.getString("content1"), 
                        rs.getString("content2"), rs.getString("content3"), rs.getDate("create_date"), 
                        rs.getInt("isDelete"));
                list.add(news);
            }
        } catch (SQLException e) {
            Logger.getLogger(NewsDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return list;
    }
}
