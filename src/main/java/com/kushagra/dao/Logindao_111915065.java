package com.kushagra.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Logindao_111915065 {
	
	String sql= "select * from Employee_details where Employee_ID=? and password1=?";
	String sql2= "select * from Salary_details where Employee_ID=?";
	String url= "jdbc:mysql://localhost:3306/servletpractical";
	String username= "root";
	String password= "1234";
	
	public String employeeid = "NULL";
	public String first_name = "NULL";
	public String last_name = "NULL";
	public String date_of_birth = "NULL";
	public String contact_number = "NULL";
	public String job_role = "NULL";
	public String monthly_salary = "NULL";
	public String yearly_bonus = "NULL";
	
	public boolean check3(String uname, String pass)
	{
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection(url, username, password);
			PreparedStatement st= con.prepareStatement(sql);
			st.setString(1, uname);
			st.setString(2, pass);
			ResultSet rs= st.executeQuery();
			if(rs.next())
			{
				employeeid=rs.getString("Employee_ID");
				first_name= rs.getString("First_Name");
				last_name= rs.getString("Last_Name");
				date_of_birth= rs.getString("Date_of_Birth");
				contact_number= rs.getString("Contact_Number");
				PreparedStatement st2= con.prepareStatement(sql2);
				st2.setString(1, uname);
				ResultSet rs2= st2.executeQuery();
				if(rs2.next())
				{
					job_role=rs2.getString("Job_Role");
					monthly_salary= rs2.getString("Monthly_Salary");
					yearly_bonus= rs2.getString("Yearly_Bonus");
					
					return true;
				}
				return true;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
