package week3.day2.assignments;

public class Desktop implements HardWare, Software {

	public static void main(String[] args) {
Desktop desk = new Desktop();
desk.hardwareResources();
desk.softwareResources();
	}

	public void softwareResources() {
System.out.println("Software Resources");		
	}

	public void hardwareResources() {
System.out.println("Hardware Resources");		
	}

}
