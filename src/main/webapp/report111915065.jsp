<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
if(session.getAttribute("employeeid")==null)
{
	response.sendRedirect("login.jsp");
}
%>
<h1>Welcome to report here</h1>
<h1 style="color:orange; text-align:center">User Dashboard</h1>
<h2><span style="color:#B0EF5E; margin-left: 20px;">Employee id</span>- ${employeeid}</h2>
<h2><span style="color:#B0EF5E; margin-left: 20px;">First Name</span>- ${first_name}</h2>
<h2><span style="color:#B0EF5E; margin-left: 20px;">Last Name</span>- ${last_name}</h2>
<h2><span style="color:#B0EF5E; margin-left: 20px;">DOB</span>- ${date_of_birth}</h2>
<h2><span style="color:#B0EF5E; margin-left: 20px;">Contact Number</span>- ${contact_number}</h2>
<h1>Salary Details</h1>
<h2><span style="color:#B0EF5E; margin-left: 20px;">Jobrole</span>- ${job_role}</h2>
<h2><span style="color:#B0EF5E; margin-left: 20px;">Salary</span>- ${monthly_salary}</h2>
<h2><span style="color:#B0EF5E; margin-left: 20px;">Bonus</span>- ${yearly_bonus}</h2>
<h2><span style="color:#B0EF5E; margin-left: 20px;">Total Salary</span>- ${total_salary}</h2>
</body>
</html>