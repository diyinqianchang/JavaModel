package flyweight;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 for (int i = 0; i < 4; i++) {
			String subject = "科目"+i;
			for (int j = 0; j < 30; j++) {
				String key = subject+"考试地点"+j;
				SingInfoFactory.getSignInfo(key);
			}
		}
		 
		 SignInfo signInfo = SingInfoFactory.getSignInfo("科目1考试地点1");
		 signInfo.getId();
	}

}
