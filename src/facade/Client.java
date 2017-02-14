package facade;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		ILetterProcess letterProcess = new LetterProcessImpl();
//		letterProcess.writeContext("Hello,It's me,do you know who I am? I'm your old lover. I'd like to ...");
//		
//		letterProcess.fillEnvelope("Happy Road No. 666, God Province,Heaven");
//		
//		letterProcess.letterIntoEnvelope();
//		
//		letterProcess.sendLetter();
		
		ModenPostOffice hellRoadPostOffice = new ModenPostOffice();
		
		String address = "Happy Road No. 666, God Province,Heaven";
		String context = "Hello,It's me,do you know who I am? I'm your old lover. I'd like to ...";
		
		hellRoadPostOffice.sendLetter(context, address);
		
	}

}
