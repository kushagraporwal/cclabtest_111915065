package com.kushagra.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Registerdao_111915065 {
	String sql= "insert into employee_details values(?, ?, ?, ?, ?, ?)";
	String sql2= "insert into salary_details values(?, ?, ?, ?)";
	String url= "jdbc:mysql://localhost:3306/servletpractical";
	String username= "root";
	String password= "1234";
	
	public boolean check2(String employeeid, String first_name, String last_name, String dob, String contact_number, String job_role, String monthly_salary, String yearly_bonus, String pswd)
	{
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection(url, username, password);
			PreparedStatement st= con.prepareStatement(sql);
			st.setString(1, employeeid);
			st.setString(2, first_name);
			st.setString(3, last_name);
			st.setString(4, dob);
			st.setString(5, contact_number);
			st.setString(6, pswd);
			boolean rs= st.execute();
			
			PreparedStatement st2= con.prepareStatement(sql2);
			st2.setString(1, employeeid);
			st2.setString(2, job_role);
			st2.setString(3, monthly_salary);
			st2.setString(4, yearly_bonus);
			boolean rs2= st2.execute();
				return true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
