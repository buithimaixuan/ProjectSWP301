/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import Models.product;
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
public class product_DAO {

    private Connection connection;

    public product getProById(int proID) throws SQLException {
        String query = "SELECT * FROM product WHERE pro_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, proID);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    product product = new product();
                    product.setPro_id(resultSet.getInt("pro_id"));
                    product.setCat_id(resultSet.getInt("cat_id"));
                    product.setPro_name(resultSet.getString("pro_name"));
                    product.setOrigin(resultSet.getString("origin"));
                    product.setBrand(resultSet.getString("brand"));
                    product.setMass(resultSet.getInt("mass"));
                    product.setIngredient(resultSet.getString("ingredient"));
                    product.setPro_quantity(resultSet.getInt("pro_quantity"));
                    product.setPro_price(resultSet.getInt("pro_price"));
                    product.setDiscount(resultSet.getInt("discount"));
                    product.setPro_description(resultSet.getString("pro_description"));
                    product.setCreate_date(resultSet.getDate("create_date"));
                    product.setIsDelete(resultSet.getInt("isDelete"));
                    return product;
                }
            }
        }
        return null; // Không tìm thấy sản phẩm với id tương ứng
    }

    public LinkedList<product> getAllPro() throws SQLException {
        LinkedList<product> products = new LinkedList<>();
        String query = "SELECT * FROM product";
        try (Statement statement = connection.createStatement(); ResultSet resultSet = statement.executeQuery(query)) {
            while (resultSet.next()) {
                product product = new product();
                product.setPro_id(resultSet.getInt("pro_id"));
                product.setCat_id(resultSet.getInt("cat_id"));
                product.setPro_name(resultSet.getString("pro_name"));
                product.setOrigin(resultSet.getString("origin"));
                product.setBrand(resultSet.getString("brand"));
                product.setMass(resultSet.getInt("mass"));
                product.setIngredient(resultSet.getString("ingredient"));
                product.setPro_quantity(resultSet.getInt("pro_quantity"));
                product.setPro_price(resultSet.getInt("pro_price"));
                product.setDiscount(resultSet.getInt("discount"));
                product.setPro_description(resultSet.getString("pro_description"));
                product.setCreate_date(resultSet.getDate("create_date"));
                product.setIsDelete(resultSet.getInt("isDelete"));
                products.add(product);
            }
        }
        return products;
    }

    public void editPro(int proID, product product) throws SQLException {
        String query = "UPDATE product SET cat_id = ?, pro_name = ?, origin = ?, brand = ?, mass = ?, ingredient = ?, pro_quantity = ?, pro_price = ?, discount = ?, pro_description = ?, create_date = ?, isDelete = ? WHERE pro_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, product.getCat_id());
            statement.setString(2, product.getPro_name());
            statement.setString(3, product.getOrigin());
            statement.setString(4, product.getBrand());
            statement.setLong(5, product.getMass());
            statement.setString(6, product.getIngredient());
            statement.setInt(7, product.getPro_quantity());
            statement.setLong(8, product.getPro_price());
            statement.setLong(9, product.getDiscount());
            statement.setString(10, product.getPro_description());
            statement.setDate(11, (Date) product.getCreate_date());
            statement.setInt(12, product.getIsDelete());
            statement.setInt(13, proID);
            statement.executeUpdate();
        }
    }

    public void deletePro(int proID) throws SQLException {
        String query = "DELETE FROM product WHERE pro_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, proID);
            statement.executeUpdate();
        }
    }

    public int deleteCart(int cartID) throws SQLException {
        String query = "DELETE FROM product WHERE pro_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, cartID);
            int deleteIs = statement.executeUpdate();
            if (deleteIs > 0) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    public void createPro(product product) throws SQLException {
        String query = "INSERT INTO product (pro_id, cat_id, pro_name, origin, brand, mass, ingredient, pro_quantity, pro_price, discount, pro_description, create_date, isDelete) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, product.getPro_id());
            statement.setInt(2, product.getCat_id());
            statement.setString(3, product.getPro_name());
            statement.setString(4, product.getOrigin());
            statement.setString(5, product.getBrand());
            statement.setLong(6, product.getMass());
            statement.setString(7, product.getIngredient());
            statement.setInt(8, product.getPro_quantity());
            statement.setLong(9, product.getPro_price());
            statement.setLong(10, product.getDiscount());
            statement.setString(11, product.getPro_description());
            statement.setDate(12, (Date) product.getCreate_date());
            statement.setInt(13, product.getIsDelete());
            statement.executeUpdate();
        }
    }
}
