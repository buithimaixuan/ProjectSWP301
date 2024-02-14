<%-- 
    Document   : cart
    Created on : Feb 13, 2024, 12:14:36 PM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.datatables.net/1.13.6/css/jquery.dataTables.min.css" />
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="headOfCart.jsp" %>
        <div class="container">
            <form method="post" class="form-inline container mt-3" action="OrderController"
                  onsubmit="return validateCheckBox()">
                <table id="example" class="display border border-2">
                    <thead>
                        <tr class="bg-info-subtle">
                            <th>Chọn mua</th>
                            <th>Mã sản phẩm</th>
                            <th>Sản phẩm</th>
                            <th>Đơn giá</th>
                            <th>Số lượng</th>
                            <th>Thành tiền</th>
                            <th>Cancel</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>
                                <input type="checkbox" name="checkbox" class="checkBuy">
                            </td>
                            <td>
                                1234
                            </td>

                            <td>
                                Bột làm bánh bao mikko 1kg
                            </td>
                            <td>
                                57.000
                            </td>
                            <td class="w-25">
                                <div class="form-group d-flex justify-content-between">
                                    <a class="btn btn-sm btn-decre" href="#"><i class="fas fa-minus-square"></i></a>
                                    <input type="text" name="quantity" class="form-control" value="1" readonly>
                                    <a class="btn bnt-sm btn-incre" href="#"><i class="fas fa-plus-square"></i></a>
                                </div>
                            </td>
                            <td>
                                57.000
                            </td>
                            <td><a onclick="return confirm('Do you want to delete this cart?')" href="#"
                                   class="btn btn-sm btn-danger">Remove</a>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <input type="checkbox" name="checkbox" class="checkBuy">
                            </td>
                            <td>
                                1234
                            </td>

                            <td>
                                Bột làm bánh bao mikko 1kg
                            </td>
                            <td>
                                57.000
                            </td>
                            <td class="w-25">
                                <div class="form-group d-flex justify-content-between">
                                    <a class="btn btn-sm btn-decre" href="#"><i class="fas fa-minus-square"></i></a>
                                    <input type="text" name="quantity" class="form-control" value="1" readonly>
                                    <a class="btn bnt-sm btn-incre" href="#"><i class="fas fa-plus-square"></i></a>
                                </div>
                            </td>
                            <td>
                                57.000
                            </td>
                            <td><a onclick="return confirm('Do you want to delete this cart?')" href="#"
                                   class="btn btn-sm btn-danger">Remove</a>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <input type="checkbox" name="checkbox" class="checkBuy">
                            </td>
                            <td>
                                1234
                            </td>

                            <td>
                                Bột làm bánh bao mikko 1kg
                            </td>
                            <td>
                                57.000
                            </td>
                            <td class="w-25">
                                <div class="form-group d-flex justify-content-between">
                                    <a class="btn btn-sm btn-decre" href="#"><i class="fas fa-minus-square"></i></a>
                                    <input type="text" name="quantity" class="form-control" value="1" readonly>
                                    <a class="btn bnt-sm btn-incre" href="#"><i class="fas fa-plus-square"></i></a>
                                </div>
                            </td>
                            <td>
                                57.000
                            </td>
                            <td><a onclick="return confirm('Do you want to delete this cart?')" href="#"
                                   class="btn btn-sm btn-danger">Remove</a>
                            </td>
                        </tr>

                    </tbody>
                </table>

                <input type="submit" class="btn btn-success" value="Buy now" name="btnBuy">

            </form>
        </div>

        <script src="https://code.jquery.com/jquery-3.7.0.js"></script>
        <script src="https://cdn.datatables.net/1.13.6/js/jquery.dataTables.min.js"></script>
        <script>
                                    new DataTable('#example');
        </script>
    </body>
</html>
