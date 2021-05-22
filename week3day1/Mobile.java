package week3day1;

public class Mobile {
	public void sendmessage() {
		System.out.println("Send a message");
		}
	public void makecall() {
		System.out.println("make a call");
		}
	public void savecontact() {
		System.out.println("save a contact");
		}
	public static void main(String[] args) {
		Mobile func = new Mobile();
		func.sendmessage();
		func.makecall();
		func.savecontact();

	}

}
