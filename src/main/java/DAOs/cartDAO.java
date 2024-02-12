/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;
import Models.cart;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

/**
 *
 * @author Vu MInh Uyen
 */
public class cartDAO {

    public class CartDAO {

        private Connection connection;

        public CartDAO(Connection connection) {
            this.connection = connection;
        }

        public cart getCartById(int cartID) throws SQLException {
            String query = "SELECT * FROM cart WHERE cart_id = ?";
            try ( PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setInt(1, cartID);
                try ( ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        cart cart = new cart();
                        cart.setCart_id(resultSet.getInt("cart_id"));
                        cart.setCus_id(resultSet.getInt("cus_id"));
                        cart.setPro_id(resultSet.getInt("pro_id"));
                        cart.setPro_quantity(resultSet.getInt("pro_quantity"));
                        cart.setCart_price(resultSet.getInt("cart_price"));
                        return cart;
                    }
                }
            }
            return null; // không tìm thấy giỏ hàng với id tương ứng
        }

        public LinkedList<cart> getAllCarts() throws SQLException {
            LinkedList<cart> carts = new LinkedList<>();
            String query = "SELECT * FROM cart";
            try ( Statement statement = connection.createStatement();  ResultSet resultSet = statement.executeQuery(query)) {
                while (resultSet.next()) {
                    cart cart = new cart();
                    cart.setCart_id(resultSet.getInt("cart_id"));
                    cart.setCus_id(resultSet.getInt("cus_id"));
                    cart.setPro_id(resultSet.getInt("pro_id"));
                    cart.setPro_quantity(resultSet.getInt("pro_quantity"));
                    cart.setCart_price(resultSet.getInt("cart_price"));
                    carts.add(cart);
                }
            }
            return carts;
        }

        public void editCart(int cartID, cart cart) throws SQLException {
            String query = "UPDATE cart SET cus_id = ?, pro_id = ?, pro_quantity = ?, cart_price = ? WHERE cart_id = ?";
            try ( PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setInt(1, cart.getCus_id());
                statement.setInt(2, cart.getPro_id());
                statement.setInt(3, cart.getPro_quantity());
                statement.setLong(4, cart.getCart_price());
                statement.setInt(5, cartID);
                statement.executeUpdate();
            }
        }

 
        public int deleteCart(int cartID) throws SQLException {
            String query = "DELETE FROM cart WHERE cart_id = ?";
            try ( PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setInt(1, cartID);
                int deleteIs = statement.executeUpdate();
                if (deleteIs > 0) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }

        public void createCart(cart cart) throws SQLException {
            String query = "INSERT INTO cart (cart_id, cus_id, pro_id, pro_quantity, cart_price) VALUES (?, ?, ?, ?, ?)";
            try ( PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setInt(1, cart.getCart_id());
                statement.setInt(2, cart.getCus_id());
                statement.setInt(3, cart.getPro_id());
                statement.setInt(4, cart.getPro_quantity());
                statement.setLong(5, cart.getCart_price());
                statement.executeUpdate();
            }
        }
    }
}
