<%-- 
    Document   : RegisterForm
    Created on : Feb 12, 2024, 10:37:47 PM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Document</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    </head>

    <body>
        <section style="background-color: #e1afb9; min-width: 100vh;">
            <div class="vh-100">
                <div class="row d-flex justify-content-center align-items-center h-100">
                    <div class="col col-xl-10">
                        <div class="card" style="border-radius: 1rem;">
                            <div class="row g-0">
                                <div class="col-md-6 col-lg-6 d-none d-md-block">
                                    <img class="w-100 h-100" src="Images/Lovecake.png" alt="login form" class="img-fluid"
                                         style="border-radius: 1rem 0 0 1rem;" />
                                </div>
                                <div class="col-md-6 col-lg-6 d-flex align-items-center">
                                    <div class="card-body p-2 p-lg-5 text-black">

                                        <form class="pb-2">
                                            <div class="d-flex align-items-center mb-2 pb-1">
                                                <span class="h1 fw-bold mb-0">Tạo tài khoản mới</span>
                                            </div>
                                            <div class="form-outline mb-2">
                                                <label class="form-label">Họ và tên</label>
                                                <input type="text" id="fullName" name="fullName"
                                                       class="form-control form-control-lg" />

                                            </div>
                                            <div class="form-outline mb-2">
                                                <label class="form-label">Email</label>
                                                <input type="email" id="email" name="email"
                                                       class="form-control form-control-lg" />

                                            </div>
                                            <div class="form-outline mb-2">
                                                <label class="form-label">Số điện thoại</label>
                                                <input type="text" id="phone" name="phoneNumber"
                                                       class="form-control form-control-lg" />

                                            </div>
                                            <div class="form-outline mb-2">
                                                <label class="form-label">Avatar</label>
                                                <input type="file" id="phone" name=""
                                                       class="form-control form-control-lg" />

                                            </div>
                                            <div class="form-outline mb-2">
                                                <label class="form-label">Tên đăng nhập</label>
                                                <input type="text" id="phone" name="phoneNumber"
                                                       class="form-control form-control-lg" />

                                            </div>

                                            <div class="form-outline mb-2">
                                                <label class="form-label">Mật khẩu</label>
                                                <input type="password" id="password" name="password"
                                                       class="form-control form-control-lg" />

                                            </div>
                                            <div class="pt-1 mb-2">
                                                <input type="submit" class="btn btn-lg btn-block" name="btnLogin"
                                                       value="Create" style="background-color: #f1a8b6;">
                                                <input type="reset" class="btn btn-lg btn-block" value="Reset"
                                                       style="background-color: #f1a8b6;">
                                            </div>
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
                integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
        crossorigin="anonymous"></script>
    </body>

</html>
