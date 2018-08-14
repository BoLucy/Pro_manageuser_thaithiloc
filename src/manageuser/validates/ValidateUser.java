/**
 * Copyright(C) 2018 Luvina
 *ValidateUser.java, Aug 13, 2018 LA-AM
 */
package manageuser.validates;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.Cookie;

import manageuser.logics.impl.TblUserLogicImpl;

/**
 * @author LA-AM
 *
 */
public class ValidateUser {
	public static ArrayList<String> validateLogin(String login_name, String password)
			throws ClassNotFoundException, SQLException {
		ArrayList<String> listError = new ArrayList<String>();
		TblUserLogicImpl existUser = new TblUserLogicImpl();
		if (login_name == null && "".equals(login_name)) {
			String error = "Error001";
			listError.add(error);
		} else if (password == "null" && "".equals(password)) {
			String error = "Error001";
			listError.add(error);
		} else if(!existUser.existLogin(login_name, password)){
			String error = "Error002";
			listError.add(error);
		}
		return listError;
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		ArrayList<String> l = ValidateUser.validateLogin("admin", "admin123");
		System.out.println(l.size());
		for (String str : l) {
			System.out.println(str);
		}
	}
}