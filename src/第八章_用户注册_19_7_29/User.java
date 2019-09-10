package 第八章_用户注册_19_7_29;

public class User {
	private String UserName;
	private String Pwd;
	private String Email;

	public User() {
		super();
		// TODO 自动生成的构造函数存根
	}

	public User(String userName, String pwd, String email) {
		setUserName(userName);
		setPwd(pwd);
		setEmail(email);
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getPwd() {
		return Pwd;
	}

	public void setPwd(String pwd) {
		Pwd = pwd;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

}
