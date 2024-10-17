/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thanh.dev.admin1;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import thanh.dev.data.dao1.Database;
import thanh.dev.data.dao1.DatabaseDao;

/**
 *
 * @author Admin
 */
public class BaseAdminServlet extends HttpServlet{
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        DatabaseDao.init(new Database());
    }
}
