package net.java.employeemanagement.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.javaguides.employeemanagement.dao.EmployeeDao;
import net.javaguides.employeemanagement.model.Employee;


@WebServlet("/register")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String id = null;
	private static final String name = null;
	private static final String nic = null;
	private static final String department = null;
	private static final String designation = null;
	private static final String joinedDate = null;
	private EmployeeDao employeeDao;
	
	public void init() {
		employeeDao = new EmployeeDao();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String firstName = request.getParameter("id");
		String lastName = request.getParameter("nam");
		String username = request.getParameter("nic");
		String password = request.getParameter("department");
		String address = request.getParameter("designation");
		String contact = request.getParameter("joinedDate");
		
		Employee employee = new Employee();
		employee.setFirstName(id);
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
