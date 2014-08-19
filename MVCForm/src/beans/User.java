package beans;

public class User {
	private String email="";
	private String password="";
	private String message ="";

	public String getMessage() {
		return message;
	}

	public User() {

	}

	public User(String email, String password) {
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public boolean validate(){
		
		if(email==null)
		{
			message = "Invalid email address";
			return false;
		}
		if(password==null)
		{
			message = "Invalid password";
			return false;
		}
		if(!email.matches("\\w.+@\\w+\\.\\w+"))
		{
			message = "Invalid email address";
			return false;
		}
		if(password.length() < 8)
		{
			message = "Password must be at least 8 charachters";
			return false;
		}
		else if(password.matches("\\w*\\s+\\w*"))
		{
			message = "Password must not contain a space";
			return false;
		}
		return true;
	}

}
























