package week1.day1;

public class TwoWheeler {
public int noOfWheels = 2;
public short noOfMirrors = 3;
public long chassisNumber = 232134234243535435L;
public boolean isPunctured =true;
public String bikeName = "Honda";
public double runningKM = 6868898.89;

public static void main(String[] args) {
	TwoWheeler bike = new TwoWheeler();
	System.out.println("Number Of Wheels:"+bike.noOfWheels);
	System.out.println("Number of Mirrors:"+bike.noOfMirrors);
	System.out.println("ChassisNumber :"+bike.chassisNumber);
	System.out.println("Whether Punctured or not:"+bike.isPunctured);
	System.out.println("Bike Name:"+bike.bikeName);
	System.out.println("Running KM:"+bike.runningKM);
	
}
}
