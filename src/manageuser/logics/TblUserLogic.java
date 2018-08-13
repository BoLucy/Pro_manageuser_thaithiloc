/**
 * Copyright(C) 2018 Luvina
 *TblUserLogicDAO.java, Aug 13, 2018 LA-AM
 */
package manageuser.logics;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.UUID;

import manageuser.entities.TblUser;

/**
 * @author LA-AM
 *
 */
public interface TblUserLogic {
	boolean existLogin(String login_name, String password) throws ClassNotFoundException, SQLException;
		
}
