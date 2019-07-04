package com.wolfk.pojo;

/**
 * @author Redfield
 *
 * @date 2019Äê7ÔÂ4ÈÕ
 */
public class UserTestPojo {
	private String username;
	private String password;

	public UserTestPojo() {
		super();
	}

	public UserTestPojo(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserTest [username=" + username + ", password=" + password + "]";
	}

}
