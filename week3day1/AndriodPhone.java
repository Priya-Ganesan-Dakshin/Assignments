package week3day1;

public class AndriodPhone extends Mobile {
	public void takevideo() {
		System.out.println("take a video from AndriodPhone");
		}
	
	public static void main(String[] args) {
		AndriodPhone func = new AndriodPhone();
		func.takevideo();
		
		func.sendmessage();
		func.makecall();
		func.savecontact();
		
	}

}
