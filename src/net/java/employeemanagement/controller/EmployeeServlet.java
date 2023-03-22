package net.java.employeemanagement.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/register")
public class EmployeeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
	private static final String Id = null;
	private static final String nic = null;
	private static final Object department = null;
	private static final String designation = null;
	private static final String joinedDate = null;
    private EmployeeDao employeeDao;

    public void init() {
        employeeDao = new EmployeeDao();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response, Object name)
    throws ServletException, IOException {

        String firstName = request.getParameter("id");
        String lastName = request.getParameter("name");
        String username = request.getParameter("nic");
        String password = request.getParameter("department");
        String address = request.getParameter("designation");
        String contact = request.getParameter("joinedDate");

        Employee employee = new Employee();
        employee.setFirstName(Id);
        employee.setLastName(name);
        employee.setUsername(nic);
        employee.setPassword(department);
        employee.setContact(designation);
        employee.setAddress(joinedDate);

        try {
            employeeDao.registerEmployee(employee);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        response.sendRedirect("employeedetails.jsp");
    }
}