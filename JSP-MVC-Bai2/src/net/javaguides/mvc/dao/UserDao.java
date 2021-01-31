package net.javaguides.mvc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;

//import com.microsoft.sqlserver.jdbc.SQLServerDriver;

import net.javaguides.mvc.model.User;

public class UserDao {
	public int registrationUser(User user) throws ClassNotFoundException {
		String sql = "insert into Userr (firstname,lastname,email,pass,birthday,gender) values (?,?,?,?,?,?) ";
		String url = "jdbc:sqlserver://localhost:1433;databaseName=UpLoadUserRegistrationForm";
		String sa = "sa";
		String pass = "123";
		int result = 0;
		try{
			 DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver()); 
			Connection	con = DriverManager.getConnection(url,sa,pass);
			PreparedStatement statement = con.prepareStatement(sql);
			//statement.setInt(1,1);
			statement.setString(1, user.getFistName());
			statement.setString(2,user.getLastName() );
			statement.setString(3, user.getEmail());
			statement.setString(4, user.getPassWord());
			statement.setString(5,user.getBirthday());
			statement.setString(6,user.getGender());
			//ResultSet result = statement.ex
			result = statement.executeUpdate();
		
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
}
