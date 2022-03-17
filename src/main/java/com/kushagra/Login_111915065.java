package com.kushagra;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.kushagra.dao.Logindao_111915065;

/**
 * Servlet implementation class Login_111915065
 */
public class Login_111915065 extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uname= request.getParameter("uname");
		String pass= request.getParameter("pass");
		
		Logindao_111915065 dao= new Logindao_111915065();
		if(dao.check3(uname, pass))
		{
			HttpSession session= request.getSession();
			session.setAttribute("employeeid", dao.employeeid);
			session.setAttribute("first_name", dao.first_name);
			session.setAttribute("last_name", dao.last_name);
			session.setAttribute("date_of_birth", dao.date_of_birth);
			session.setAttribute("contact_number", dao.contact_number);
			session.setAttribute("job_role", dao.job_role);
			session.setAttribute("monthly_salary", dao.monthly_salary);
			session.setAttribute("yearly_bonus", dao.yearly_bonus);
			session.setAttribute("total_salary", ((12*(Integer.parseInt(dao.monthly_salary)))+(Integer.parseInt(dao.yearly_bonus))));
			response.sendRedirect("report111915065.jsp");
		}
		else
		{
			response.sendRedirect("login111915065.jsp");
		}
		
	}

	

}
