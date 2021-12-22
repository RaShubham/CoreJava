import java.util.*;


public class findingTheArea {

	public static void square() {
		
		System.out.println("Side of the Square:");
		Scanner sc = new Scanner(System.in);
		double side = sc.nextDouble();
		System.out.println("Area of the Square: "+ side*side);		
		
	}
	
	public static void rectangle() {
		System.out.println("Width of the Rectangle:");
		Scanner a = new Scanner(System.in);
		double width = a.nextDouble();
		System.out.println("Length of the Rectangle:");
		Scanner b = new Scanner(System.in);
		double length = b.nextDouble();
		System.out.println("Area of the Rectangle: "+ width*length);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Square or Rectangle ??");
		Scanner c = new Scanner (System.in);
		String shape = c.nextLine();
		
		String s1 = "Square";
		String s2 = "Rectangle";
		
		if (shape.equals(s1)) {
			square();
		}
		
		else if (shape.equals(s2)) {
			rectangle();	
		}
		
		else {
			System.out.println("Sorry! Didn't get you");
		}
	}

}
