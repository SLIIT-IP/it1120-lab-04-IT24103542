import java.util.Scanner;

public class IT24103542Lab4Q2{
	public static void main(String[] args){
 
	//Program to calculate the final mark based on the exam marks and lab marks

	int exam_marks;
	int lab_marks;
	int exam_percentage;
	int lab_percentage;
	int final_percentage;
	float final_mark;
	
	Scanner sc = new Scanner(System.in);

	System.out.print("Please enter exam marks(out of 100): ");
	exam_marks = sc.nextInt();

	//Validating exam marks
	
	if (!(exam_marks>=0 && exam_marks<=100)){
		System.out.print("Invalid input of exam marks. Terminating program.");
		System.out.println("");
		}
		

	else{
		System.out.print("Please enter lab submission marks(out of 100): ");
		lab_marks = sc.nextInt();
	
		//Validating lab marks

		if (!(lab_marks>=0 && lab_marks<=100)){
			System.out.println("Invalid input of lab marks. Terminating program.");
			System.out.println("");
		}
	
		else{
			System.out.print("Please enter the percentage given for the exam: ");
			exam_percentage = sc.nextInt();
			
			//Validating exam percentage
	
			if (!(exam_percentage>=0 && exam_percentage<=100)){
					System.out.println("Invalid input of exam percentage. Terminating program.");
					System.out.println("");
				}
				else{
					System.out.print("Please enter the percentage given for the lab submission: ");
					lab_percentage = sc.nextInt();

					//Validating lab percentage

					if (!(lab_percentage>=0 && lab_percentage<=100)){
					System.out.println("Invalid input of lab percentage. Terminating program.");
					System.out.println("");
					}

					else{	

					//Calculating final mark

					final_mark = ((exam_marks*exam_percentage)/100) + ((lab_marks*lab_percentage)/100);
					final_percentage = exam_percentage+lab_percentage;
					
						//Validating final percentage

						if (final_percentage!=100){
							System.out.println("The percentages must add up to 100. Terminating program.");
							System.out.println("");
						}
						else{
							System.out.println("");
							System.out.println("Final Exam Mark is: "+final_mark);

						}
					}
				}
		}
	}
	
		
	
	}
}