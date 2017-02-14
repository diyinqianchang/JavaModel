package facade;

public class LetterProcessImpl implements ILetterProcess {

	@Override
	public void writeContext(String context) {
		// TODO Auto-generated method stub
		System.out.println("填写信的内容..."+context);
	}

	@Override
	public void fillEnvelope(String address) {
		// TODO Auto-generated method stub
		System.out.println("填写收件人地址及姓名..."+address);
	}

	@Override
	public void letterIntoEnvelope() {
		// TODO Auto-generated method stub
		System.out.println("把信放到信封中....");
	}

	@Override
	public void sendLetter() {
		// TODO Auto-generated method stub
		System.out.println("邮递信件...");
	}

}
