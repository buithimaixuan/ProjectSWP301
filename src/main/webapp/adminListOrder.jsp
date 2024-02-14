<%-- 
    Document   : ListOrderAdmin
    Created on : Feb 13, 2024, 12:49:59 PM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
            <div class="col-lg-10 col-md-9 col-sm-9 min-vh-100 mt-3">
                <div class="mx-2 ms-1 border border-2 p-0">

                    <table id="example" class="display " style="width:100%">
                        <thead>
                    <tr>
                        <th>Mã đơn hàng</th>
                        <th>Trạng thái</th>
                        <th>Địa chỉ</th>
                        <th>Tổng tiền</th>
                        <th>Ngày mua</th>
                        <th>Đã xóa</th>
                        <th></th>
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
