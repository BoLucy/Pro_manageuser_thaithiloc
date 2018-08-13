/**
 * Copyright(C) 2018 Luvina
 *BaseDAO.java, Aug 10, 2018 LA-AM
 */
package manageuser.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import manageuser.entities.TblUser;

/**
 * @author LA-AM
 *
 */
public interface BaseDAO {
	Connection getConnection() throws ClassNotFoundException, SQLException;
	void closeConnection(Connection con) throws SQLException;
	void closePrepareStatement(PreparedStatement ps) throws SQLException;
	void closeResultSet(ResultSet rs) throws SQLException;
	void closeStatement(Statement st) throws SQLException;
	/**
	 * @param login_name
	 * @return
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	TblUser getAdmin(String login_name) throws SQLException, ClassNotFoundException;
	
}
