import java.util.*;


public class kmToMiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the distance (in kilometers): ");
		Scanner sc = new Scanner(System.in);
		double d = sc.nextInt();
		
		double miles = d/1.60933 ;
		System.out.println("Distance : "+miles+" miles");
		
	}

}
