<%-- 
    Document   : AddNewsForm
    Created on : Feb 13, 2024, 4:17:51 PM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css" />
        <title>JSP Page</title>
    </head>
    <body>
        <div class="row">
            <%@include file="SlideBarDashBoard.jsp" %>
            <div class="col-lg-10 col-md-9 col-sm-9 min-vh-100 px-4 ps-4 mt-3">
                <form method="" action="" >
                    <div class="text-center mb-2">
                        <span class="h4 fw-bold">Thêm mới thông tin</span>
                    </div>


                    <div class="form-outline w-50">
                        <label class="form-label">Tiêu đề</label>
                        <input type="text" id="" name=""
                               class="form-control form-control-lg" />
                        <br/>
                        <span class="error "></span>
                    </div>

                    <div class="form-outline w-50">
                        <label class="form-label" >Hình ảnh </label>
                        <div class="validate form-outline col">
                            <input type="file" name="proPic" id="proPic">
                            <br/>
                            <span class="error "></span>
                        </div>
                    </div>
                    <div class="form-outline mt-3 w-100">
                        <label class="form-label">Nội dung chính</label>
                        <textarea type="text" id="" name=""
                                  class="form-control form-control-lg" rows="8" cols="10" style="max-height: 250px;"></textarea>
                        <span class="error "></span>
                    </div>
                    <div class="form-outline mt-3 w-100">
                        <label class="form-label">Nội dung 1</label>
                        <textarea type="text" id="" name=""
                                  class="form-control form-control-lg" rows="8" cols="10" style="max-height: 150px;"></textarea>
                        <span class="error "></span>
                    </div>


                    <div class="form-outline w-100">
                        <label class="form-label">Nội dung 2</label>
                        <textarea type="text" id="" name=""
                                  class="form-control form-control-lg" rows="8" cols="10" style="max-height: 150px;"></textarea>
                        <span class="error "></span>
                    </div>

                    <div class="form-outline mt-3 w-100">
                        <label class="form-label">Nội dung 3</label>
                        <textarea type="text" id="" name=""
                                  class="form-control form-control-lg" rows="8" cols="10" style="max-height: 150px;"></textarea>
                        <span class="error "></span>
                    </div>

                    <div class="form-outline mt-3 w-75">
                        <label class="form-label">Ngày viết</label>
                        <input type="date" id="" name=""
                               class="form-control form-control-lg" />
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
