package adapter;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IUserInfo youngGirl = new OuterUserInfo();
		
		youngGirl.getMobileNumber();

	}

}
