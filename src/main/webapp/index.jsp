<%-- 
    Document   : index
    Created on : Feb 6, 2024, 8:45:43 AM
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
        <link rel="icon" type="image/png" href="/Images/Lovecake.png">
        <script src="https://kit.fontawesome.com/1bd9fa3a2e.js" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="/CSS/style.css">
    </head>
    <body>
        <!--  -->
        <%@include file="headOfHome.jsp" %>
        <div class="container">
            <div class="row">
                <div class="d-flex flex-column justify-content-between col-lg-2 col-md-3 col-sm-3 min-vh-100 border border-1">
                    <div class="slide-bar">
                        <ul class="menu">
                            <li class="item">
                                <p class="sub-btn m-0"><a class="text-decoration-none text-black" href="/ProductController/setNguyenLieu">Set nguyên liệu</a><i
                                        class="fas fa-angle-right dropdown"></i></p>
                                <div class="sub-menu m-0">
                                    <p class="m-0 pb-0"><a class="sub-item text-decoration-none text-black" href="/ProductController/setNguyenLieu/sinhNhat">Set nguyên liệu
                                            bánh sinh nhật</a></p>
                                    <p class="m-0 pb-0"><a class="sub-item text-decoration-none text-black " href="/ProductController/setNguyenLieu/cookie">Set nguyên liệu
                                            bánh cookie</a></p>
                                    <p class="m-0 pb-0"><a class="sub-item text-decoration-none text-black " href="/ProductController/setNguyenLieu/banhMi">Set nguyên liệu
                                            bánh mì</a></p>
                                    <p class="m-0 pb-0"><a class="sub-item text-decoration-none text-black" href="/ProductController/setNguyenLieu/anVat">Set nguyên liệu
                                            bánh ăn vặt</a></p>
                                    <p class="m-0 pb-0"><a class="sub-item text-decoration-none text-black" href="/ProductController/setNguyenLieu/socola">Set nguyên liệu
                                            làm socola</a></p>
                                </div>
                            </li>

                            <li class="item">
                                <p class="sub-btn m-0"><a class="text-decoration-none text-black" href="/ProductController/kemBoSuaPhomai">Kem, Bơ, Sữa, Phô mai</a><i
                                        class="fas fa-angle-right dropdown"></i></p>
                                <div class="sub-menu m-0">
                                    <p class="m-0 pb-0"><a class="sub-item text-decoration-none text-black" href="/ProductController/kemBoSuaPhomai/bo">Bơ</a></p>
                                    <p class="m-0 pb-0"><a class="sub-item text-decoration-none text-black"
                                                           href="/ProductController/kemBoSuaPhomai/Whipping">Whipping(Cream)</a></p>
                                    <p class="m-0 pb-0"><a class="sub-item text-decoration-none text-black" href="/ProductController/kemBoSuaPhomai/PhoMai">Phô
                                            mai(cheese)</a></p>
                                    <p class="m-0 pb-0"><a class="sub-item text-decoration-none text-black " href="/ProductController/kemBoSuaPhomai/Sua">Sữa và sản phẩm
                                            làm từ sữa</a></p>
                                </div>
                            </li>

                            <li class="item">
                                <p class="sub-btn m-0"><a class="text-decoration-none text-black" href="/ProductController/botLamBanh">Bột làm bánh</a><i
                                        class="fas fa-angle-right dropdown"></i></p>
                                <div class="sub-menu m-0">
                                    <p class="m-0 pb-0"><a class="sub-item text-decoration-none text-black" href="/ProductController/botLamBanh/BotMi">Bột mì làm
                                            bánh</a></p>
                                    <p class="m-0 pb-0"><a class="sub-item text-decoration-none text-black m-0" href="/ProductController/botLamBanh/BotMiNguyenCam">Bột mì nguyên
                                            cám</a></p>
                                    <p class="m-0 pb-0"><a class="sub-item text-decoration-none text-black m-0" href="/ProductController/botLamBanh/BotTronSan">Bột trộn
                                            sẵn</a></p>

                                    <p class="m-0 pb-0"><a class="sub-item text-decoration-none text-black m-0" href="/ProductController/botLamBanh/BotKhac">Bột làm bánh
                                            khác</a></p>
                                </div>
                            </li>

                            <li class="item">
                                <p class="sub-btn m-0"><a class="text-decoration-none text-black" href="/ProductController/phuGia">Phụ gia</a><i
                                        class="fas fa-angle-right dropdown"></i></p>
                                <div class="sub-menu m-0">
                                    <p class="m-0 pb-0"><a class="sub-item text-decoration-none text-black" href="/ProductController/phuGia/MenNo">Men nở và phụ gia
                                            nhỏ</a></p>
                                    <p class="m-0 pb-0"><a class="sub-item text-decoration-none text-black m-0" href="/ProductController/phuGia/Duong">Đường các
                                            loại</a></p>
                                    <p class="m-0 pb-0"><a class="sub-item text-decoration-none text-black m-0" href="/ProductController/phuGia/HuongLieu">Hương liệu và
                                            tinh dầu</a></p>
                                    <p class="m-0 pb-0"><a class="sub-item text-decoration-none text-black m-0" href="/ProductController/phuGia/Mau">Màu thực
                                            phẩm</a></p>
                                </div>
                            </li>

                            <li class="item">
                                <p class="sub-btn m-0"><a class="text-decoration-none text-black" href="/ProductController/nguyeLieuLamSocola">Nguyên liệu
                                        làm socola</a><i class="fas fa-angle-right dropdown"></i></p>
                                <div class="sub-menu m-0">
                                    <p class="m-0 pb-0"><a class="sub-item text-decoration-none text-black" href="/ProductController/nguyeLieuLamSocola/Hat">Socola hạt</a></p>
                                    <p class="m-0 pb-0"><a class="sub-item text-decoration-none text-black m-0" href="/ProductController/nguyeLieuLamSocola/Thanh">Socola
                                            thanh</a></p>
                                    <p class="m-0 pb-0"><a class="sub-item text-decoration-none text-black m-0" href="/ProductController/nguyeLieuLamSocola/TrangTri">Nguyên liệu trang trí socola</a></p>
                                </div>
                            </li>
                            <li class="item">
                                <p class="sub-btn m-0"><a class="text-decoration-none text-black" href="/ProductController/dungCuLamBanh">Dụng cụ làm bánh</a><i
                                        class="fas fa-angle-right dropdown"></i></p>
                                <div class="sub-menu m-0">
                                    <p class="m-0 pb-0"><a class="sub-item text-decoration-none text-black" href="/ProductController/dungCuLamBanh/DoLuong">Dụng cụ đo lường</a></p>
                                    <p class="m-0 pb-0"><a class="sub-item text-decoration-none text-black m-0" href="/ProductController/dungCuLamBanh/DaoTron">Dụng cụ đảo, khuấy, trộn</a></p>
                                    <p class="m-0 pb-0"><a class="sub-item text-decoration-none text-black m-0" href="/ProductController/dungCuLamBanh/CanCat">Dụng cụ cán, cắt</a></p>
                                    <p class="m-0 pb-0"><a class="sub-item text-decoration-none text-black m-0" href="/ProductController/dungCuLamBanh/NhoiNuong">Dụng cụ nhồi bột, nướng bánh</a></p>

                                </div>
                            </li>
                            <li class="item">
                                <p class="sub-btn m-0"><a class="text-decoration-none text-black" href="/ProductController/khuonKhay">Khuôn, khay</a><i
                                        class="fas fa-angle-right dropdown"></i></p>
                                <div class="sub-menu m-0">
                                    <p class="m-0 pb-0"><a class="sub-item text-decoration-none text-black" href="/ProductController/khuonKhay/KhuonBanhMi">Khuôn bánh mì</a></p>
                                    <p class="m-0 pb-0"><a class="sub-item text-decoration-none text-black m-0" href="/ProductController/khuonKhay/KhuonCookie">Khuôn bánh cookie</a></p>
                                    <p class="m-0 pb-0"><a class="sub-item text-decoration-none text-black m-0" href="/ProductController/khuonKhay/KhuonSocola">Khuôn thạch, socola</a></p>
                                    <p class="m-0 pb-0"><a class="sub-item text-decoration-none text-black m-0" href="/ProductController/khuonKhay/KhayNuong">Khay nướng bánh</a></p>
                                </div>
                            </li>
                            <li class="item">
                                <p class="sub-btn m-0"><a class="text-decoration-none text-black" href="/ProductController/tuiHopBanh">Túi, hộp bánh</a><i
                                        class="fas fa-angle-right dropdown"></i></p>
                                <div class="sub-menu m-0">
                                    <p class="m-0 pb-0"><a class="sub-item text-decoration-none text-black" href="/ProductController/tuiHopBanh/HopGato">Hộp bánh gato</a></p>
                                    <p class="m-0 pb-0"><a class="sub-item text-decoration-none text-black m-0" href="/ProductController/tuiHopBanh/HopCupcake">Hộp bánh cupcake</a></p>
                                    <p class="m-0 pb-0"><a class="sub-item text-decoration-none text-black m-0" href="/ProductController/tuiHopBanh/HopCookie">Hộp bánh cookie</a></p>
                                    <p class="m-0 pb-0"><a class="sub-item text-decoration-none text-black m-0" href="/ProductController/tuiHopBanh/TuiCookie">Túi bánh cookie</a></p>
                                    <p class="m-0 pb-0"><a class="sub-item text-decoration-none  text-black m-0" href="/ProductController/tuiHopBanh/TuiBanhMi">Túi bánh mì</a></p>

                                </div>
                            </li>

                            <li class="item">
                                <p class="sub-btn m-0"><a class="text-decoration-none text-black" href="/ProductController/mayLamBanh">Máy làm bánh</a><i
                                        class="fas fa-angle-right dropdown"></i></p>
                                <div class="sub-menu m-0">
                                    <p class="m-0 pb-0"><a class="sub-item text-decoration-none text-black" href="/ProductController/mayLamBanh/LoNuong">Lò nướng bánh</a></p>
                                    <p class="m-0 pb-0"><a class="sub-item text-decoration-none text-black m-0" href="/ProductController/mayLamBanh/DanhTrung">Máy đánh trứng</a></p>
                                    <p class="m-0 pb-0"><a class="sub-item text-decoration-none text-black m-0" href="/ProductController/mayLamBanh/CanDienTu">Cân điện tử</a></p>
                                    <p class="m-0 pb-0"><a class="sub-item text-decoration-none text-black m-0" href="/ProductController/mayLamBanh/MayKhac">Các loại máy & vật dụng khác</a></p>
                                </div>
                            </li>
                        </ul>
                    </div>
                </div>
                <div class="col-lg-10 col-md-9 col-sm-9 min-vh-100">
                    <c:forEach items="${cat.entrySet()}" var="c">
                        <div class="bg-danger-subtle mt-3 pb-3" style="border-radius: 10px;">
                            <div class="d-flex justify-content-between mt-1">
                                <p class="h4">${c.key}</p>

                            </div>
                            <div class="row border-2 border-danger border-top mx-1">

                                <c:forEach items="${c.value}" var="p">
                                    <div class="col-lg-3 pt-0 pt-3 "  style="height: 320px;">
                                        <div class="card  w-100 h-100">
                                            <a href="">
                                                <img src="/${p.pro_image}" class="card-img-top " alt="product img" style="height: 170px;">
                                            </a>
                                            <div class="card-body">
                                                <h5 class="card-title text-center" style="height: 50px">${p.pro_name}</h5>
                                                <div class="d-flex">
                                                    <div>
                                                        <p class="card-text text-danger p-0 m-0">${p.discount}đ</p>
                                                        <p class="card-text text-secondary p-0 m-0" style=" text-decoration: line-through;">${p.pro_price}đ</p>
                                                    </div>

                                                    <a href="" class="btn btn-danger p-0 mt-2" style="height: 30px; width: 36px; margin-left: 120px;"><i class="fa fa-cart-plus"></i></a> 
                                                </div>

                                            </div>
                                        </div>
                                    </div>
                                </c:forEach>
                            </div> 
                        </div>
                    </c:forEach>
                    <c:if test="${listPro !=null}">
<!--                        <p class="h5 mt-1 border-2 border-bottom">Tat ca san pham</p>-->
                        <div class="row mx-1">
                            <c:forEach items="${listPro}" var="p">
                                <div class="col-lg-3 pt-0 pt-3 ">
                                    <div class="card  w-100 h-100">
                                        <a href="">
                                            <img src="/${p.pro_image}" class="card-img-top " alt="product img" style="height: 300px;">
                                        </a>
                                        <div class="card-body">
                                            <h5 class="card-title text-center" style="height: 50px">${p.pro_name}</h5>
                                            <div class="d-flex">
                                                <div>
                                                    <p class="card-text text-danger p-0 m-0">${p.discount}đ</p>
                                                    <p class="card-text text-secondary p-0 m-0" style=" text-decoration: line-through;">${p.pro_price}đ</p>
                                                </div>

                                                <a href="" class="btn btn-danger p-0 mt-2" style="height: 30px; width: 36px; margin-left: 120px;"><i class="fa fa-cart-plus"></i></a> 
                                            </div>

                                        </div>
                                    </div>
                                </div>
                            </c:forEach>
                        </div>

                    </c:if>
                    <div class="mt-3">
                        <nav aria-label="Page navigation example">
                            <ul class="pagination justify-content-center">
                                <c:if test="${path == 'ProductController'}">
                                    <c:forEach begin="1" end="${endP}" var="i">
                                        <li class="page-item">
                                            <a class="page-link" href="/ProductController/index/${i}">${i}</a>
                                        </li>
                                    </c:forEach>
                                </c:if>
                                <c:if test="${path == 'ProductController/setNguyenLieu/sinhNhat'}">
                                    <c:forEach begin="1" end="${endP}" var="i">
                                        <li class="page-item">
                                            <a class="page-link" href="/ProductController/setNguyenLieu/sinhNhat/index/${i}">${i}</a>
                                        </li>
                                    </c:forEach>
                                </c:if>
                                <c:if test="${path == 'ProductController/setNguyenLieu/cookie'}">
                                    <c:forEach begin="1" end="${endP}" var="i">
                                        <li class="page-item">
                                            <a class="page-link" href="/ProductController/setNguyenLieu/cookie/index/${i}">${i}</a>
                                        </li>
                                    </c:forEach>
                                </c:if>
                                <c:if test="${path == 'ProductController/setNguyenLieu/banhMi'}">
                                    <c:forEach begin="1" end="${endP}" var="i">
                                        <li class="page-item">
                                            <a class="page-link" href="/ProductController/setNguyenLieu/banhMi/index/${i}">${i}</a>
                                        </li>
                                    </c:forEach>
                                </c:if>
                                <c:if test="${path == 'ProductController/setNguyenLieu/anVat'}">
                                    <c:forEach begin="1" end="${endP}" var="i">
                                        <li class="page-item">
                                            <a class="page-link" href="/ProductController/setNguyenLieu/anVat/index/${i}">${i}</a>
                                        </li>
                                    </c:forEach>
                                </c:if>
                                <c:if test="${path == 'ProductController/setNguyenLieu/socola'}">
                                    <c:forEach begin="1" end="${endP}" var="i">
                                        <li class="page-item">
                                            <a class="page-link" href="/ProductController/setNguyenLieu/socola/index/${i}">${i}</a>
                                        </li>
                                    </c:forEach>
                                </c:if>
                                <c:if test="${path == 'ProductController/kemBoSuaPhomai/bo'}">
                                    <c:forEach begin="1" end="${endP}" var="i">
                                        <li class="page-item">
                                            <a class="page-link" href="/ProductController/kemBoSuaPhomai/bo/index/${i}">${i}</a>
                                        </li>
                                    </c:forEach>
                                </c:if>
                                <c:if test="${path == 'ProductController/kemBoSuaPhomai/Whipping'}">
                                    <c:forEach begin="1" end="${endP}" var="i">
                                        <li class="page-item">
                                            <a class="page-link" href="/ProductController/kemBoSuaPhomai/Whipping/index/${i}">${i}</a>
                                        </li>
                                    </c:forEach>
                                </c:if>
                                <c:if test="${path == 'ProductController/kemBoSuaPhomai/PhoMai'}">
                                    <c:forEach begin="1" end="${endP}" var="i">
                                        <li class="page-item">
                                            <a class="page-link" href="/ProductController/kemBoSuaPhomai/PhoMai/index/${i}">${i}</a>
                                        </li>
                                    </c:forEach>
                                </c:if>
                                <c:if test="${path == '/ProductController/kemBoSuaPhomai/Sua'}">
                                    <c:forEach begin="1" end="${endP}" var="i">
                                        <li class="page-item">
                                            <a class="page-link" href="/ProductController/kemBoSuaPhomai/Sua/index/${i}">${i}</a>
                                        </li>
                                    </c:forEach>
                                </c:if>
                                <c:if test="${path == 'ProductController/botLamBanh/BotMi'}">
                                    <c:forEach begin="1" end="${endP}" var="i">
                                        <li class="page-item">
                                            <a class="page-link" href="/ProductController/botLamBanh/BotMi/index/${i}">${i}</a>
                                        </li>
                                    </c:forEach>
                                </c:if>
                                <c:if test="${path == 'ProductController/botLamBanh/BotMiNguyenCam'}">
                                    <c:forEach begin="1" end="${endP}" var="i">
                                        <li class="page-item">
                                            <a class="page-link" href="/ProductController/botLamBanh/BotMiNguyenCam/index/${i}">${i}</a>
                                        </li>
                                    </c:forEach>
                                </c:if>
                                <c:if test="${path == 'ProductController/botLamBanh/BotTronSan'}">
                                    <c:forEach begin="1" end="${endP}" var="i">
                                        <li class="page-item">
                                            <a class="page-link" href="/ProductController/botLamBanh/BotTronSan/index/${i}">${i}</a>
                                        </li>
                                    </c:forEach>
                                </c:if>
                                <c:if test="${path == 'ProductController/botLamBanh/BotKhac'}">
                                    <c:forEach begin="1" end="${endP}" var="i">
                                        <li class="page-item">
                                            <a class="page-link" href="/ProductController/botLamBanh/BotKhac/index/${i}">${i}</a>
                                        </li>
                                    </c:forEach>
                                </c:if>
                                <c:if test="${path == 'ProductController/phuGia/MenNo'}">
                                    <c:forEach begin="1" end="${endP}" var="i">
                                        <li class="page-item">
                                            <a class="page-link" href="/ProductController/phuGia/MenNo/index/${i}">${i}</a>
                                        </li>
                                    </c:forEach>
                                </c:if>
                                <c:if test="${path == 'ProductController/phuGia/Duong'}">
                                    <c:forEach begin="1" end="${endP}" var="i">
                                        <li class="page-item">
                                            <a class="page-link" href="/ProductController/phuGia/Duong/index/${i}">${i}</a>
                                        </li>
                                    </c:forEach>
                                </c:if>
                                <c:if test="${path == 'ProductController/phuGia/HuongLieu'}">
                                    <c:forEach begin="1" end="${endP}" var="i">
                                        <li class="page-item">
                                            <a class="page-link" href="/ProductController/phuGia/HuongLieu/index/${i}">${i}</a>
                                        </li>
                                    </c:forEach>
                                </c:if>
                                <c:if test="${path == 'ProductController/phuGia/Mau'}">
                                    <c:forEach begin="1" end="${endP}" var="i">
                                        <li class="page-item">
                                            <a class="page-link" href="/ProductController/phuGia/Mau/index/${i}">${i}</a>
                                        </li>
                                    </c:forEach>
                                </c:if>
                                <c:if test="${path == 'ProductController/nguyeLieuLamSocola/Hat'}">
                                    <c:forEach begin="1" end="${endP}" var="i">
                                        <li class="page-item">
                                            <a class="page-link" href="/ProductController/nguyeLieuLamSocola/Hat/index/${i}">${i}</a>
                                        </li>
                                    </c:forEach>
                                </c:if>
                                <c:if test="${path == 'ProductController/nguyeLieuLamSocola/Thanh'}">
                                    <c:forEach begin="1" end="${endP}" var="i">
                                        <li class="page-item">
                                            <a class="page-link" href="/ProductController/nguyeLieuLamSocola/Thanh/index/${i}">${i}</a>
                                        </li>
                                    </c:forEach>
                                </c:if>
                                <c:if test="${path == 'ProductController/nguyeLieuLamSocola/TrangTri'}">
                                    <c:forEach begin="1" end="${endP}" var="i">
                                        <li class="page-item">
                                            <a class="page-link" href="/ProductController/nguyeLieuLamSocola/TrangTri/index/${i}">${i}</a>
                                        </li>
                                    </c:forEach>
                                </c:if>
                                <c:if test="${path == 'ProductController/dungCuLamBanh/DoLuong'}">
                                    <c:forEach begin="1" end="${endP}" var="i">
                                        <li class="page-item">
                                            <a class="page-link" href="/ProductController/dungCuLamBanh/DoLuong/index/${i}">${i}</a>
                                        </li>
                                    </c:forEach>
                                </c:if>
                                <c:if test="${path == 'ProductController/dungCuLamBanh/DaoTron'}">
                                    <c:forEach begin="1" end="${endP}" var="i">
                                        <li class="page-item">
                                            <a class="page-link" href="/ProductController/dungCuLamBanh/DaoTron/index/${i}">${i}</a>
                                        </li>
                                    </c:forEach>
                                </c:if>
                                <c:if test="${path == 'ProductController/dungCuLamBanh/CanCat'}">
                                    <c:forEach begin="1" end="${endP}" var="i">
                                        <li class="page-item">
                                            <a class="page-link" href="/ProductController/dungCuLamBanh/CanCat/index/${i}">${i}</a>
                                        </li>
                                    </c:forEach>
                                </c:if>
                                <c:if test="${path == 'ProductController/dungCuLamBanh/NhoiNuong'}">
                                    <c:forEach begin="1" end="${endP}" var="i">
                                        <li class="page-item">
                                            <a class="page-link" href="/ProductController/dungCuLamBanh/NhoiNuong/index/${i}">${i}</a>
                                        </li>
                                    </c:forEach>
                                </c:if>
                                <c:if test="${path == '/ProductController/khuonKhay/KhuonBanhMi'}">
                                    <c:forEach begin="1" end="${endP}" var="i">
                                        <li class="page-item">
                                            <a class="page-link" href="//ProductController/khuonKhay/KhuonBanhMi/index/${i}">${i}</a>
                                        </li>
                                    </c:forEach>
                                </c:if>
                                <c:if test="${path == 'ProductController/khuonKhay/KhuonCookie'}">
                                    <c:forEach begin="1" end="${endP}" var="i">
                                        <li class="page-item">
                                            <a class="page-link" href="/ProductController/khuonKhay/KhuonCookie/index/${i}">${i}</a>
                                        </li>
                                    </c:forEach>
                                </c:if>
                                <c:if test="${path == 'ProductController/khuonKhay/KhuonSocola'}">
                                    <c:forEach begin="1" end="${endP}" var="i">
                                        <li class="page-item">
                                            <a class="page-link" href="/ProductController/khuonKhay/KhuonSocola/index/${i}">${i}</a>
                                        </li>
                                    </c:forEach>
                                </c:if>
                                <c:if test="${path == 'ProductController/khuonKhay/KhayNuong'}">
                                    <c:forEach begin="1" end="${endP}" var="i">
                                        <li class="page-item">
                                            <a class="page-link" href="/ProductController/khuonKhay/KhayNuong/index/${i}">${i}</a>
                                        </li>
                                    </c:forEach>
                                </c:if>
                                <c:if test="${path == 'ProductController/tuiHopBanh/HopGato'}">
                                    <c:forEach begin="1" end="${endP}" var="i">
                                        <li class="page-item">
                                            <a class="page-link" href="/ProductController/tuiHopBanh/HopGato/index/${i}">${i}</a>
                                        </li>
                                    </c:forEach>
                                </c:if>
                                <c:if test="${path == 'ProductController/tuiHopBanh/HopCupcake'}">
                                    <c:forEach begin="1" end="${endP}" var="i">
                                        <li class="page-item">
                                            <a class="page-link" href="/ProductController/tuiHopBanh/HopCupcake/index/${i}">${i}</a>
                                        </li>
                                    </c:forEach>
                                </c:if>
                                <c:if test="${path == 'ProductController/tuiHopBanh/HopCookie'}">
                                    <c:forEach begin="1" end="${endP}" var="i">
                                        <li class="page-item">
                                            <a class="page-link" href="/ProductController/tuiHopBanh/HopCookie/${i}">${i}</a>
                                        </li>
                                    </c:forEach>
                                </c:if>
                                <c:if test="${path == 'ProductController/tuiHopBanh/TuiCookie'}">
                                    <c:forEach begin="1" end="${endP}" var="i">
                                        <li class="page-item">
                                            <a class="page-link" href="/ProductController/tuiHopBanh/TuiCookie/index/${i}">${i}</a>
                                        </li>
                                    </c:forEach>
                                </c:if>
                                <c:if test="${path == 'ProductController/tuiHopBanh/TuiBanhMi'}">
                                    <c:forEach begin="1" end="${endP}" var="i">
                                        <li class="page-item">
                                            <a class="page-link" href="/ProductController/tuiHopBanh/TuiBanhMi/index/${i}">${i}</a>
                                        </li>
                                    </c:forEach>
                                </c:if>
                                <c:if test="${path == 'ProductController/mayLamBanh/LoNuong'}">
                                    <c:forEach begin="1" end="${endP}" var="i">
                                        <li class="page-item">
                                            <a class="page-link" href="/ProductController/mayLamBanh/LoNuong/index/${i}">${i}</a>
                                        </li>
                                    </c:forEach>
                                </c:if>
                                <c:if test="${path == 'ProductController/mayLamBanh/DanhTrung'}">
                                    <c:forEach begin="1" end="${endP}" var="i">
                                        <li class="page-item">
                                            <a class="page-link" href="/ProductController/mayLamBanh/DanhTrung/index/${i}">${i}</a>
                                        </li>
                                    </c:forEach>
                                </c:if>
                                <c:if test="${path == 'ProductController/mayLamBanh/CanDienTu'}">
                                    <c:forEach begin="1" end="${endP}" var="i">
                                        <li class="page-item">
                                            <a class="page-link" href="/ProductController/mayLamBanh/CanDienTu/index/${i}">${i}</a>
                                        </li>
                                    </c:forEach>
                                </c:if>
                                <c:if test="${path == 'ProductController/mayLamBanh/MayKhac'}">
                                    <c:forEach begin="1" end="${endP}" var="i">
                                        <li class="page-item">
                                            <a class="page-link" href="/ProductController/mayLamBanh/MayKhac/index/${i}">${i}</a>
                                        </li>
                                    </c:forEach>
                                </c:if>
                            </ul>
                        </nav>
                    </div>



                </div>
            </div>

        </div>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
    crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</body>

</html>