package week1.day1;

public class Mobile {
public String mobileBrandName = "Samsung";
public char mobileLogo = 'S';
public short noOfMobilePiece =1;
public int modelNumber = 03;
public long mobilemeiNumber =  3222222222222L;
public float mobilePrice = 40000.50F;
public boolean isDamaged =false;

	public static void main(String[] args) {
		Mobile samsung= new Mobile();
		System.out.println("Mobile Brand Name:"+samsung.mobileBrandName);
		System.out.println("Mobile Logo:"+samsung.mobileLogo);
		System.out.println("Number of Mobile Piece:"+samsung.noOfMobilePiece);
		System.out.println("Model number:"+samsung.modelNumber);
		System.out.println("Mobile MEI Number:"+samsung.mobilemeiNumber);
		System.out.println("Mobile Price:"+samsung.mobilePrice);
		System.out.println("Whether damaged or not :"+samsung.isDamaged);
		System.out.println("=============================================");
	}
}
