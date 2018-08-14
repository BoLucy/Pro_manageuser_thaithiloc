/**
 * Copyright(C) 2018 Luvina
 *TblUserLogicImpl.java, Aug 13, 2018 LA-AM
 */
package manageuser.logics.impl;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.UUID;

import manageuser.dao.impl.TblUserImpl;
import manageuser.entities.TblUser;
import manageuser.logics.TblUserLogic;

/**
 * @author LA-AM
 *
 */
public class TblUserLogicImpl implements TblUserLogic {
	/**
	 * tạo ra salt ngẫu nhiên và duy nhất
	 * @return salt
	 * @throws NoSuchAlgorithmException
	 */
		private static String getSalt() {
			String salt = String.valueOf(System.currentTimeMillis());//get current Time theo milis
			String rand = UUID.randomUUID().toString();//tạo ra chuỗi String random nhờ UUID
			String result = salt+rand;//cộng chuỗi
			String rs = result.replaceAll("-", "");//xóa hết các ký tự -
			return rs;//trả về chuỗi duy nhất
			
		}
		/**
		 * mã hóa SHA1 với passworrd
		 * @param salt: chuỗi ngầu nhiên 
		 * @param pass: mật khẩu
		 * @return chuỗi pass đã được mã hóa
		 */
		private static String encodeSHA1(String salt, String pass){
			StringBuffer passSHA1 = null;//khai báo sb
			String input = salt+pass;//đầu vào là mật khẩu nỗi với salt
			try {
				//throw ex
				MessageDigest md = MessageDigest.getInstance("SHA-1");//set sử dụng thuật toán SHA1
				byte[] result;
				//throw ex
				result = md.digest(input.getBytes("UTF-8")); //biến đổi chuỗi cần mã hóa sang byte[] và thực thi mã hóa
				StringBuffer sb = new StringBuffer();
				for (int i = 0; i < result.length; i++) {
					passSHA1 = sb.append(Integer.toString((result[i] & 0xff) + 0x100, 16).substring(1));//biến đổi dạng byte[] thành dạng Hex
				}
				
			} catch (NoSuchAlgorithmException na) {
				na.printStackTrace();
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return passSHA1.toString();//trả về mật khẩu đã được mã hóa dạng String
		}
		
		
		/* (non-Javadoc)
		 * @see manageuser.logics.TblUserLogic#existLogin(java.lang.String, java.lang.String)
		 */
		@Override
		public boolean existLogin(String login_name, String password) throws ClassNotFoundException, SQLException {
			TblUserImpl userDAO = new TblUserImpl();
			TblUser user = userDAO.getAdmin(login_name);
			String salt = user.getSalt();
			String passwordSHA1 = encodeSHA1(salt, password);
			if(passwordSHA1.equals(user.getPassword())) {
				return true;
			} else {
			return false;
			}
		}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		TblUserLogicImpl us = new TblUserLogicImpl();
//		String s = getSalt();
//		System.out.println(s);
//		System.out.println(encodeSHA1(s, "admin123"));
		boolean check = us.existLogin("admin", "admin123");
		System.out.println(check);
	}	
}
