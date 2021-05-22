package org.system;

public class Desktop extends Computer {
public void desktopSize() {
	System.out.println("The desktop size is 43inches");
}
	public static void main(String[] args) {
		Desktop feature = new Desktop();
		feature.desktopSize();

		feature.computerModel();
	}

}
