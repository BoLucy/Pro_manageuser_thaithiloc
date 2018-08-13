/**
 * Copyright(C) 2018 Luvina
 *MstUserDAO.java, Aug 10, 2018 LA-AM
 */
package manageuser.dao;

import java.sql.SQLException;

import manageuser.entities.TblUser;

/**
 * @author LA-AM
 *
 */
public interface TblUserDAO {
	TblUser getAdmin(String login_name) throws SQLException, ClassNotFoundException;
	
}
