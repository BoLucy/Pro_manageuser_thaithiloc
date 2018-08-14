/**
 * Copyright(C) 2018 Luvina
 *TblUserImpl.java, Aug 10, 2018 LA-AM
 */
package manageuser.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import manageuser.dao.TblUserDAO;
import manageuser.entities.TblUser;



/**
 * @author LA-AM
 *
 */
public class TblUserImpl extends BaseImpl implements TblUserDAO {

	/*
	 * (non-Javadoc)
	 * 
	 * @see manageuser.dao.TblUserDAO#getAdmin(java.lang.String)
	 */
	@Override
	public  TblUser getAdmin(String login_name) throws SQLException, ClassNotFoundException {
	
		try {
<<<<<<< HEAD
			String query = "SELECT * FROM manageuser_thaithiloc.tbl_user";
=======
			String query = "SELECT * FROM manageuser_bientuanh.tbl_user";
>>>>>>> 3d78b550021ba647f62c22f7ca53ffcc0f0831d0
			con = getConnection();
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			TblUser user = new TblUser();
			while (rs.next()) {
				
				user.setUser_id(rs.getInt("user_id"));
				user.setGroup_id(rs.getInt("group_id"));
				user.setLogin_name(rs.getString("login_name"));
				user.setPassword(rs.getString("password"));
				user.setFull_name(rs.getString("full_name"));
				user.setFull_name_kana(rs.getString("full_name_kana"));
				user.setEmail(rs.getString("email"));
				user.setTel(rs.getString("tel"));
				user.setBirthday(rs.getString("birthday"));
				user.setSalt(rs.getString("salt"));
				user.setRule(rs.getInt("rule"));
			
			}
			return user;
		} catch (SQLException sqle) {
			// System.out.println(MessageErrorProperties.getProperty("ListUser_getList_SQLE"));
			System.out.println("sql err");
			throw sqle;
		} catch (ClassNotFoundException cnfe) {
			// System.out.println(MessageErrorProperties.getProperty("ListUser_getList_CNFE"));
			System.out.println("null");
			throw cnfe;
		} finally {
			closeConnection(con);
		}
		
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		TblUserImpl us = new TblUserImpl();
		TblUser user = us.getAdmin("admin");
		System.out.println(user.toString());
	}

}