/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package tam.dev.admin.category;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import tam.dev.admin.BaseAdminServlet;
import tam.dev.data.dao.CategoryDao;
import tam.dev.data.dao.DatabaseDao;
import tam.dev.data.dao.UserDao;
import tam.dev.data.model.Category;
import tam.dev.data.model.User;

/**
 *
 * @author Admin
 */
public class EditCategoryServlet extends BaseAdminServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int categoryId = Integer.parseInt(request.getParameter("categoryId"));
        CategoryDao categoryDao = DatabaseDao.getInstance().getCategoryDao();
        Category category = categoryDao.find(categoryId);

        request.setAttribute("category", category);
        request.getRequestDispatcher("admin/category/edit.jsp").include(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int categoryId = Integer.parseInt(request.getParameter("categoryId"));
        CategoryDao categoryDao = DatabaseDao.getInstance().getCategoryDao();
        Category category = categoryDao.find(categoryId);

        String name = request.getParameter("name");
        String description = request.getParameter("description");

        category.setName(name);
        category.setDescription(description);
        categoryDao.update(category);
        response.sendRedirect("IndexCategoryServlet");

    }
}