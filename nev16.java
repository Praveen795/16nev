package nev16;
import java.util.Scanner;
public class nev16 {

	public static void main(String[] args) {
		
		//first homework**********************************************
		Scanner sc =new Scanner(System.in);
		System.out.print("enter the number");
		int a=sc.nextInt();
		
		

		if(a>=0) {
			if(a<=9) {
				System.out.println("single digit number");
			}
			
			else if(a>9 && a<=99) {
				System.out.println("2  digit number");
				
			}
			
			else if(a>99 && a<=999) {
				System.out.println("3  digit number");
			}
			
			else {
				System.out.println("big number digit number");
			}
			
		}
		
		
		//2nd home work********************************************************
		System.out.println("enter one more number");
		
		int num=sc.nextInt();
		int fact=1;
		int g=1;
		
		do {
			fact=fact*g;
			g++;
		}while(g<=num);
		System.out.println(" factorial numner" +fact);
		
		System.out.print(" enter the 3rd number");
		int f=sc.nextInt();
		
		evenodd(f);
		
		

	
}
	//3rd home work*******************************************************************************
	public static void evenodd(int a) {
		if(a%2==0) {
			System.out.print(" even number");
		}
		else {
			System.out.print(" odd number");
			
		}
	}
	
}
			
			
		
		
		

