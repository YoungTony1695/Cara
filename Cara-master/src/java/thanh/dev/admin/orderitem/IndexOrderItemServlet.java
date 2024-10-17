/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package thanh.dev.admin.orderitem;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import thanh.dev.admin1.BaseAdminServlet;
import thanh.dev.data.dao1.DatabaseDao;
import thanh.dev.data.dao1.OrderDao;
import thanh.dev.data.dao1.OrderItemDao;
import thanh.dev.data.model.Order;
import thanh.dev.data.model.OrderItem;

/**
 *
 * @author Admin
 */
public class IndexOrderItemServlet extends BaseAdminServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int orderId = Integer.parseInt(request.getParameter("orderId"));
        OrderDao orderDao = DatabaseDao.getInstance().getOrderDao();
        Order order = orderDao.find(orderId);
        
        OrderItemDao oderItemDao = DatabaseDao.getInstance().getOrderItemDao();
        List<OrderItem> orderItemList = oderItemDao.findByOder(orderId);
        
        request.setAttribute("order", order);
        request.setAttribute("orderItemList", orderItemList);
        request.getRequestDispatcher("admin/orderitem/index.jsp").include(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }
}
