<%-- 
    Document   : headOfCart
    Created on : Feb 13, 2024, 11:28:10 AM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css">
        <title>LoveCake Shop</title>
        <link rel="icon" type="image/png" href="Images/Lovecake.png">
        <link rel="stylesheet" href="CSS/cart.css">
        <script src="https://kit.fontawesome.com/1bd9fa3a2e.js" crossorigin="anonymous"></script>
    </head>

    <body>
        <!--  -->
        <header style="background-color: rgb(69, 68, 69);">
            <div class="container">
                <div class="row">

                    <div class="col-lg-2 col-md-3 col-sm-3 p-0   subnav">
                        <div class="categories border rounded-top border-dark">
                            <a href="" class="text-decoration-none text-black">
                                <p class="hidden-sm hidden-xs text-center">DANH MỤC SẢN PHẨM</p>
                            </a>
                        </div>

                        <div class="ps-2 px-2 border border-1 subnav-content">
                            <div class="slide-bar">
                                <ul class="menu">
                                    <li class="item">
                                        <p class="sub-btn m-0"><a class="text-decoration-none text-black" href="">Set nguyên liệu</a><i
                                                class="fas fa-angle-right dropdown"></i></p>
                                        <div class="sub-menu m-0">
                                            <p class="m-0 pb-0"><a class="sub-item text-decoration-none text-black" href="#">Set nguyên liệu
                                                    bánh sinh nhật</a></p>
                                            <p class="m-0 pb-0"><a class="sub-item text-decoration-none text-black " href="#">Set nguyên liệu
                                                    bánh cookie</a></p>
                                            <p class="m-0 pb-0"><a class="sub-item text-decoration-none text-black " href="#">Set nguyên liệu
                                                    bánh mì</a></p>
                                            <p class="m-0 pb-0"><a class="sub-item text-decoration-none text-black" href="#">Set nguyên liệu
                                                    bánh ăn vặt</a></p>
                                            <p class="m-0 pb-0"><a class="sub-item text-decoration-none text-black" href="#">Set nguyên liệu
                                                    làm socola</a></p>
                                        </div>
                                    </li>

                                    <li class="item">
                                        <p class="sub-btn m-0"><a class="text-decoration-none text-black" href="">Kem, Bơ, Sữa, Phô mai</a><i
                                                class="fas fa-angle-right dropdown"></i></p>
                                        <div class="sub-menu m-0">
                                            <p class="m-0 pb-0"><a class="sub-item text-decoration-none text-black" href="#">Bơ</a></p>
                                            <p class="m-0 pb-0"><a class="sub-item text-decoration-none text-black"
                                                                   href="#">Whipping(Cream)</a></p>
                                            <p class="m-0 pb-0"><a class="sub-item text-decoration-none text-black" href="#">Phô
                                                    mai(cheese)</a></p>
                                            <p class="m-0 pb-0"><a class="sub-item text-decoration-none text-black " href="#">Sữa và sản phẩm
                                                    làm từ sữa</a></p>
                                        </div>
                                    </li>

                                    <li class="item">
                                        <p class="sub-btn m-0"><a class="text-decoration-none text-black" href="">Bột làm bánh</a><i
                                                class="fas fa-angle-right dropdown"></i></p>
                                        <div class="sub-menu m-0">
                                            <p class="m-0 pb-0"><a class="sub-item text-decoration-none text-black" href="#">Bột mì làm
                                                    bánh</a></p>
                                            <p class="m-0 pb-0"><a class="sub-item text-decoration-none text-black m-0" href="#">Bột mì nguyên
                                                    cám</a></p>
                                            <p class="m-0 pb-0"><a class="sub-item text-decoration-none text-black m-0" href="#">Bột trộn
                                                    sẵn</a></p>

                                            <p class="m-0 pb-0"><a class="sub-item text-decoration-none text-black m-0" href="#">Bột làm bánh
                                                    khác</a></p>
                                        </div>
                                    </li>

                                    <li class="item">
                                        <p class="sub-btn m-0"><a class="text-decoration-none text-black" href="">Phụ gia</a><i
                                                class="fas fa-angle-right dropdown"></i></p>
                                        <div class="sub-menu m-0">
                                            <p class="m-0 pb-0"><a class="sub-item text-decoration-none text-black" href="#">Men nở và phụ gia
                                                    nhỏ</a></p>
                                            <p class="m-0 pb-0"><a class="sub-item text-decoration-none text-black m-0" href="#">Đường các
                                                    loại</a></p>
                                            <p class="m-0 pb-0"><a class="sub-item text-decoration-none text-black m-0" href="#">Hương liệu và
                                                    tinh dầu</a></p>
                                            <p class="m-0 pb-0"><a class="sub-item text-decoration-none text-black m-0" href="#">Màu thực
                                                    phẩm</a></p>
                                        </div>
                                    </li>

                                    <li class="item">
                                        <p class="sub-btn m-0"><a class="text-decoration-none text-black" href="">Nguyên liệu
                                                làm socola</a><i class="fas fa-angle-right dropdown"></i></p>
                                        <div class="sub-menu m-0">
                                            <p class="m-0 pb-0"><a class="sub-item text-decoration-none text-black" href="#">Socola hạt</a></p>
                                            <p class="m-0 pb-0"><a class="sub-item text-decoration-none text-black m-0" href="#">Socola
                                                    thanh</a></p>
                                            <p class="m-0 pb-0"><a class="sub-item text-decoration-none text-black m-0" href="#">Nguyên liệu trang trí socola</a></p>
                                        </div>
                                    </li>
                                    <li class="item">
                                        <p class="sub-btn m-0"><a class="text-decoration-none text-black" href="">Dụng cụ làm bánh</a><i
                                                class="fas fa-angle-right dropdown"></i></p>
                                        <div class="sub-menu m-0">
                                            <p class="m-0 pb-0"><a class="sub-item text-decoration-none text-black" href="#">Dụng cụ đo lường</a></p>
                                            <p class="m-0 pb-0"><a class="sub-item text-decoration-none text-black m-0" href="#">Dụng cụ đảo, khuấy, trộn</a></p>
                                            <p class="m-0 pb-0"><a class="sub-item text-decoration-none text-black m-0" href="#">Dụng cụ cán, cắt</a></p>
                                            <p class="m-0 pb-0"><a class="sub-item text-decoration-none text-black m-0" href="#">Dụng cụ nhồi bột, nướng bánh</a></p>

                                        </div>
                                    </li>
                                    <li class="item">
                                        <p class="sub-btn m-0"><a class="text-decoration-none text-black" href="">Khuôn, khay</a><i
                                                class="fas fa-angle-right dropdown"></i></p>
                                        <div class="sub-menu m-0">
                                            <p class="m-0 pb-0"><a class="sub-item text-decoration-none text-black" href="#">Khuôn bánh mì</a></p>
                                            <p class="m-0 pb-0"><a class="sub-item text-decoration-none text-black m-0" href="#">Khuôn bánh cookie</a></p>
                                            <p class="m-0 pb-0"><a class="sub-item text-decoration-none text-black m-0" href="#">Khuôn thạch, socola</a></p>
                                            <p class="m-0 pb-0"><a class="sub-item text-decoration-none text-black m-0" href="#">Khay nướng bánh</a></p>
                                        </div>
                                    </li>
                                    <li class="item">
                                        <p class="sub-btn m-0"><a class="text-decoration-none text-black" href="">Túi, hộp bánh</a><i
                                                class="fas fa-angle-right dropdown"></i></p>
                                        <div class="sub-menu m-0">
                                            <p class="m-0 pb-0"><a class="sub-item text-decoration-none text-black" href="#">Hộp bánh gato</a></p>
                                            <p class="m-0 pb-0"><a class="sub-item text-decoration-none text-black m-0" href="#">Hộp bánh cupcake</a></p>
                                            <p class="m-0 pb-0"><a class="sub-item text-decoration-none text-black m-0" href="#">Hộp bánh cookie</a></p>
                                            <p class="m-0 pb-0"><a class="sub-item text-decoration-none text-black m-0" href="#">Túi bánh cookie</a></p>
                                            <p class="m-0 pb-0"><a class="sub-item text-decoration-none  text-blackm-0" href="#">Túi bánh mì</a></p>

                                        </div>
                                    </li>

                                    <li class="item">
                                        <p class="sub-btn m-0"><a class="text-decoration-none text-black" href="">Máy làm bánh</a><i
                                                class="fas fa-angle-right dropdown"></i></p>
                                        <div class="sub-menu m-0">
                                            <p class="m-0 pb-0"><a class="sub-item text-decoration-none text-black" href="#">Lò nướng bánh</a></p>
                                            <p class="m-0 pb-0"><a class="sub-item text-decoration-none text-black m-0" href="#">Máy đánh trứng</a></p>
                                            <p class="m-0 pb-0"><a class="sub-item text-decoration-none text-black m-0" href="#">Cân điện tử</a></p>
                                            <p class="m-0 pb-0"><a class="sub-item text-decoration-none text-black m-0" href="#">Các loại máy & vật dụng khác</a></p>
                                        </div>
                                    </li>
                                </ul>

                            </div>

                        </div>
                    </div>
                    <div class="col-lg-2 col-md-3 col-sm-3 pt-2 pb-2 text-center">
                        <a href=""><img class="border rounded-circle" src="Images/Lovecake.png" alt="logo"
                                        style="width: 100px; height: 70px;"></a>
                    </div>
                    <div class="col-lg-5 col-md-5 col-sm-7 d-flex align-items-center p-0">
                        <div class="input-group ">
                            <input class="form-control border rounded-pill border-2" type="text" placeholder="search"
                                   id="example-search-input">
                            <span class="input-group-append">
                                <button class="btn btn-outline-secondary bg-white border rounded-pill ms-n3 border-2"
                                        type="button">
                                    <i class="fa fa-search"></i>
                                </button>
                            </span>
                        </div>
                    </div>
                    <div
                        class="col-lg-3 col-md-3 col-sm-3 d-flex align-items-center justify-content-between text-white pt-2 ps-5 px-0">
                        <c:if test="${account!=null}">
                            <div>
                                <span class="input-group-append ps-2">
                                    <a class="text-white" href=""><i class="fa fa-cart-plus fs-5 ps-2 px-2"></i></a>
                                </span>
                                <p>Giỏ hàng</p>
                            </div>
                            <div>
                                <span class="input-group-append ms-4">
                                    <a href="" class="text-white"><i class="fa fa-newspaper-o"></i></a>
                                </span>
                                <p>Đơn hàng</p>
                            </div>

                            <div class="user">
                                <div class="avartar">
                                    <img src="Images/Lovecake.png" alt="">
                                </div>
                            </div>

                            <div class="user_option">
                                <div class="top_user_option">
                                    <i class="fa-solid fa-xmark"></i>
                                    <div>
                                        <span class="email_display">namtpce170126@fpt.edu.vn</span>
                                    </div>
                                </div>
                                <div class="mid_user_option">
                                    <div class="avatar_display">
                                        <img src="Images/Lovecake.png" alt="">
                                    </div>s
                                    <div class="hello_user">
                                        Hello, <span>Tran Phuong Nam</span>
                                    </div>
                                </div>
                                <div class="bot_user_option">
                                    <a href="#" class="signout_btn">
                                        <i class="fa-solid fa-right-from-bracket"></i>
                                        <span>Sign out</span>
                                    </a>
                                    <a href="#" class="view_profile">
                                        <i class="fa-solid fa-user"></i>
                                        <span>View profile</span>
                                    </a>
                                </div>
                            </div>
                        </c:if>
                        <div class="ms-5">
                            <span class="input-group-append ps-2">
                                <a class="text-white" href=""><i class="fa-solid fa-user fs-5 ps-2 px-2 ms-3"></i></a>
                            </span>
                            <p>Đăng nhập</p>
                        </div>

                    </div>

                </div>
            </div>
        </header>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
                integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
        crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script type="text/javascript">
            $(document).ready(function () {
                $('.sub-btn').click(function () {
                    $(this).next('.sub-menu').slideToggle();
                });
            });
        </script>
        <script src="JS/profile.js"></script>

    </body>

</html>