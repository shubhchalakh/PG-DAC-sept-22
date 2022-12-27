package dec20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wjp","root","MyNewPass");
				// create query statement
				Statement s = con.createStatement();
				// execute query
				boolean flag = s.execute("create table Student(rno int primary key,name varchar(25),marks float(10,2),dob date)");
				System.out.println(flag);
				// close statement
				s.close();
				// close connection
				con.close();			
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("done");
	}

}
