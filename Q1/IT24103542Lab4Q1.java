import java.util.Scanner;

public class IT24103542Lab4Q1{
	public static void main(String[] args){
 
	int number;
	
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter a number: ");
	number = sc.nextInt();

	System.out.println("");
	
	if (number>0){
		System.out.println("The number is: Positive");
	}

	else if (number<0){
		System.out.println("The number is: Negative");
	}

	else{
		System.out.println("The number is Zero");
	}
	
	
	}
}