import java.util.*;



public class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Dividend: ");	
			Scanner p= new Scanner(System.in);
			int a = p.nextInt();
			
			System.out.println("Divisor: ");
			Scanner q= new Scanner(System.in);
			int b = q.nextInt();
			
			int c = a/b;
			int d = a%b;
			System.out.printf("Quotient = "+c+" , ");
			System.out.printf("Remainder = "+d);
	}

}
