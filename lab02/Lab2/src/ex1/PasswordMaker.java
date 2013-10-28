package ex1;

public class PasswordMaker {
	private static final int MAGIC_NUMBER = 23;
	private String password = "";
	
	public PasswordMaker(String firstName, String lastName, int age) {
		int last = age%3;
		password += firstName.substring(firstName.length()-last,firstName.length());
		RandomStringGenerator myGenerator = new RandomStringGenerator(MAGIC_NUMBER, "abcdefghijklmnop");
		password += myGenerator.next();
		password += (age + lastName.length());
	}
	
	public String getPassword() {
		return password;
	}
}
