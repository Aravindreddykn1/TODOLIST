package todolistapp;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/update")
public class updateservlets  extends HttpServlet{
	
	
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	
	int id=Integer.parseInt(req.getParameter("id"));
	// TODO Auto-generated method stub
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/todolist","root","root");
		PreparedStatement ps=con.prepareStatement("select * from todolist where taskid=?");
		ps.setInt(1, id);
	    ResultSet rs = ps.executeQuery();
req.setAttribute("rs1", rs);
RequestDispatcher rd = req.getRequestDispatcher("update.jsp");
rd.forward(req, resp);
		
		
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/todolist","root","root");
		PreparedStatement ps=con.prepareStatement("select * from todolist");
		ResultSet rs = ps.executeQuery();
		req.setAttribute("rs1", rs);
		RequestDispatcher rd = req.getRequestDispatcher("home.jsp");
		rd.forward(req, resp);
			
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
