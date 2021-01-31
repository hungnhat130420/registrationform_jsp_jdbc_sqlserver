package net.javaguides.mvc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.javaguides.mvc.dao.UserDao;
import net.javaguides.mvc.model.User;

@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private UserDao dao;
		
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String firstname = req.getParameter("firstname");
		String lastname = req.getParameter("lastname");
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		String day = req.getParameter("day");
		String month = req.getParameter("month");
		String year = req.getParameter("year");
		String gender = req.getParameter("gender");
		String birthday = day + "/" + month + "/" + year ;
		
		User user = new User();
		user.setFistName(firstname);
		user.setLastName(lastname);
		user.setEmail(email);
		user.setPassWord(pass);
		user.setBirthday(birthday);
		user.setGender(gender);
		
		dao = new UserDao();
		
		try {
			dao.registrationUser(user);
		}catch(Exception e) {
			e.printStackTrace();
		}
		resp.sendRedirect("Home.jsp");
	}

}
