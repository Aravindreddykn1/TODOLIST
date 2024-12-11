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
@WebServlet(urlPatterns = "/updatetask")
public class updateanshowservltes extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id=	Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String task = req.getParameter("task");
		String starttime = req.getParameter("starttime");
		String endtime = req.getParameter("endtime");
		String date = req.getParameter("date");

		System.out.println(name);
		System.out.println(task);
		System.out.println(starttime);
		System.out.println(endtime);
		System.out.println(date);
		//taskid,name,starttime,endtime,task,date
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/todolist","root","root");
			PreparedStatement ps=con.prepareStatement("update todolist set name=? ,task=?,starttime=?,endtime=?,date=? where taskid=?");
			ps.setString(1, name);
			ps.setString(2, task);
			ps.setString(3, starttime);
			ps.setString(4, endtime);
			ps.setString(5, date);
			ps.setInt(6, id);
			ps.executeUpdate();
		
			
			
		System.out.println(con);
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
