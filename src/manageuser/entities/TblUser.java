/**
 * Copyright(C) 2018 Luvina
 *TblUser.java, Aug 13, 2018 LA-AM
 */
package manageuser.entities;

import java.util.Date;

/**
 * @author LA-AM
 *
 */
public class TblUser {
	private int user_id;
	private int group_id;
	private String login_name;
	private String password;
	private String full_name;
	private String full_name_kana;
	private String email;
	private String tel;
	private String birthday;
	private String salt;
	private int rule;
	/**
	 * constructor
	 */
	public TblUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the user_id
	 */
	public int getUser_id() {
		return user_id;
	}
	/**
	 * @param user_id the user_id to set
	 */
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	/**
	 * @return the group_id
	 */
	public int getGroup_id() {
		return group_id;
	}
	/**
	 * @param group_id the group_id to set
	 */
	public void setGroup_id(int group_id) {
		this.group_id = group_id;
	}
	/**
	 * @return the login_name
	 */
	public String getLogin_name() {
		return login_name;
	}
	/**
	 * @param login_name the login_name to set
	 */
	public void setLogin_name(String login_name) {
		this.login_name = login_name;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the full_name
	 */
	public String getFull_name() {
		return full_name;
	}
	/**
	 * @param full_name the full_name to set
	 */
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	/**
	 * @return the full_name_kana
	 */
	public String getFull_name_kana() {
		return full_name_kana;
	}
	/**
	 * @param full_name_kana the full_name_kana to set
	 */
	public void setFull_name_kana(String full_name_kana) {
		this.full_name_kana = full_name_kana;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the tel
	 */
	public String getTel() {
		return tel;
	}
	/**
	 * @param tel the tel to set
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}
	/**
	 * @return the birthday
	 */
	public String getBirthday() {
		return birthday;
	}
	/**
	 * @param birthday the birthday to set
	 */
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	/**
	 * @return the salt
	 */
	public String getSalt() {
		return salt;
	}
	/**
	 * @param salt the salt to set
	 */
	public void setSalt(String salt) {
		this.salt = salt;
	}
	/**
	 * @return the rule
	 */
	public int getRule() {
		return rule;
	}
	/**
	 * @param rule the rule to set
	 */
	public void setRule(int rule) {
		this.rule = rule;
	}
	
	
}
