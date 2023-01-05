import java.util.Scanner;
public class conditional{
public static void main(String[] args){
	Scanner input = new Scanner (System.in);
	int num1,num2;
	
	System.out.print("\n\n\nPress 2 Numbers ");
	
	System.out.print("\n\nEnter 1st number :");
	num1 = input.nextInt();
	System.out.print("\nEnter 2nd number :");
	num2 = input.nextInt();
	
	int large = (num1>num2) ? num1 : num2;
System.out.print("\n\nLarge number :"+large);

}

}