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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vu MInh Uyen
 */
public class ProductDAO {

    private Connection connection;
    private PreparedStatement ps;
    private ResultSet rs;

    public ProductDAO() {
        try {
            connection = DB.DBConnection.connect();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

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

//    public LinkedList<Product> getAllPro() throws SQLException {
//        LinkedList<Product> products = new LinkedList<>();
//        String query = "SELECT * FROM product";
//        try ( Statement statement = connection.createStatement();  ResultSet resultSet = statement.executeQuery(query)) {
//            while (resultSet.next()) {
//                Product product = new Product();
//                product.setPro_id(resultSet.getInt("pro_id"));
//                product.setCat_id(resultSet.getInt("cat_id"));
//                product.setPro_name(resultSet.getString("pro_name"));
//                product.setOrigin(resultSet.getString("origin"));
//                product.setBrand(resultSet.getString("brand"));
//                product.setMass(resultSet.getDouble("mass"));
//                product.setIngredient(resultSet.getString("ingredient"));
//                product.setPro_quantity(resultSet.getInt("pro_quantity"));
//                product.setPro_price(resultSet.getDouble("pro_price"));
//                product.setDiscount(resultSet.getDouble("discount"));
//                product.setPro_description(resultSet.getString("pro_description"));
//                product.setCreate_date(resultSet.getDate("create_date"));
//                product.setIsDelete(resultSet.getInt("isDelete"));
//                products.add(product);
//            }
//        }
//        return products;
//    }
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

    /**
     *
     * @param cat_name
     * @return linkedlist<Product>
     * show all product of cat name ex: all product of cat name = Bot lam banh
     */
    public LinkedList<Product> getListProByCatName(String cat_name) {
        LinkedList<Product> list = new LinkedList<>();
        String sql = "SELECT *\n"
                + "FROM product\n"
                + "INNER JOIN categories ON product.cat_id = categories.cat_id\n"
                + "WHERE categories.cat_name = ? and isDelete=0;";
        try {

            ps = connection.prepareStatement(sql);
            ps.setString(1, cat_name);
            rs = ps.executeQuery();
            while (rs.next()) {
                Product pro = new Product(rs.getInt("pro_id"),
                        rs.getInt("cat_id"), rs.getString("pro_name"), rs.getString("pro_image"),
                        rs.getString("origin"), rs.getString("brand"),
                        rs.getDouble("mass"), rs.getString("ingredient"),
                        rs.getInt("pro_quantity"), rs.getDouble("pro_price"),
                        rs.getDouble("discount"),
                        rs.getNString("pro_description"), rs.getDate("create_date"),
                        rs.getInt("isDelete"));
                list.add(pro);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

    /**
     * show all product at link 'danh muc san pham'
     *
     * @return
     */
    public LinkedList<Product> getAllPro() {
        LinkedList<Product> list = new LinkedList<>();
        String sql = "select * from product where isDelete=0";
        try {

            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Product pro = new Product(rs.getInt("pro_id"),
                        rs.getInt("cat_id"), rs.getString("pro_name"), rs.getString("pro_image"),
                        rs.getString("origin"), rs.getString("brand"),
                        rs.getDouble("mass"), rs.getString("ingredient"),
                        rs.getInt("pro_quantity"), rs.getDouble("pro_price"),
                        rs.getDouble("discount"),
                        rs.getNString("pro_description"), rs.getDate("create_date"),
                        rs.getInt("isDelete"));
                list.add(pro);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

    /**
     *
     * @return
     */
    public int getTotalPro() {
        int count = 0;
        String sql = "select COUNT(*) from product where isDelete=0";
        try {

            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                count = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return count;
    }

    /**
     *
     * @param typeCategories
     * @return
     */
    public int getTotalProByTypeCategories(String typeCategories) {
        int count = 0;
        String sql = "SELECT count(*)\n"
                + "FROM product\n"
                + "INNER JOIN categories ON product.cat_id = categories.cat_id\n"
                + "WHERE typeCategories=? and isDelete=0;";
        try {

            ps = connection.prepareStatement(sql);
            ps.setString(1, typeCategories);
            rs = ps.executeQuery();
            if (rs.next()) {
                count = rs.getInt(1);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return count;
    }

    /**
     *
     * @param index
     * @return
     */
    public LinkedList<Product> pagingAllPro(int index) {
        LinkedList<Product> list = new LinkedList<>();
        String sql = "select * from product where isDelete=0\n"
                + "order by pro_id\n"
                + "offset ? rows fetch next 16 rows only";

        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, (index - 1) * 16);
            rs = ps.executeQuery();
            while (rs.next()) {
                Product pro = new Product(rs.getInt("pro_id"),
                        rs.getInt("cat_id"), rs.getString("pro_name"), rs.getString("pro_image"),
                        rs.getString("origin"), rs.getString("brand"),
                        rs.getDouble("mass"), rs.getString("ingredient"),
                        rs.getInt("pro_quantity"), rs.getDouble("pro_price"),
                        rs.getDouble("discount"),
                        rs.getNString("pro_description"), rs.getDate("create_date"),
                        rs.getInt("isDelete"));
                list.add(pro);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;

    }

    /**
     *
     * @param index
     * @return
     */
    public LinkedList<Product> pagingProByCategories(int index, String typeCategories) {
        LinkedList<Product> list = new LinkedList<>();

        String sql = "SELECT *\n"
                + "FROM product\n"
                + "INNER JOIN categories ON product.cat_id = categories.cat_id\n"
                + "WHERE categories.typeCategories = ? and isDelete=0\n"
                + "order by pro_id\n"
                + "offset ? rows fetch next 16 rows only";

        try {
            ps = connection.prepareStatement(sql);

            ps.setString(1, typeCategories);
            ps.setInt(2, (index - 1) * 16);
            rs = ps.executeQuery();
            while (rs.next()) {
                Product pro = new Product(rs.getInt("pro_id"),
                        rs.getInt("cat_id"), rs.getString("pro_name"), rs.getString("pro_image"),
                        rs.getString("origin"), rs.getString("brand"),
                        rs.getDouble("mass"), rs.getString("ingredient"),
                        rs.getInt("pro_quantity"), rs.getDouble("pro_price"),
                        rs.getDouble("discount"),
                        rs.getNString("pro_description"), rs.getDate("create_date"),
                        rs.getInt("isDelete"));
                list.add(pro);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;

    }

    /**
     *
     * @param cat_name
     * @return
     */
    public LinkedList<Product> get4ProByCatName(String cat_name) {
        LinkedList<Product> list = new LinkedList<>();
        String sql = "SELECT top 4*\n"
                + "FROM product\n"
                + "INNER JOIN categories ON product.cat_id = categories.cat_id\n"
                + "WHERE categories.cat_name = ?;";
        try {

            ps = connection.prepareStatement(sql);
            ps.setString(1, cat_name);
            rs = ps.executeQuery();
            while (rs.next()) {
                Product pro = new Product(rs.getInt("pro_id"),
                        rs.getInt("cat_id"), rs.getString("pro_name"), rs.getString("pro_image"),
                        rs.getString("origin"), rs.getString("brand"),
                        rs.getDouble("mass"), rs.getString("ingredient"),
                        rs.getInt("pro_quantity"), rs.getDouble("pro_price"),
                        rs.getDouble("discount"),
                        rs.getNString("pro_description"), rs.getDate("create_date"),
                        rs.getInt("isDelete"));
                list.add(pro);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

    /**
     *
     * @param typeCategories
     * @return
     */
    public LinkedList<Product> get4ProByTypeCategories(String typeCategories) {
        LinkedList<Product> list = new LinkedList<>();
        String sql = "SELECT top 4*\n"
                + "FROM product\n"
                + "INNER JOIN categories ON product.cat_id = categories.cat_id\n"
                + "WHERE typeCategories = ?;";
        try {

            ps = connection.prepareStatement(sql);
            ps.setString(1, typeCategories);
            rs = ps.executeQuery();
            while (rs.next()) {
                Product pro = new Product(rs.getInt("pro_id"),
                        rs.getInt("cat_id"), rs.getString("pro_name"), rs.getString("pro_image"),
                        rs.getString("origin"), rs.getString("brand"),
                        rs.getDouble("mass"), rs.getString("ingredient"),
                        rs.getInt("pro_quantity"), rs.getDouble("pro_price"),
                        rs.getDouble("discount"),
                        rs.getNString("pro_description"), rs.getDate("create_date"),
                        rs.getInt("isDelete"));
                list.add(pro);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

}
