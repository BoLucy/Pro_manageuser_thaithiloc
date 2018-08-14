/**
 * Copyright(C) 2018 Luvina
 *BaseImpl.java, Aug 10, 2018 LA-AM
 */
package manageuser.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import manageuser.dao.BaseDAO;
import manageuser.entities.TblUser;
import manageuser.utils.Constants;

/**
 * @author LA-AM
 *
 */
public class BaseImpl implements BaseDAO {
	static Statement st;
	static PreparedStatement ps;
	static Connection con;
	static ResultSet rs;
	private static String DB_URL = "jdbc:mysql://127.0.0.1:3306/";
	private static String USER_NAME = "root";
	private static String PASSWORD = "root";

	/* (non-Javadoc)
	 * @see manageuser.dao.BaseDAO#getConnection()
	 */
	@Override
	public Connection getConnection() throws ClassNotFoundException, SQLException {

			//thiet lap ket noi
			Class.forName("com.mysql.jdbc.Driver");
//		Class.forName(Constants().forName);
			con = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
			System.out.println("connect successfully!");
		
	return con;
	}

	/* (non-Javadoc)
	 * @see manageuser.dao.BaseDAO#closeConnection(java.sql.Connection)
	 */
	@Override
	public void closeConnection(Connection con) throws SQLException {
		
			if(con != null) {
				con.close();
//				System.out.println("Disconnect successfully");
				}
	}

	/* (non-Javadoc)
	 * @see manageuser.dao.BaseDAO#closePrepareStatement(java.sql.PreparedStatement)
	 */
	@Override
	public void closePrepareStatement(PreparedStatement ps) throws SQLException {
			if(ps != null) {
				ps.close();
//				System.out.println("Close successfully");
				}
		
	}

	/* (non-Javadoc)
	 * @see manageuser.dao.BaseDAO#closeResultSet(java.sql.ResultSet)
	 */
	@Override
	public void closeResultSet(ResultSet rs) throws SQLException {
			if(rs != null) {
				rs.close();
//				System.out.println("Close successfully");
				}
		
	}

	/* (non-Javadoc)
	 * @see manageuser.dao.BaseDAO#closeStatement(java.sql.Statement)
	 */
	@Override
	public void closeStatement(Statement st) throws SQLException {	
			if(st != null) {
				st.close();
//				System.out.println("Close successfully");
				}
			
	}

}
