package facade;

public class LetterProcessImpl implements ILetterProcess {

	@Override
	public void writeContext(String context) {
		// TODO Auto-generated method stub
		System.out.println("��д�ŵ�����..."+context);
	}

	@Override
	public void fillEnvelope(String address) {
		// TODO Auto-generated method stub
		System.out.println("��д�ռ��˵�ַ������..."+address);
	}

	@Override
	public void letterIntoEnvelope() {
		// TODO Auto-generated method stub
		System.out.println("���ŷŵ��ŷ���....");
	}

	@Override
	public void sendLetter() {
		// TODO Auto-generated method stub
		System.out.println("�ʵ��ż�...");
	}

}
