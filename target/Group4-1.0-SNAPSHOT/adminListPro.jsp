<%-- 
    Document   : adminAddPro
    Created on : Feb 12, 2024, 10:49:43 AM
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
        <div class="row">
            <%@include file="SlideBarDashBoard.jsp" %>
            <div class="col-lg-10 col-md-9 col-sm-9 min-vh-100">
                <p class="btn btn-success m-4" style="width: 300px;">
                    <a href="AddProForm.jsp" class="text-decoration-none text-white">Thêm mới sản phẩm</a>
                </p>
                <div class="mx-2 ms-1 border border-2 p-0">

                    <table id="example" class="display " style="width:100%">
                        <thead>
                            <tr>
                                <th>Mã SP</th>
                                <th>Tên SP</th>
                                <th>SL</th>
                                <th>SL đặt hàng</th>
                                <th>SL thêm vào</th>
                                <th>SL giảm</th>
                                <th>SL trả lại</th>
                                <th>Ngày</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${listPH}" var="ph">
                                <tr>
                                    <td>${ph.pro_id}</td>
                                    <td>${ph.pro_name}</td>
                                    <td>${ph.quanInStock}</td>
                                    <td>${ph.quanOnOrder}</td>
                                    <td>${ph.quanAdded}</td>
                                    <td>${ph.quanDelete}</td>
                                    <td>${ph.quanOrderCancel}</td>
                                    <td>${ph.date_update}</td>
                                </tr>
                            </c:forEach>
                        </tbody><!-- comment -->
                    </table>
                </div>

            </div>
        </div>
        <script src="https://code.jquery.com/jquery-3.7.0.js"></script>
        <script src="https://cdn.datatables.net/1.13.6/js/jquery.dataTables.min.js"></script>
        <script>
            new DataTable('#example');
        </script>
    </body>
</html>
