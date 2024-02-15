/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import Models.ProductImages;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author Vu MInh Uyen
 */
public class ProductImagesDAO {

    private Connection connection;

    public void addProductImage(ProductImages productImage) throws SQLException {
        String query = "INSERT INTO product_images (pro_img_id, pro_id, image_url) VALUES (?, ?, ?)";
        try ( PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, productImage.getPro_img_id());
            statement.setInt(2, productImage.getPro_id());
            statement.setString(3, productImage.getImage_url());
            statement.executeUpdate();
        }
    }

    public LinkedList<ProductImages> getProductImagesByProductId(int productId) throws SQLException {
        LinkedList<ProductImages> productImages = new LinkedList<>();
        String query = "SELECT * FROM product_images WHERE pro_id = ?";
        try ( PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, productId);
            try ( ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    ProductImages productImage = new ProductImages();
                    productImage.setPro_img_id(resultSet.getInt("pro_img_id"));
                    productImage.setPro_id(resultSet.getInt("pro_id"));
                    productImage.setImage_url(resultSet.getString("image_url"));
                    productImages.add(productImage);
                }
            }
        }
        return productImages;
    }

    public int deleteProductImageByProductId(int productId) throws SQLException {
        String query = "DELETE FROM product_images WHERE pro_id = ?";
        try ( PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, productId);
            int deleteIs = statement.executeUpdate();
            if (deleteIs > 0) {     
                return 1;
            } else     {         
                return 0;
            }
        }
    }
}
