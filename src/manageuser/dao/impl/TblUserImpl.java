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
			String query = "SELECT * FROM Manager_LuongThai.User";
			con = getConnection();
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			int cols = 1;
			TblUser user = new TblUser();
			user.setUser_id(rs.getInt(cols++));
			user.setGroup_id(rs.getInt(cols++));
			user.setLogin_name(rs.getString(cols++));
			user.setPassword(rs.getString(cols++));
			user.setFull_name(rs.getString(cols++));
			user.setFull_name_kana(rs.getString(cols++));
			user.setEmail(rs.getString(cols++));
			user.setTel(rs.getString(cols++));
			user.setBirthday(rs.getString(cols++));
			user.setSalt(rs.getString(cols++));
			user.setRule(rs.getInt(cols++));
			return user;
		} catch (SQLException sqle) {
			// System.out.println(MessageErrorProperties.getProperty("ListUser_getList_SQLE"));
			throw sqle;
		} catch (ClassNotFoundException cnfe) {
			// System.out.println(MessageErrorProperties.getProperty("ListUser_getList_CNFE"));
			throw cnfe;
		} finally {
			closeConnection(con);
		}
	}

}
