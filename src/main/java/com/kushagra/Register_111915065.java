package com.kushagra;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.kushagra.dao.Registerdao_111915065;

/**
 * Servlet implementation class Register_111915065
 */
public class Register_111915065 extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String employeeid= request.getParameter("txt");
		String first_name= request.getParameter("firstname");
		String last_name= request.getParameter("lastname");
		String dob= request.getParameter("dob");
		String contact_number= request.getParameter("contactnumber");
		String job_role= request.getParameter("jobrole");
		String monthly_salary= request.getParameter("monthlysalary");
		String yearly_bonus= request.getParameter("yearlybonus");
		String pswd= request.getParameter("pswd");
		
		Registerdao_111915065 dao= new Registerdao_111915065();
		if(dao.check2(employeeid, first_name, last_name, dob, contact_number, job_role, monthly_salary, yearly_bonus, pswd))
		{
			response.sendRedirect("login111915065.jsp");
		}
		else
		{
			response.sendRedirect("register111915065.jsp");
		}
		
	}


}
