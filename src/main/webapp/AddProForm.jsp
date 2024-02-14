<%-- 
    Document   : AddProForm
    Created on : Feb 12, 2024, 3:05:47 PM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
        <title>Create Pro</title>
    </head>
    <body>
        <div class="row">
            <%@include file="SlideBarDashBoard.jsp" %>
            <div class="col-lg-10 col-md-9 col-sm-9 min-vh-100 px-4 ps-4 mt-3">
                <form method="" action="" >
                    <div class="text-center mb-2">
                        <span class="h4 fw-bold">Thêm mới sản phẩm</span>
                    </div>
                    <div class="d-flex">
                        <div class="w-50 m-2 ">
                            <div class="form-outline w-75">
                                <label class="form-label">Tên sản phẩm</label>
                                <input type="text" id="" name=""
                                       class="form-control form-control-lg" />
                                <br/>
                                  <span class="error "></span>
                            </div>
                            <div class="form-outline mt-3">
                                <label class="form-label">Loại sản phẩm</label>
                                <select>
                                    <option value="value">Việt Nam</option>
                                    <option value="value">Trung quốc</option>
                                    <option value="value">Mỹ</option>
                                    <option value="value">Hàn</option>
                                    <option value="value">Thái Lan</option>
                                </select>
                            </div>
                            <div class="form-outline mt-3">
                                <label class="form-label">Xuất xứ</label>
                                <select>
                                    <option value="value">Việt Nam</option>
                                    <option value="value">Trung quốc</option>
                                    <option value="value">Mỹ</option>
                                    <option value="value">Hàn</option>
                                    <option value="value">Thái Lan</option>
                                </select>
                            </div>
                            <div class="form-outline mt-3 w-50">
                                <label class="form-label">Thương hiệu</label>
                                <input type="text" id="" name=""
                                       class="form-control form-control-lg" />
                                <br/>
                                  <span class="error "></span>
                            </div>
                            <div class="form-outline mt-3 w-25">
                                <label class="form-label">Khối lượng</label>
                                <input type="text" id="" name=""
                                       class="form-control form-control-lg" />
                                <br/>
                                  <span class="error "></span>
                            </div>
                        </div>
                        <div class="w-50 m-2">
                            <div class="form-outline w-100">
                                <label class="form-label">Thành phần</label>
                                <input type="text" id="" name=""
                                       class="form-control form-control-lg" />
                                <br/>
                                  <span class="error "></span>
                            </div>
                            <div class="form-outline mt-3 w-25">
                                <label class="form-label">Giá gốc</label>
                                <input type="number" id="" name=""
                                       class="form-control form-control-lg" />
                                <br/>
                                  <span class="error "></span>
                            </div>
                            <div class="form-outline mt-3 w-25">
                                <label class="form-label">Giá bán</label>
                                <input type="number" id="" name=""
                                       class="form-control form-control-lg" />
                                <br/>
                                  <span class="error "></span>
                            </div>
                            <div class="form-outline mt-3 w-75">
                                <label class="form-label">Ngày tạo sản phẩm</label>
                                <input type="date" id="" name=""
                                       class="form-control form-control-lg" />
                                <br/>
                                  <span class="error "></span>
                            </div>
                        </div>
                    </div>
                    <label class="form-label" >Product picture: </label>
                    <div class="d-flex">
                        <div class="validate form-outline mt-3 col">
                            <input type="file" name="proPic" id="proPic">
                            <br/>
                            <span class="error "></span>
                        </div>
                        <div class="validate form-outline mt-3 col">
                            
                            <input type="file" name="proPic" id="proPic">
                            <br/>
                            <span class="error "></span>
                        </div>
                        <div class="validate form-outline mt-3 col">
                            <input type="file" name="proPic" id="proPic">
                            <br/>
                            <span class="error "></span>
                        </div>
                        <div class="validate form-outline mt-3 col">
                            <input type="file" name="proPic" id="proPic">
                            <br/>
                            <span class="error "></span>
                        </div>
                    </div>

                    <div class="form-outline mt-3">
                        <label class="form-label">Mô tả và thông tin khác</label>
                        <textarea type="text" id="" name=""
                                  class="form-control form-control-lg" rows="8" cols="10" style="max-height: 150px;"></textarea>
                                  <br/>
                                  <span class="error "></span>
                    </div>
                    <div class="form-outline mt-3 ">
                        <input type="submit" name="" class="btn btn-success px-3 ps-3 " value="Create" />
                    </div>
                </form>
            </div>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
                integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
        crossorigin="anonymous"></script>

    </body>
</html>
