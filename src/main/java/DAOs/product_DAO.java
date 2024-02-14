/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import Models.Product;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

/**
 *
 * @author Vu MInh Uyen
 */
public class Product_DAO {

    private Connection connection;

    public Product getProById(int proID) throws SQLException {
        String query = "SELECT * FROM product WHERE pro_id = ?";
        try ( PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, proID);
            try ( ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    Product product = new Product();
                    product.setPro_id(resultSet.getInt("pro_id"));
                    product.setCat_id(resultSet.getInt("cat_id"));
                    product.setPro_name(resultSet.getString("pro_name"));
                    product.setOrigin(resultSet.getString("origin"));
                    product.setBrand(resultSet.getString("brand"));
                    product.setMass(resultSet.getDouble("mass"));
                    product.setIngredient(resultSet.getString("ingredient"));
                    product.setPro_quantity(resultSet.getInt("pro_quantity"));
                    product.setPro_price(resultSet.getDouble("pro_price"));
                    product.setDiscount(resultSet.getDouble("discount"));
                    product.setPro_description(resultSet.getString("pro_description"));
                    product.setCreate_date(resultSet.getDate("create_date"));
                    product.setIsDelete(resultSet.getInt("isDelete"));
                    return product;
                }
            }
        }
        return null; // Không tìm thấy sản phẩm với id tương ứng
    }

    public LinkedList<Product> getAllPro() throws SQLException {
        LinkedList<Product> products = new LinkedList<>();
        String query = "SELECT * FROM product";
        try ( Statement statement = connection.createStatement();  ResultSet resultSet = statement.executeQuery(query)) {
            while (resultSet.next()) {
                Product product = new Product();
                product.setPro_id(resultSet.getInt("pro_id"));
                product.setCat_id(resultSet.getInt("cat_id"));
                product.setPro_name(resultSet.getString("pro_name"));
                product.setOrigin(resultSet.getString("origin"));
                product.setBrand(resultSet.getString("brand"));
                product.setMass(resultSet.getDouble("mass"));
                product.setIngredient(resultSet.getString("ingredient"));
                product.setPro_quantity(resultSet.getInt("pro_quantity"));
                product.setPro_price(resultSet.getDouble("pro_price"));
                product.setDiscount(resultSet.getDouble("discount"));
                product.setPro_description(resultSet.getString("pro_description"));
                product.setCreate_date(resultSet.getDate("create_date"));
                product.setIsDelete(resultSet.getInt("isDelete"));
                products.add(product);
            }
        }
        return products;
    }

    public int editPro(int proID, Product product) throws SQLException {
        String query = "UPDATE product SET cat_id = ?, pro_name = ?, origin = ?, brand = ?, mass = ?, ingredient = ?, pro_quantity = ?, pro_price = ?, discount = ?, pro_description = ?, create_date = ?, isDelete = ? WHERE pro_id = ?";
        try ( PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, product.getCat_id());
            statement.setString(2, product.getPro_name());
            statement.setString(3, product.getOrigin());
            statement.setString(4, product.getBrand());
            statement.setDouble(5, product.getMass());
            statement.setString(6, product.getIngredient());
            statement.setInt(7, product.getPro_quantity());
            statement.setDouble(8, product.getPro_price());
            statement.setDouble(9, product.getDiscount());
            statement.setString(10, product.getPro_description());
            statement.setDate(11, (Date) product.getCreate_date());
            statement.setInt(12, product.getIsDelete());
            statement.setInt(13, proID);
//            statement.executeUpdate();
            int deleteIs = statement.executeUpdate();
            return deleteIs;
        }
    }

    public int deletePro(int proID) throws SQLException {
        String query = "DELETE FROM product WHERE pro_id = ?";
        try ( PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, proID);
       int deleteIs = statement.executeUpdate();
            return deleteIs;
        }
    }



    public int createPro(Product product) throws SQLException {
        String query = "INSERT INTO product (pro_id, cat_id, pro_name, origin, brand, mass, ingredient, pro_quantity, pro_price, discount, pro_description, create_date, isDelete) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try ( PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, product.getPro_id());
            statement.setInt(2, product.getCat_id());
            statement.setString(3, product.getPro_name());
            statement.setString(4, product.getOrigin());
            statement.setString(5, product.getBrand());
            statement.setDouble(6, product.getMass());
            statement.setString(7, product.getIngredient());
            statement.setInt(8, product.getPro_quantity());
            statement.setDouble(9, product.getPro_price());
            statement.setDouble(10, product.getDiscount());
            statement.setString(11, product.getPro_description());
            statement.setDate(12, (Date) product.getCreate_date());
            statement.setInt(13, product.getIsDelete());
//            statement.executeUpdate();
            int deleteIs = statement.executeUpdate();
            return deleteIs;
        }
    }
}
