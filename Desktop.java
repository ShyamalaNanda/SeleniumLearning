package org.system;

public class Desktop extends Computer {
	public void desktopSize() {
	String desktopSize = " 1366 x 768 HD";
	System.out.println("The model is :"+desktopSize);
	}

	public static void main(String args[])
	{
		Desktop obj = new Desktop();
		obj.computerModel();
		obj.desktopSize(); 
	}
}

