package flyweight;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 for (int i = 0; i < 4; i++) {
			String subject = "��Ŀ"+i;
			for (int j = 0; j < 30; j++) {
				String key = subject+"���Եص�"+j;
				SingInfoFactory.getSignInfo(key);
			}
		}
		 
		 SignInfo signInfo = SingInfoFactory.getSignInfo("��Ŀ1���Եص�1");
		 signInfo.getId();
	}

}
