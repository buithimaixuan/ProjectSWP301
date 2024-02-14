/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controllers;

import DAOs.CategoriesDAO;
import DAOs.ProductDAO;
import Models.Product;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 *
 * @author Dell
 */
public class ProductController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ProductController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ProductController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ProductDAO dao = new ProductDAO();
        String path = request.getRequestURI();
        if (path.endsWith("/ProductController") || path.startsWith("/ProductController/index")) {
            request.setAttribute("path", "ProductController");
            int index = 0;
            String[] split = path.split("/");
            try {
                if (split.length == 2) {
                    index = 1;
                } else {
                    index = Integer.parseInt(split[split.length - 1]);
                }

                int totalPro = dao.getTotalPro();
                int endPage = totalPro / 16;
                if ((totalPro % 16) != 0) {
                    endPage++;
                }

                LinkedList<Product> list = dao.pagingAllPro(index);
                request.setAttribute("listPro", list);
                request.setAttribute("endP", endPage);

                request.getRequestDispatcher("/index.jsp").forward(request, response);
            } catch (Exception e) {
                response.sendRedirect("/ProductController");
            }

        } else {
            if (path.endsWith("/ProductController/setNguyenLieu")) {
                CategoriesDAO catdao = new CategoriesDAO();
                ProductDAO pdao = new ProductDAO();
                LinkedList<String> cat = catdao.getTypeCategoriesByCatName("Set nguyên liệu");
                Map<String, LinkedList<Product>> map = new HashMap<>();
                LinkedList<Product> pro = new LinkedList<>();

                for (String c : cat) {
                    pro = pdao.get4ProByTypeCategories(c);
                    map.put(c, pro);
                    pro = new LinkedList<>();
                }
                request.setAttribute("cat", map);
                request.getRequestDispatcher("/index.jsp").forward(request, response);
            } else {
                if (path.endsWith("/ProductController/kemBoSuaPhomai")) {
                    CategoriesDAO catdao = new CategoriesDAO();
                    ProductDAO pdao = new ProductDAO();
                    LinkedList<String> cat = catdao.getTypeCategoriesByCatName("Kem, Bơ, Sữa, Phô mai");
                    Map<String, LinkedList<Product>> map = new HashMap<>();
                    LinkedList<Product> pro = new LinkedList<>();

                    for (String c : cat) {
                        pro = pdao.get4ProByTypeCategories(c);
                        map.put(c, pro);
                        pro = new LinkedList<>();
                    }
                    request.setAttribute("cat", map);
                    request.getRequestDispatcher("/index.jsp").forward(request, response);
                } else {
                    if (path.endsWith("/ProductController/botLamBanh")) {
                        CategoriesDAO catdao = new CategoriesDAO();
                        ProductDAO pdao = new ProductDAO();
                        LinkedList<String> cat = catdao.getTypeCategoriesByCatName("Bột làm bánh");
                        Map<String, LinkedList<Product>> map = new HashMap<>();
                        LinkedList<Product> pro = new LinkedList<>();

                        for (String c : cat) {
                            pro = pdao.get4ProByTypeCategories(c);
                            map.put(c, pro);
                            pro = new LinkedList<>();
                        }
                        request.setAttribute("cat", map);
                        request.getRequestDispatcher("/index.jsp").forward(request, response);
                    } else {
                        if (path.endsWith("/ProductController/phuGia")) {
                            CategoriesDAO catdao = new CategoriesDAO();
                            ProductDAO pdao = new ProductDAO();
                            LinkedList<String> cat = catdao.getTypeCategoriesByCatName("Phụ gia");
                            Map<String, LinkedList<Product>> map = new HashMap<>();
                            LinkedList<Product> pro = new LinkedList<>();

                            for (String c : cat) {
                                pro = pdao.get4ProByTypeCategories(c);
                                map.put(c, pro);
                                pro = new LinkedList<>();
                            }
                            request.setAttribute("cat", map);
                            request.getRequestDispatcher("/index.jsp").forward(request, response);
                        } else {
                            if (path.endsWith("/ProductController/nguyeLieuLamSocola")) {
                                CategoriesDAO catdao = new CategoriesDAO();
                                ProductDAO pdao = new ProductDAO();
                                LinkedList<String> cat = catdao.getTypeCategoriesByCatName("Nguyên liệu làm socola");
                                Map<String, LinkedList<Product>> map = new HashMap<>();
                                LinkedList<Product> pro = new LinkedList<>();

                                for (String c : cat) {
                                    pro = pdao.get4ProByTypeCategories(c);
                                    map.put(c, pro);
                                    pro = new LinkedList<>();
                                }
                                request.setAttribute("cat", map);
                                request.getRequestDispatcher("/index.jsp").forward(request, response);
                            } else {
                                if (path.endsWith("/ProductController/dungCuLamBanh")) {
                                    CategoriesDAO catdao = new CategoriesDAO();
                                    ProductDAO pdao = new ProductDAO();
                                    LinkedList<String> cat = catdao.getTypeCategoriesByCatName("Dụng cụ làm bánh");
                                    Map<String, LinkedList<Product>> map = new HashMap<>();
                                    LinkedList<Product> pro = new LinkedList<>();

                                    for (String c : cat) {
                                        pro = pdao.get4ProByTypeCategories(c);
                                        map.put(c, pro);
                                        pro = new LinkedList<>();
                                    }
                                    request.setAttribute("cat", map);
                                    request.getRequestDispatcher("/index.jsp").forward(request, response);
                                } else {
                                    if (path.endsWith("/ProductController/khuonKhay")) {
                                        CategoriesDAO catdao = new CategoriesDAO();
                                        ProductDAO pdao = new ProductDAO();
                                        LinkedList<String> cat = catdao.getTypeCategoriesByCatName("Khuôn, khay");
                                        Map<String, LinkedList<Product>> map = new HashMap<>();
                                        LinkedList<Product> pro = new LinkedList<>();

                                        for (String c : cat) {
                                            pro = pdao.get4ProByTypeCategories(c);
                                            map.put(c, pro);
                                            pro = new LinkedList<>();
                                        }
                                        request.setAttribute("cat", map);
                                        request.getRequestDispatcher("/index.jsp").forward(request, response);
                                    } else {
                                        if (path.endsWith("/ProductController/tuiHopBanh")) {
                                            CategoriesDAO catdao = new CategoriesDAO();
                                            ProductDAO pdao = new ProductDAO();
                                            LinkedList<String> cat = catdao.getTypeCategoriesByCatName("Túi, hộp bánh");
                                            Map<String, LinkedList<Product>> map = new HashMap<>();
                                            LinkedList<Product> pro = new LinkedList<>();

                                            for (String c : cat) {
                                                pro = pdao.get4ProByTypeCategories(c);
                                                map.put(c, pro);
                                                pro = new LinkedList<>();
                                            }
                                            request.setAttribute("cat", map);
                                            request.getRequestDispatcher("/index.jsp").forward(request, response);
                                        } else {
                                            if (path.endsWith("/ProductController/mayLamBanh")) {
                                                CategoriesDAO catdao = new CategoriesDAO();
                                                ProductDAO pdao = new ProductDAO();
                                                LinkedList<String> cat = catdao.getTypeCategoriesByCatName("Máy làm bánh");
                                                Map<String, LinkedList<Product>> map = new HashMap<>();
                                                LinkedList<Product> pro = new LinkedList<>();

                                                for (String c : cat) {
                                                    pro = pdao.get4ProByTypeCategories(c);
                                                    map.put(c, pro);
                                                    pro = new LinkedList<>();
                                                }
                                                request.setAttribute("cat", map);
                                                request.getRequestDispatcher("/index.jsp").forward(request, response);
                                            } else {
                                                if (path.endsWith("/ProductController/setNguyenLieu/sinhNhat") || path.startsWith("/ProductController/setNguyenLieu/sinhNhat/index")) {
                                                    request.setAttribute("path", "ProductController/setNguyenLieu/sinhNhat");
                                                    int index = 0;
                                                    String[] split = path.split("/");
                                                    try {
                                                        if (split.length == 4) {
                                                            index = 1;
                                                        } else {
                                                            index = Integer.parseInt(split[split.length - 1]);
                                                        }

                                                        int totalPro = dao.getTotalProByTypeCategories("Set nguyên liệu bánh sinh nhật");
                                                        int endPage = totalPro / 16;
                                                        if ((totalPro % 16) != 0) {
                                                            endPage++;
                                                        }

                                                        LinkedList<Product> list = dao.pagingProByCategories(index, "Set nguyên liệu bánh sinh nhật");
                                                        request.setAttribute("listPro", list);
                                                        request.setAttribute("endP", endPage);

                                                        request.getRequestDispatcher("/index.jsp").forward(request, response);
                                                    } catch (Exception e) {
                                                        response.sendRedirect("/ProductController/setNguyenLieu/sinhNhat");
                                                    }

                                                } else {
                                                    if (path.endsWith("/ProductController/setNguyenLieu/cookie") || path.startsWith("/ProductController/setNguyenLieu/cookie/index")) {
                                                        request.setAttribute("path", "ProductController/setNguyenLieu/cookie");
                                                        int index = 0;
                                                        String[] split = path.split("/");
                                                        try {
                                                            if (split.length == 4) {
                                                                index = 1;
                                                            } else {
                                                                index = Integer.parseInt(split[split.length - 1]);
                                                            }

                                                            int totalPro = dao.getTotalProByTypeCategories("Set nguyên liệu bánh cookie");
                                                            int endPage = totalPro / 16;
                                                            if ((totalPro % 16) != 0) {
                                                                endPage++;
                                                            }

                                                            LinkedList<Product> list = dao.pagingProByCategories(index, "Set nguyên liệu bánh cookie");
                                                            request.setAttribute("listPro", list);
                                                            request.setAttribute("endP", endPage);

                                                            request.getRequestDispatcher("/index.jsp").forward(request, response);
                                                        } catch (Exception e) {
                                                            response.sendRedirect("/ProductController/setNguyenLieu/cookie");
                                                        }

                                                    } else {
                                                        if (path.endsWith("/ProductController/setNguyenLieu/banhMi") || path.startsWith("/ProductController/setNguyenLieu/banhMi/index")) {
                                                            request.setAttribute("path", "ProductController/setNguyenLieu/banhMi");
                                                            int index = 0;
                                                            String[] split = path.split("/");
                                                            try {
                                                                if (split.length == 4) {
                                                                    index = 1;
                                                                } else {
                                                                    index = Integer.parseInt(split[split.length - 1]);
                                                                }

                                                                int totalPro = dao.getTotalProByTypeCategories("Set nguyên liệu bánh mì");
                                                                int endPage = totalPro / 16;
                                                                if ((totalPro % 16) != 0) {
                                                                    endPage++;
                                                                }

                                                                LinkedList<Product> list = dao.pagingProByCategories(index, "Set nguyên liệu bánh mì");
                                                                request.setAttribute("listPro", list);
                                                                request.setAttribute("endP", endPage);

                                                                request.getRequestDispatcher("/index.jsp").forward(request, response);
                                                            } catch (Exception e) {
                                                                response.sendRedirect("/ProductController/setNguyenLieu/banhMi");
                                                            }

                                                        } else {
                                                            if (path.endsWith("/ProductController/setNguyenLieu/anVat") || path.startsWith("/ProductController/setNguyenLieu/anVat/index")) {
                                                                request.setAttribute("path", "ProductController/setNguyenLieu/anVat");
                                                                int index = 0;
                                                                String[] split = path.split("/");
                                                                try {
                                                                    if (split.length == 4) {
                                                                        index = 1;
                                                                    } else {
                                                                        index = Integer.parseInt(split[split.length - 1]);
                                                                    }

                                                                    int totalPro = dao.getTotalProByTypeCategories("Set nguyên liệu bánh ăn vặt");
                                                                    int endPage = totalPro / 16;
                                                                    if ((totalPro % 16) != 0) {
                                                                        endPage++;
                                                                    }

                                                                    LinkedList<Product> list = dao.pagingProByCategories(index, "Set nguyên liệu bánh ăn vặt");
                                                                    request.setAttribute("listPro", list);
                                                                    request.setAttribute("endP", endPage);

                                                                    request.getRequestDispatcher("/index.jsp").forward(request, response);
                                                                } catch (Exception e) {
                                                                    response.sendRedirect("/ProductController/setNguyenLieu/anVat");
                                                                }

                                                            } else {
                                                                if (path.endsWith("/ProductController/setNguyenLieu/socola") || path.startsWith("/ProductController/setNguyenLieu/socola/index")) {
                                                                    request.setAttribute("path", "ProductController/setNguyenLieu/socola");
                                                                    int index = 0;
                                                                    String[] split = path.split("/");
                                                                    try {
                                                                        if (split.length == 4) {
                                                                            index = 1;
                                                                        } else {
                                                                            index = Integer.parseInt(split[split.length - 1]);
                                                                        }

                                                                        int totalPro = dao.getTotalProByTypeCategories("Set nguyên liệu làm socola");
                                                                        int endPage = totalPro / 16;
                                                                        if ((totalPro % 16) != 0) {
                                                                            endPage++;
                                                                        }

                                                                        LinkedList<Product> list = dao.pagingProByCategories(index, "Set nguyên liệu làm socola");
                                                                        request.setAttribute("listPro", list);
                                                                        request.setAttribute("endP", endPage);

                                                                        request.getRequestDispatcher("/index.jsp").forward(request, response);
                                                                    } catch (Exception e) {
                                                                        response.sendRedirect("/ProductController/setNguyenLieu/socola");
                                                                    }

                                                                }
                                                                if (path.endsWith("/ProductController/kemBoSuaPhomai/bo") || path.startsWith("/ProductController/kemBoSuaPhomai/bo/index")) {
                                                                    request.setAttribute("path", "ProductController/kemBoSuaPhomai/bo");
                                                                    int index = 0;
                                                                    String[] split = path.split("/");
                                                                    try {
                                                                        if (split.length == 4) {
                                                                            index = 1;
                                                                        } else {
                                                                            index = Integer.parseInt(split[split.length - 1]);
                                                                        }

                                                                        int totalPro = dao.getTotalProByTypeCategories("Bơ");
                                                                        int endPage = totalPro / 16;
                                                                        if ((totalPro % 16) != 0) {
                                                                            endPage++;
                                                                        }

                                                                        LinkedList<Product> list = dao.pagingProByCategories(index, "Bơ");
                                                                        request.setAttribute("listPro", list);
                                                                        request.setAttribute("endP", endPage);

                                                                        request.getRequestDispatcher("/index.jsp").forward(request, response);
                                                                    } catch (Exception e) {
                                                                        response.sendRedirect("/ProductController/kemBoSuaPhomai/bo");
                                                                    }

                                                                } else {
                                                                    if (path.endsWith("/ProductController/kemBoSuaPhomai/Whipping") || path.startsWith("/ProductController/kemBoSuaPhomai/Whipping/index")) {
                                                                        request.setAttribute("path", "ProductController/kemBoSuaPhomai/Whipping");
                                                                        int index = 0;
                                                                        String[] split = path.split("/");
                                                                        try {
                                                                            if (split.length == 4) {
                                                                                index = 1;
                                                                            } else {
                                                                                index = Integer.parseInt(split[split.length - 1]);
                                                                            }

                                                                            int totalPro = dao.getTotalProByTypeCategories("Whipping(Cream)");
                                                                            int endPage = totalPro / 16;
                                                                            if ((totalPro % 16) != 0) {
                                                                                endPage++;
                                                                            }

                                                                            LinkedList<Product> list = dao.pagingProByCategories(index, "Whipping(Cream)");
                                                                            request.setAttribute("listPro", list);
                                                                            request.setAttribute("endP", endPage);

                                                                            request.getRequestDispatcher("/index.jsp").forward(request, response);
                                                                        } catch (Exception e) {
                                                                            response.sendRedirect("/ProductController/kemBoSuaPhomai/Whipping");
                                                                        }

                                                                    } else {
                                                                        if (path.endsWith("/ProductController/kemBoSuaPhomai/PhoMai") || path.startsWith("/ProductController/kemBoSuaPhomai/PhoMai/index")) {
                                                                            request.setAttribute("path", "ProductController/kemBoSuaPhomai/PhoMai");
                                                                            int index = 0;
                                                                            String[] split = path.split("/");
                                                                            try {
                                                                                if (split.length == 4) {
                                                                                    index = 1;
                                                                                } else {
                                                                                    index = Integer.parseInt(split[split.length - 1]);
                                                                                }

                                                                                int totalPro = dao.getTotalProByTypeCategories("Phô mai(cheese)");
                                                                                int endPage = totalPro / 16;
                                                                                if ((totalPro % 16) != 0) {
                                                                                    endPage++;
                                                                                }

                                                                                LinkedList<Product> list = dao.pagingProByCategories(index, "Phô mai(cheese)");
                                                                                request.setAttribute("listPro", list);
                                                                                request.setAttribute("endP", endPage);

                                                                                request.getRequestDispatcher("/index.jsp").forward(request, response);
                                                                            } catch (Exception e) {
                                                                                response.sendRedirect("/ProductController/kemBoSuaPhomai/PhoMai");
                                                                            }

                                                                        } else {
                                                                            if (path.endsWith("/ProductController/kemBoSuaPhomai/Sua") || path.startsWith("/ProductController/kemBoSuaPhomai/Sua/index")) {
                                                                                request.setAttribute("path", "ProductController/kemBoSuaPhomai/Sua");
                                                                                int index = 0;
                                                                                String[] split = path.split("/");
                                                                                try {
                                                                                    if (split.length == 4) {
                                                                                        index = 1;
                                                                                    } else {
                                                                                        index = Integer.parseInt(split[split.length - 1]);
                                                                                    }

                                                                                    int totalPro = dao.getTotalProByTypeCategories("Sữa và sản phẩm làm từ sữa");
                                                                                    int endPage = totalPro / 16;
                                                                                    if ((totalPro % 16) != 0) {
                                                                                        endPage++;
                                                                                    }

                                                                                    LinkedList<Product> list = dao.pagingProByCategories(index, "Sữa và sản phẩm làm từ sữa");
                                                                                    request.setAttribute("listPro", list);
                                                                                    request.setAttribute("endP", endPage);

                                                                                    request.getRequestDispatcher("/index.jsp").forward(request, response);
                                                                                } catch (Exception e) {
                                                                                    response.sendRedirect("/ProductController/kemBoSuaPhomai/Sua");
                                                                                }

                                                                            } else {
                                                                                if (path.endsWith("/ProductController/botLamBanh/BotMi") || path.startsWith("/ProductController/botLamBanh/BotMi/index")) {
                                                                                    request.setAttribute("path", "ProductController/botLamBanh/BotMi");
                                                                                    int index = 0;
                                                                                    String[] split = path.split("/");
                                                                                    try {
                                                                                        if (split.length == 4) {
                                                                                            index = 1;
                                                                                        } else {
                                                                                            index = Integer.parseInt(split[split.length - 1]);
                                                                                        }

                                                                                        int totalPro = dao.getTotalProByTypeCategories("Bột mì làm bánh");
                                                                                        int endPage = totalPro / 16;
                                                                                        if ((totalPro % 16) != 0) {
                                                                                            endPage++;
                                                                                        }

                                                                                        LinkedList<Product> list = dao.pagingProByCategories(index, "Bột mì làm bánh");
                                                                                        request.setAttribute("listPro", list);
                                                                                        request.setAttribute("endP", endPage);

                                                                                        request.getRequestDispatcher("/index.jsp").forward(request, response);
                                                                                    } catch (Exception e) {
                                                                                        response.sendRedirect("/ProductController/botLamBanh/BotMi");
                                                                                    }

                                                                                } else {
                                                                                    if (path.endsWith("/ProductController/botLamBanh/BotMiNguyenCam") || path.startsWith("/ProductController/botLamBanh/BotMiNguyenCam/index")) {
                                                                                        request.setAttribute("path", "ProductController/botLamBanh/BotMiNguyenCam");
                                                                                        int index = 0;
                                                                                        String[] split = path.split("/");
                                                                                        try {
                                                                                            if (split.length == 4) {
                                                                                                index = 1;
                                                                                            } else {
                                                                                                index = Integer.parseInt(split[split.length - 1]);
                                                                                            }

                                                                                            int totalPro = dao.getTotalProByTypeCategories("Bột mì nguyên cám");
                                                                                            int endPage = totalPro / 16;
                                                                                            if ((totalPro % 16) != 0) {
                                                                                                endPage++;
                                                                                            }

                                                                                            LinkedList<Product> list = dao.pagingProByCategories(index, "Bột mì nguyên cám");
                                                                                            request.setAttribute("listPro", list);
                                                                                            request.setAttribute("endP", endPage);

                                                                                            request.getRequestDispatcher("/index.jsp").forward(request, response);
                                                                                        } catch (Exception e) {
                                                                                            response.sendRedirect("/ProductController/botLamBanh/BotMiNguyenCam");
                                                                                        }

                                                                                    } else {
                                                                                        if (path.endsWith("/ProductController/botLamBanh/BotTronSan") || path.startsWith("/ProductController/botLamBanh/BotTronSan/index")) {
                                                                                            request.setAttribute("path", "ProductController/botLamBanh/BotTronSan");
                                                                                            int index = 0;
                                                                                            String[] split = path.split("/");
                                                                                            try {
                                                                                                if (split.length == 4) {
                                                                                                    index = 1;
                                                                                                } else {
                                                                                                    index = Integer.parseInt(split[split.length - 1]);
                                                                                                }

                                                                                                int totalPro = dao.getTotalProByTypeCategories("Bột trộn sẵn");
                                                                                                int endPage = totalPro / 16;
                                                                                                if ((totalPro % 16) != 0) {
                                                                                                    endPage++;
                                                                                                }

                                                                                                LinkedList<Product> list = dao.pagingProByCategories(index, "Bột trộn sẵn");
                                                                                                request.setAttribute("listPro", list);
                                                                                                request.setAttribute("endP", endPage);

                                                                                                request.getRequestDispatcher("/index.jsp").forward(request, response);
                                                                                            } catch (Exception e) {
                                                                                                response.sendRedirect("/ProductController/botLamBanh/BotTronSan");
                                                                                            }

                                                                                        } else {
                                                                                            if (path.endsWith("/ProductController/botLamBanh/BotKhac") || path.startsWith("/ProductController/botLamBanh/BotKhac/index")) {
                                                                                                request.setAttribute("path", "ProductController/botLamBanh/BotKhac");
                                                                                                int index = 0;
                                                                                                String[] split = path.split("/");
                                                                                                try {
                                                                                                    if (split.length == 4) {
                                                                                                        index = 1;
                                                                                                    } else {
                                                                                                        index = Integer.parseInt(split[split.length - 1]);
                                                                                                    }

                                                                                                    int totalPro = dao.getTotalProByTypeCategories("Bột làm bánh khác");
                                                                                                    int endPage = totalPro / 16;
                                                                                                    if ((totalPro % 16) != 0) {
                                                                                                        endPage++;
                                                                                                    }

                                                                                                    LinkedList<Product> list = dao.pagingProByCategories(index, "Bột làm bánh khác");
                                                                                                    request.setAttribute("listPro", list);
                                                                                                    request.setAttribute("endP", endPage);

                                                                                                    request.getRequestDispatcher("/index.jsp").forward(request, response);
                                                                                                } catch (Exception e) {
                                                                                                    response.sendRedirect("/ProductController/botLamBanh/BotKhac");
                                                                                                }

                                                                                            } else {
                                                                                                if (path.endsWith("/ProductController/phuGia/MenNo") || path.startsWith("/ProductController/phuGia/MenNo/index")) {
                                                                                                    request.setAttribute("path", "ProductController/phuGia/MenNo");
                                                                                                    int index = 0;
                                                                                                    String[] split = path.split("/");
                                                                                                    try {
                                                                                                        if (split.length == 4) {
                                                                                                            index = 1;
                                                                                                        } else {
                                                                                                            index = Integer.parseInt(split[split.length - 1]);
                                                                                                        }

                                                                                                        int totalPro = dao.getTotalProByTypeCategories("Men nở và phụ gia nhỏ");
                                                                                                        int endPage = totalPro / 16;
                                                                                                        if ((totalPro % 16) != 0) {
                                                                                                            endPage++;
                                                                                                        }

                                                                                                        LinkedList<Product> list = dao.pagingProByCategories(index, "Men nở và phụ gia nhỏ");
                                                                                                        request.setAttribute("listPro", list);
                                                                                                        request.setAttribute("endP", endPage);

                                                                                                        request.getRequestDispatcher("/index.jsp").forward(request, response);
                                                                                                    } catch (Exception e) {
                                                                                                        response.sendRedirect("/ProductController/phuGia/MenNo");
                                                                                                    }

                                                                                                } else {
                                                                                                    if (path.endsWith("/ProductController/phuGia/Duong") || path.startsWith("/ProductController/phuGia/Duong/index")) {
                                                                                                        request.setAttribute("path", "ProductController/phuGia/Duong");
                                                                                                        int index = 0;
                                                                                                        String[] split = path.split("/");
                                                                                                        try {
                                                                                                            if (split.length == 4) {
                                                                                                                index = 1;
                                                                                                            } else {
                                                                                                                index = Integer.parseInt(split[split.length - 1]);
                                                                                                            }

                                                                                                            int totalPro = dao.getTotalProByTypeCategories("Đường các loại");
                                                                                                            int endPage = totalPro / 16;
                                                                                                            if ((totalPro % 16) != 0) {
                                                                                                                endPage++;
                                                                                                            }

                                                                                                            LinkedList<Product> list = dao.pagingProByCategories(index, "Đường các loại");
                                                                                                            request.setAttribute("listPro", list);
                                                                                                            request.setAttribute("endP", endPage);

                                                                                                            request.getRequestDispatcher("/index.jsp").forward(request, response);
                                                                                                        } catch (Exception e) {
                                                                                                            response.sendRedirect("/ProductController/phuGia/Duong");
                                                                                                        }

                                                                                                    } else {
                                                                                                        if (path.endsWith("/ProductController/phuGia/HuongLieu") || path.startsWith("/ProductController/phuGia/HuongLieu")) {
                                                                                                            request.setAttribute("path", "ProductController/phuGia/HuongLieu");
                                                                                                            int index = 0;
                                                                                                            String[] split = path.split("/");
                                                                                                            try {
                                                                                                                if (split.length == 4) {
                                                                                                                    index = 1;
                                                                                                                } else {
                                                                                                                    index = Integer.parseInt(split[split.length - 1]);
                                                                                                                }

                                                                                                                int totalPro = dao.getTotalProByTypeCategories("Hương liệu và tinh dầu");
                                                                                                                int endPage = totalPro / 16;
                                                                                                                if ((totalPro % 16) != 0) {
                                                                                                                    endPage++;
                                                                                                                }

                                                                                                                LinkedList<Product> list = dao.pagingProByCategories(index, "Hương liệu và tinh dầu");
                                                                                                                request.setAttribute("listPro", list);
                                                                                                                request.setAttribute("endP", endPage);

                                                                                                                request.getRequestDispatcher("/index.jsp").forward(request, response);
                                                                                                            } catch (Exception e) {
                                                                                                                response.sendRedirect("/ProductController/phuGia/HuongLieu");
                                                                                                            }

                                                                                                        } else {
                                                                                                            if (path.endsWith("/ProductController/phuGia/Mau") || path.startsWith("/ProductController/phuGia/Mau/index")) {
                                                                                                                request.setAttribute("path", "ProductController/phuGia/Mau");
                                                                                                                int index = 0;
                                                                                                                String[] split = path.split("/");
                                                                                                                try {
                                                                                                                    if (split.length == 4) {
                                                                                                                        index = 1;
                                                                                                                    } else {
                                                                                                                        index = Integer.parseInt(split[split.length - 1]);
                                                                                                                    }

                                                                                                                    int totalPro = dao.getTotalProByTypeCategories("Màu thực phẩm");
                                                                                                                    int endPage = totalPro / 16;
                                                                                                                    if ((totalPro % 16) != 0) {
                                                                                                                        endPage++;
                                                                                                                    }

                                                                                                                    LinkedList<Product> list = dao.pagingProByCategories(index, "Màu thực phẩm");
                                                                                                                    request.setAttribute("listPro", list);
                                                                                                                    request.setAttribute("endP", endPage);

                                                                                                                    request.getRequestDispatcher("/index.jsp").forward(request, response);
                                                                                                                } catch (Exception e) {
                                                                                                                    response.sendRedirect("/ProductController/phuGia/Mau");
                                                                                                                }

                                                                                                            } else {
                                                                                                                if (path.endsWith("/ProductController/nguyeLieuLamSocola/Hat") || path.startsWith("/ProductController/nguyeLieuLamSocola/Hat/index")) {
                                                                                                                    request.setAttribute("path", "ProductController/nguyeLieuLamSocola/Hat");
                                                                                                                    int index = 0;
                                                                                                                    String[] split = path.split("/");
                                                                                                                    try {
                                                                                                                        if (split.length == 4) {
                                                                                                                            index = 1;
                                                                                                                        } else {
                                                                                                                            index = Integer.parseInt(split[split.length - 1]);
                                                                                                                        }

                                                                                                                        int totalPro = dao.getTotalProByTypeCategories("Socola hạt");
                                                                                                                        int endPage = totalPro / 16;
                                                                                                                        if ((totalPro % 16) != 0) {
                                                                                                                            endPage++;
                                                                                                                        }

                                                                                                                        LinkedList<Product> list = dao.pagingProByCategories(index, "Socola hạt");
                                                                                                                        request.setAttribute("listPro", list);
                                                                                                                        request.setAttribute("endP", endPage);

                                                                                                                        request.getRequestDispatcher("/index.jsp").forward(request, response);
                                                                                                                    } catch (Exception e) {
                                                                                                                        response.sendRedirect("/ProductController/nguyeLieuLamSocola/Hat");
                                                                                                                    }

                                                                                                                } else {
                                                                                                                    if (path.endsWith("/ProductController/nguyeLieuLamSocola/Thanh") || path.startsWith("/ProductController/nguyeLieuLamSocola/Thanh/index")) {
                                                                                                                        request.setAttribute("path", "ProductController/nguyeLieuLamSocola/Thanh");
                                                                                                                        int index = 0;
                                                                                                                        String[] split = path.split("/");
                                                                                                                        try {
                                                                                                                            if (split.length == 4) {
                                                                                                                                index = 1;
                                                                                                                            } else {
                                                                                                                                index = Integer.parseInt(split[split.length - 1]);
                                                                                                                            }

                                                                                                                            int totalPro = dao.getTotalProByTypeCategories("Socola thanh");
                                                                                                                            int endPage = totalPro / 16;
                                                                                                                            if ((totalPro % 16) != 0) {
                                                                                                                                endPage++;
                                                                                                                            }

                                                                                                                            LinkedList<Product> list = dao.pagingProByCategories(index, "Socola thanh");
                                                                                                                            request.setAttribute("listPro", list);
                                                                                                                            request.setAttribute("endP", endPage);

                                                                                                                            request.getRequestDispatcher("/index.jsp").forward(request, response);
                                                                                                                        } catch (Exception e) {
                                                                                                                            response.sendRedirect("/ProductController/nguyeLieuLamSocola/Thanh");
                                                                                                                        }

                                                                                                                    } else {
                                                                                                                        if (path.endsWith("/ProductController/nguyeLieuLamSocola/TrangTri") || path.startsWith("/ProductController/nguyeLieuLamSocola/TrangTri/index")) {
                                                                                                                            request.setAttribute("path", "ProductController/nguyeLieuLamSocola/TrangTri");
                                                                                                                            int index = 0;
                                                                                                                            String[] split = path.split("/");
                                                                                                                            try {
                                                                                                                                if (split.length == 4) {
                                                                                                                                    index = 1;
                                                                                                                                } else {
                                                                                                                                    index = Integer.parseInt(split[split.length - 1]);
                                                                                                                                }

                                                                                                                                int totalPro = dao.getTotalProByTypeCategories("Nguyên liệu trang trí socola");
                                                                                                                                int endPage = totalPro / 16;
                                                                                                                                if ((totalPro % 16) != 0) {
                                                                                                                                    endPage++;
                                                                                                                                }

                                                                                                                                LinkedList<Product> list = dao.pagingProByCategories(index, "Nguyên liệu trang trí socola");
                                                                                                                                request.setAttribute("listPro", list);
                                                                                                                                request.setAttribute("endP", endPage);

                                                                                                                                request.getRequestDispatcher("/index.jsp").forward(request, response);
                                                                                                                            } catch (Exception e) {
                                                                                                                                response.sendRedirect("/ProductController/nguyeLieuLamSocola/TrangTri");
                                                                                                                            }

                                                                                                                        } else {
                                                                                                                            if (path.endsWith("/ProductController/dungCuLamBanh/DoLuong") || path.startsWith("/ProductController/dungCuLamBanh/DoLuong/index")) {
                                                                                                                                request.setAttribute("path", "ProductController/dungCuLamBanh/DoLuong");
                                                                                                                                int index = 0;
                                                                                                                                String[] split = path.split("/");
                                                                                                                                try {
                                                                                                                                    if (split.length == 4) {
                                                                                                                                        index = 1;
                                                                                                                                    } else {
                                                                                                                                        index = Integer.parseInt(split[split.length - 1]);
                                                                                                                                    }

                                                                                                                                    int totalPro = dao.getTotalProByTypeCategories("Dụng cụ đo lường");
                                                                                                                                    int endPage = totalPro / 16;
                                                                                                                                    if ((totalPro % 16) != 0) {
                                                                                                                                        endPage++;
                                                                                                                                    }

                                                                                                                                    LinkedList<Product> list = dao.pagingProByCategories(index, "Dụng cụ đo lường");
                                                                                                                                    request.setAttribute("listPro", list);
                                                                                                                                    request.setAttribute("endP", endPage);

                                                                                                                                    request.getRequestDispatcher("/index.jsp").forward(request, response);
                                                                                                                                } catch (Exception e) {
                                                                                                                                    response.sendRedirect("/ProductController/dungCuLamBanh/DoLuong");
                                                                                                                                }

                                                                                                                            } else {
                                                                                                                                if (path.endsWith("/ProductController/dungCuLamBanh/DaoTron") || path.startsWith("/ProductController/dungCuLamBanh/DaoTron/index")) {
                                                                                                                                    request.setAttribute("path", "ProductController/dungCuLamBanh/DaoTron");
                                                                                                                                    int index = 0;
                                                                                                                                    String[] split = path.split("/");
                                                                                                                                    try {
                                                                                                                                        if (split.length == 4) {
                                                                                                                                            index = 1;
                                                                                                                                        } else {
                                                                                                                                            index = Integer.parseInt(split[split.length - 1]);
                                                                                                                                        }

                                                                                                                                        int totalPro = dao.getTotalProByTypeCategories("Dụng cụ đảo, khuấy, trộn");
                                                                                                                                        int endPage = totalPro / 16;
                                                                                                                                        if ((totalPro % 16) != 0) {
                                                                                                                                            endPage++;
                                                                                                                                        }

                                                                                                                                        LinkedList<Product> list = dao.pagingProByCategories(index, "Dụng cụ đảo, khuấy, trộn");
                                                                                                                                        request.setAttribute("listPro", list);
                                                                                                                                        request.setAttribute("endP", endPage);

                                                                                                                                        request.getRequestDispatcher("/index.jsp").forward(request, response);
                                                                                                                                    } catch (Exception e) {
                                                                                                                                        response.sendRedirect("/ProductController/dungCuLamBanh/DaoTron");
                                                                                                                                    }

                                                                                                                                } else {
                                                                                                                                    if (path.endsWith("/ProductController/dungCuLamBanh/CanCat") || path.startsWith("/ProductController/dungCuLamBanh/CanCat/index")) {
                                                                                                                                        request.setAttribute("path", "ProductController/dungCuLamBanh/CanCat");
                                                                                                                                        int index = 0;
                                                                                                                                        String[] split = path.split("/");
                                                                                                                                        try {
                                                                                                                                            if (split.length == 4) {
                                                                                                                                                index = 1;
                                                                                                                                            } else {
                                                                                                                                                index = Integer.parseInt(split[split.length - 1]);
                                                                                                                                            }

                                                                                                                                            int totalPro = dao.getTotalProByTypeCategories("Dụng cụ cán, cắt");
                                                                                                                                            int endPage = totalPro / 16;
                                                                                                                                            if ((totalPro % 16) != 0) {
                                                                                                                                                endPage++;
                                                                                                                                            }

                                                                                                                                            LinkedList<Product> list = dao.pagingProByCategories(index, "Dụng cụ cán, cắt");
                                                                                                                                            request.setAttribute("listPro", list);
                                                                                                                                            request.setAttribute("endP", endPage);

                                                                                                                                            request.getRequestDispatcher("/index.jsp").forward(request, response);
                                                                                                                                        } catch (Exception e) {
                                                                                                                                            response.sendRedirect("/ProductController/dungCuLamBanh/CanCat");
                                                                                                                                        }

                                                                                                                                    } else {
                                                                                                                                        if (path.endsWith("/ProductController/dungCuLamBanh/NhoiNuong") || path.startsWith("/ProductController/dungCuLamBanh/NhoiNuong/index")) {
                                                                                                                                            request.setAttribute("path", "ProductController/dungCuLamBanh/NhoiNuong");
                                                                                                                                            int index = 0;
                                                                                                                                            String[] split = path.split("/");
                                                                                                                                            try {
                                                                                                                                                if (split.length == 4) {
                                                                                                                                                    index = 1;
                                                                                                                                                } else {
                                                                                                                                                    index = Integer.parseInt(split[split.length - 1]);
                                                                                                                                                }

                                                                                                                                                int totalPro = dao.getTotalProByTypeCategories("Dụng cụ nhồi bột, nướng bánh");
                                                                                                                                                int endPage = totalPro / 16;
                                                                                                                                                if ((totalPro % 16) != 0) {
                                                                                                                                                    endPage++;
                                                                                                                                                }

                                                                                                                                                LinkedList<Product> list = dao.pagingProByCategories(index, "Dụng cụ nhồi bột, nướng bánh");
                                                                                                                                                request.setAttribute("listPro", list);
                                                                                                                                                request.setAttribute("endP", endPage);

                                                                                                                                                request.getRequestDispatcher("/index.jsp").forward(request, response);
                                                                                                                                            } catch (Exception e) {
                                                                                                                                                response.sendRedirect("/ProductController/dungCuLamBanh/NhoiNuong");
                                                                                                                                            }

                                                                                                                                        } else {
                                                                                                                                            if (path.endsWith("/ProductController/khuonKhay/KhuonBanhMi") || path.startsWith("/ProductController/khuonKhay/KhuonBanhMi/index")) {
                                                                                                                                                request.setAttribute("path", "ProductController/khuonKhay/KhuonBanhMi");
                                                                                                                                                int index = 0;
                                                                                                                                                String[] split = path.split("/");
                                                                                                                                                try {
                                                                                                                                                    if (split.length == 4) {
                                                                                                                                                        index = 1;
                                                                                                                                                    } else {
                                                                                                                                                        index = Integer.parseInt(split[split.length - 1]);
                                                                                                                                                    }

                                                                                                                                                    int totalPro = dao.getTotalProByTypeCategories("Khuôn bánh mì");
                                                                                                                                                    int endPage = totalPro / 16;
                                                                                                                                                    if ((totalPro % 16) != 0) {
                                                                                                                                                        endPage++;
                                                                                                                                                    }

                                                                                                                                                    LinkedList<Product> list = dao.pagingProByCategories(index, "Khuôn bánh mì");
                                                                                                                                                    request.setAttribute("listPro", list);
                                                                                                                                                    request.setAttribute("endP", endPage);

                                                                                                                                                    request.getRequestDispatcher("/index.jsp").forward(request, response);
                                                                                                                                                } catch (Exception e) {
                                                                                                                                                    response.sendRedirect("/ProductController/khuonKhay/KhuonBanhMi");
                                                                                                                                                }

                                                                                                                                            } else {
                                                                                                                                                if (path.endsWith("/ProductController/khuonKhay/KhuonCookie") || path.startsWith("/ProductController/khuonKhay/KhuonCookie/index")) {
                                                                                                                                                    request.setAttribute("path", "ProductController/khuonKhay/KhuonCookie");
                                                                                                                                                    int index = 0;
                                                                                                                                                    String[] split = path.split("/");
                                                                                                                                                    try {
                                                                                                                                                        if (split.length == 4) {
                                                                                                                                                            index = 1;
                                                                                                                                                        } else {
                                                                                                                                                            index = Integer.parseInt(split[split.length - 1]);
                                                                                                                                                        }

                                                                                                                                                        int totalPro = dao.getTotalProByTypeCategories("Khuôn bánh cookie");
                                                                                                                                                        int endPage = totalPro / 16;
                                                                                                                                                        if ((totalPro % 16) != 0) {
                                                                                                                                                            endPage++;
                                                                                                                                                        }

                                                                                                                                                        LinkedList<Product> list = dao.pagingProByCategories(index, "Khuôn bánh cookie");
                                                                                                                                                        request.setAttribute("listPro", list);
                                                                                                                                                        request.setAttribute("endP", endPage);

                                                                                                                                                        request.getRequestDispatcher("/index.jsp").forward(request, response);
                                                                                                                                                    } catch (Exception e) {
                                                                                                                                                        response.sendRedirect("/ProductController/khuonKhay/KhuonCookie");
                                                                                                                                                    }

                                                                                                                                                } else {
                                                                                                                                                    if (path.endsWith("/ProductController/khuonKhay/KhuonSocola") || path.startsWith("/ProductController/khuonKhay/KhuonSocola/index")) {
                                                                                                                                                        request.setAttribute("path", "ProductController/khuonKhay/KhuonSocola");
                                                                                                                                                        int index = 0;
                                                                                                                                                        String[] split = path.split("/");
                                                                                                                                                        try {
                                                                                                                                                            if (split.length == 4) {
                                                                                                                                                                index = 1;
                                                                                                                                                            } else {
                                                                                                                                                                index = Integer.parseInt(split[split.length - 1]);
                                                                                                                                                            }

                                                                                                                                                            int totalPro = dao.getTotalProByTypeCategories("Khuôn thạch, socola");
                                                                                                                                                            int endPage = totalPro / 16;
                                                                                                                                                            if ((totalPro % 16) != 0) {
                                                                                                                                                                endPage++;
                                                                                                                                                            }

                                                                                                                                                            LinkedList<Product> list = dao.pagingProByCategories(index, "Khuôn thạch, socola");
                                                                                                                                                            request.setAttribute("listPro", list);
                                                                                                                                                            request.setAttribute("endP", endPage);

                                                                                                                                                            request.getRequestDispatcher("/index.jsp").forward(request, response);
                                                                                                                                                        } catch (Exception e) {
                                                                                                                                                            response.sendRedirect("/ProductController/khuonKhay/KhuonSocola");
                                                                                                                                                        }

                                                                                                                                                    } else {
                                                                                                                                                        if (path.endsWith("/ProductController/khuonKhay/KhayNuong") || path.startsWith("/ProductController/khuonKhay/KhayNuong/index")) {
                                                                                                                                                            request.setAttribute("path", "ProductController/khuonKhay/KhayNuong");
                                                                                                                                                            int index = 0;
                                                                                                                                                            String[] split = path.split("/");
                                                                                                                                                            try {
                                                                                                                                                                if (split.length == 4) {
                                                                                                                                                                    index = 1;
                                                                                                                                                                } else {
                                                                                                                                                                    index = Integer.parseInt(split[split.length - 1]);
                                                                                                                                                                }

                                                                                                                                                                int totalPro = dao.getTotalProByTypeCategories("Khay nướng bánh");
                                                                                                                                                                int endPage = totalPro / 16;
                                                                                                                                                                if ((totalPro % 16) != 0) {
                                                                                                                                                                    endPage++;
                                                                                                                                                                }

                                                                                                                                                                LinkedList<Product> list = dao.pagingProByCategories(index, "Khay nướng bánh");
                                                                                                                                                                request.setAttribute("listPro", list);
                                                                                                                                                                request.setAttribute("endP", endPage);

                                                                                                                                                                request.getRequestDispatcher("/index.jsp").forward(request, response);
                                                                                                                                                            } catch (Exception e) {
                                                                                                                                                                response.sendRedirect("/ProductController/khuonKhay/KhayNuong");
                                                                                                                                                            }

                                                                                                                                                        } else {
                                                                                                                                                            if (path.endsWith("/ProductController/tuiHopBanh/HopGato") || path.startsWith("/ProductController/tuiHopBanh/HopGato/index")) {
                                                                                                                                                                request.setAttribute("path", "ProductController/tuiHopBanh/HopGato");
                                                                                                                                                                int index = 0;
                                                                                                                                                                String[] split = path.split("/");
                                                                                                                                                                try {
                                                                                                                                                                    if (split.length == 4) {
                                                                                                                                                                        index = 1;
                                                                                                                                                                    } else {
                                                                                                                                                                        index = Integer.parseInt(split[split.length - 1]);
                                                                                                                                                                    }

                                                                                                                                                                    int totalPro = dao.getTotalProByTypeCategories("Hộp bánh gato");
                                                                                                                                                                    int endPage = totalPro / 16;
                                                                                                                                                                    if ((totalPro % 16) != 0) {
                                                                                                                                                                        endPage++;
                                                                                                                                                                    }

                                                                                                                                                                    LinkedList<Product> list = dao.pagingProByCategories(index, "Hộp bánh gato");
                                                                                                                                                                    request.setAttribute("listPro", list);
                                                                                                                                                                    request.setAttribute("endP", endPage);

                                                                                                                                                                    request.getRequestDispatcher("/index.jsp").forward(request, response);
                                                                                                                                                                } catch (Exception e) {
                                                                                                                                                                    response.sendRedirect("/ProductController/tuiHopBanh/HopGato");
                                                                                                                                                                }

                                                                                                                                                            } else {
                                                                                                                                                                if (path.endsWith("/ProductController/tuiHopBanh/HopCupcake") || path.startsWith("/ProductController/tuiHopBanh/HopCupcake/index")) {
                                                                                                                                                                    request.setAttribute("path", "ProductController/tuiHopBanh/HopCupcake");
                                                                                                                                                                    int index = 0;
                                                                                                                                                                    String[] split = path.split("/");
                                                                                                                                                                    try {
                                                                                                                                                                        if (split.length == 4) {
                                                                                                                                                                            index = 1;
                                                                                                                                                                        } else {
                                                                                                                                                                            index = Integer.parseInt(split[split.length - 1]);
                                                                                                                                                                        }

                                                                                                                                                                        int totalPro = dao.getTotalProByTypeCategories("Hộp bánh cupcake");
                                                                                                                                                                        int endPage = totalPro / 16;
                                                                                                                                                                        if ((totalPro % 16) != 0) {
                                                                                                                                                                            endPage++;
                                                                                                                                                                        }

                                                                                                                                                                        LinkedList<Product> list = dao.pagingProByCategories(index, "Hộp bánh cupcake");
                                                                                                                                                                        request.setAttribute("listPro", list);
                                                                                                                                                                        request.setAttribute("endP", endPage);

                                                                                                                                                                        request.getRequestDispatcher("/index.jsp").forward(request, response);
                                                                                                                                                                    } catch (Exception e) {
                                                                                                                                                                        response.sendRedirect("/ProductController/tuiHopBanh/HopCupcake");
                                                                                                                                                                    }

                                                                                                                                                                } else {
                                                                                                                                                                    if (path.endsWith("/ProductController/tuiHopBanh/HopCookie") || path.startsWith("/ProductController/tuiHopBanh/HopCookie/index")) {
                                                                                                                                                                        request.setAttribute("path", "ProductController/tuiHopBanh/HopCookie");
                                                                                                                                                                        int index = 0;
                                                                                                                                                                        String[] split = path.split("/");
                                                                                                                                                                        try {
                                                                                                                                                                            if (split.length == 4) {
                                                                                                                                                                                index = 1;
                                                                                                                                                                            } else {
                                                                                                                                                                                index = Integer.parseInt(split[split.length - 1]);
                                                                                                                                                                            }

                                                                                                                                                                            int totalPro = dao.getTotalProByTypeCategories("Hộp bánh cookie");
                                                                                                                                                                            int endPage = totalPro / 16;
                                                                                                                                                                            if ((totalPro % 16) != 0) {
                                                                                                                                                                                endPage++;
                                                                                                                                                                            }

                                                                                                                                                                            LinkedList<Product> list = dao.pagingProByCategories(index, "Hộp bánh cookie");
                                                                                                                                                                            request.setAttribute("listPro", list);
                                                                                                                                                                            request.setAttribute("endP", endPage);

                                                                                                                                                                            request.getRequestDispatcher("/index.jsp").forward(request, response);
                                                                                                                                                                        } catch (Exception e) {
                                                                                                                                                                            response.sendRedirect("/ProductController/tuiHopBanh/HopCookie");
                                                                                                                                                                        }

                                                                                                                                                                    } else {
                                                                                                                                                                        if (path.endsWith("/ProductController/tuiHopBanh/TuiCookie") || path.startsWith("/ProductController/tuiHopBanh/TuiCookie/index")) {
                                                                                                                                                                            request.setAttribute("path", "ProductController/tuiHopBanh/TuiCookie");
                                                                                                                                                                            int index = 0;
                                                                                                                                                                            String[] split = path.split("/");
                                                                                                                                                                            try {
                                                                                                                                                                                if (split.length == 4) {
                                                                                                                                                                                    index = 1;
                                                                                                                                                                                } else {
                                                                                                                                                                                    index = Integer.parseInt(split[split.length - 1]);
                                                                                                                                                                                }

                                                                                                                                                                                int totalPro = dao.getTotalProByTypeCategories("Túi bánh cookie");
                                                                                                                                                                                int endPage = totalPro / 16;
                                                                                                                                                                                if ((totalPro % 16) != 0) {
                                                                                                                                                                                    endPage++;
                                                                                                                                                                                }

                                                                                                                                                                                LinkedList<Product> list = dao.pagingProByCategories(index, "Túi bánh cookie");
                                                                                                                                                                                request.setAttribute("listPro", list);
                                                                                                                                                                                request.setAttribute("endP", endPage);

                                                                                                                                                                                request.getRequestDispatcher("/index.jsp").forward(request, response);
                                                                                                                                                                            } catch (Exception e) {
                                                                                                                                                                                response.sendRedirect("/ProductController/tuiHopBanh/TuiCookie");
                                                                                                                                                                            }

                                                                                                                                                                        } else {
                                                                                                                                                                            if (path.endsWith("/ProductController/tuiHopBanh/TuiBanhMi") || path.startsWith("/ProductController/tuiHopBanh/TuiBanhMi")) {
                                                                                                                                                                                request.setAttribute("path", "ProductController/tuiHopBanh/TuiBanhMi");
                                                                                                                                                                                int index = 0;
                                                                                                                                                                                String[] split = path.split("/");
                                                                                                                                                                                try {
                                                                                                                                                                                    if (split.length == 4) {
                                                                                                                                                                                        index = 1;
                                                                                                                                                                                    } else {
                                                                                                                                                                                        index = Integer.parseInt(split[split.length - 1]);
                                                                                                                                                                                    }

                                                                                                                                                                                    int totalPro = dao.getTotalProByTypeCategories("Túi bánh mì");
                                                                                                                                                                                    int endPage = totalPro / 16;
                                                                                                                                                                                    if ((totalPro % 16) != 0) {
                                                                                                                                                                                        endPage++;
                                                                                                                                                                                    }

                                                                                                                                                                                    LinkedList<Product> list = dao.pagingProByCategories(index, "Túi bánh mì");
                                                                                                                                                                                    request.setAttribute("listPro", list);
                                                                                                                                                                                    request.setAttribute("endP", endPage);

                                                                                                                                                                                    request.getRequestDispatcher("/index.jsp").forward(request, response);
                                                                                                                                                                                } catch (Exception e) {
                                                                                                                                                                                    response.sendRedirect("/ProductController/tuiHopBanh/TuiBanhMi");
                                                                                                                                                                                }

                                                                                                                                                                            } else {
                                                                                                                                                                                if (path.endsWith("/ProductController/mayLamBanh/LoNuong") || path.startsWith("/ProductController/mayLamBanh/LoNuong/index")) {
                                                                                                                                                                                    request.setAttribute("path", "ProductController/mayLamBanh/LoNuong");
                                                                                                                                                                                    int index = 0;
                                                                                                                                                                                    String[] split = path.split("/");
                                                                                                                                                                                    try {
                                                                                                                                                                                        if (split.length == 4) {
                                                                                                                                                                                            index = 1;
                                                                                                                                                                                        } else {
                                                                                                                                                                                            index = Integer.parseInt(split[split.length - 1]);
                                                                                                                                                                                        }

                                                                                                                                                                                        int totalPro = dao.getTotalProByTypeCategories("Lò nướng bánh");
                                                                                                                                                                                        int endPage = totalPro / 16;
                                                                                                                                                                                        if ((totalPro % 16) != 0) {
                                                                                                                                                                                            endPage++;
                                                                                                                                                                                        }

                                                                                                                                                                                        LinkedList<Product> list = dao.pagingProByCategories(index, "Lò nướng bánh");
                                                                                                                                                                                        request.setAttribute("listPro", list);
                                                                                                                                                                                        request.setAttribute("endP", endPage);

                                                                                                                                                                                        request.getRequestDispatcher("/index.jsp").forward(request, response);
                                                                                                                                                                                    } catch (Exception e) {
                                                                                                                                                                                        response.sendRedirect("/ProductController/mayLamBanh/LoNuong");
                                                                                                                                                                                    }

                                                                                                                                                                                } else {
                                                                                                                                                                                    if (path.endsWith("/ProductController/mayLamBanh/DanhTrung") || path.startsWith("/ProductController/mayLamBanh/DanhTrung/index")) {
                                                                                                                                                                                        request.setAttribute("path", "ProductController/mayLamBanh/DanhTrung");
                                                                                                                                                                                        int index = 0;
                                                                                                                                                                                        String[] split = path.split("/");
                                                                                                                                                                                        try {
                                                                                                                                                                                            if (split.length == 4) {
                                                                                                                                                                                                index = 1;
                                                                                                                                                                                            } else {
                                                                                                                                                                                                index = Integer.parseInt(split[split.length - 1]);
                                                                                                                                                                                            }

                                                                                                                                                                                            int totalPro = dao.getTotalProByTypeCategories("Máy đánh trứng");
                                                                                                                                                                                            int endPage = totalPro / 16;
                                                                                                                                                                                            if ((totalPro % 16) != 0) {
                                                                                                                                                                                                endPage++;
                                                                                                                                                                                            }

                                                                                                                                                                                            LinkedList<Product> list = dao.pagingProByCategories(index, "Máy đánh trứng");
                                                                                                                                                                                            request.setAttribute("listPro", list);
                                                                                                                                                                                            request.setAttribute("endP", endPage);

                                                                                                                                                                                            request.getRequestDispatcher("/index.jsp").forward(request, response);
                                                                                                                                                                                        } catch (Exception e) {
                                                                                                                                                                                            response.sendRedirect("/ProductController/mayLamBanh/DanhTrung");
                                                                                                                                                                                        }

                                                                                                                                                                                    } else {
                                                                                                                                                                                        if (path.endsWith("/ProductController/mayLamBanh/CanDienTu") || path.startsWith("/ProductController/mayLamBanh/CanDienTu")) {
                                                                                                                                                                                            request.setAttribute("path", "ProductController/mayLamBanh/CanDienTu");
                                                                                                                                                                                            int index = 0;
                                                                                                                                                                                            String[] split = path.split("/");
                                                                                                                                                                                            try {
                                                                                                                                                                                                if (split.length == 4) {
                                                                                                                                                                                                    index = 1;
                                                                                                                                                                                                } else {
                                                                                                                                                                                                    index = Integer.parseInt(split[split.length - 1]);
                                                                                                                                                                                                }

                                                                                                                                                                                                int totalPro = dao.getTotalProByTypeCategories("Cân điện tử");
                                                                                                                                                                                                int endPage = totalPro / 16;
                                                                                                                                                                                                if ((totalPro % 16) != 0) {
                                                                                                                                                                                                    endPage++;
                                                                                                                                                                                                }

                                                                                                                                                                                                LinkedList<Product> list = dao.pagingProByCategories(index, "Cân điện tử");
                                                                                                                                                                                                request.setAttribute("listPro", list);
                                                                                                                                                                                                request.setAttribute("endP", endPage);

                                                                                                                                                                                                request.getRequestDispatcher("/index.jsp").forward(request, response);
                                                                                                                                                                                            } catch (Exception e) {
                                                                                                                                                                                                response.sendRedirect("/ProductController/mayLamBanh/CanDienTu");
                                                                                                                                                                                            }

                                                                                                                                                                                        } else {
                                                                                                                                                                                            if (path.endsWith("/ProductController/mayLamBanh/MayKhac") || path.startsWith("/ProductController/mayLamBanh/MayKhac/index")) {
                                                                                                                                                                                                request.setAttribute("path", "ProductController/mayLamBanh/MayKhac");
                                                                                                                                                                                                int index = 0;
                                                                                                                                                                                                String[] split = path.split("/");
                                                                                                                                                                                                try {
                                                                                                                                                                                                    if (split.length == 4) {
                                                                                                                                                                                                        index = 1;
                                                                                                                                                                                                    } else {
                                                                                                                                                                                                        index = Integer.parseInt(split[split.length - 1]);
                                                                                                                                                                                                    }

                                                                                                                                                                                                    int totalPro = dao.getTotalProByTypeCategories("Các loại máy & vật dụng khác");
                                                                                                                                                                                                    int endPage = totalPro / 16;
                                                                                                                                                                                                    if ((totalPro % 16) != 0) {
                                                                                                                                                                                                        endPage++;
                                                                                                                                                                                                    }

                                                                                                                                                                                                    LinkedList<Product> list = dao.pagingProByCategories(index, "Các loại máy & vật dụng khác");
                                                                                                                                                                                                    request.setAttribute("listPro", list);
                                                                                                                                                                                                    request.setAttribute("endP", endPage);

                                                                                                                                                                                                    request.getRequestDispatcher("/index.jsp").forward(request, response);
                                                                                                                                                                                                } catch (Exception e) {
                                                                                                                                                                                                    response.sendRedirect("/ProductController/mayLamBanh/MayKhac");
                                                                                                                                                                                                }

                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
