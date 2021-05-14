package Entities;

public class User extends Entity{
	private int userId;
	private String userFirstName;
	private String userLastName;
	private String nationalityId;
	private int YearOfBirth;
	private String password;
	
	public User(String userFirstName) {
		super(userFirstName);
	}
	
	public User(int userId, String userFirstName, String userLastName, String nationalityId, int yearOfBirth,
			String password) {
		super(userFirstName);
		this.userId = userId;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.nationalityId = nationalityId;
		YearOfBirth = yearOfBirth;
		this.password = password;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName=userFirstName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	public int getYearOfBirth() {
		return YearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		YearOfBirth = yearOfBirth;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
