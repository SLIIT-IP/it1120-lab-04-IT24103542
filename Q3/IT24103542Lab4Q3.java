import java.util.Scanner;

public class IT24103542Lab4Q3{
	public static void main(String[] args){
 
	int number;
	String type;

	Scanner sc = new Scanner(System.in);

	System.out.print("Enter a number: ");
	number = sc.nextInt();

	System.out.println("");
	
	if (number==0){
		System.out.println("The number is: Zero");
	}

	else {
		type = (number>0) ? "The number is: Positive" : "The number is: Negative";
		System.out.println(type);


	}

	
	
	}
}