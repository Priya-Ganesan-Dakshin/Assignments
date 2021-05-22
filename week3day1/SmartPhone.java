package week3day1;

public class SmartPhone extends AndriodPhone {
	public void connectWhatsapp() {
		System.out.println("connect Whatsapp from SmartPhone");
		}
	
	public static void main(String[] args) {
		SmartPhone func = new SmartPhone();
		func.connectWhatsapp();
		
        func.takevideo();
		
		func.sendmessage();
		func.makecall();
		func.savecontact();
		
	}

}

