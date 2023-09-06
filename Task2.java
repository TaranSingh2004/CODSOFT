import java.util.*;
class Task2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of subjects: ");
		int subjects= sc.nextInt();
		int marks[]= new int[subjects];
		
		//take marks input
		
		for(int i=0;i<subjects;i++){
			System.out.println("Enter the marks obtained in subject "+ (i+1) +" out of 100 is : ");
			marks[i]=sc.nextInt();
			if(marks[i]>100){
				System.out.println("Please enter marks out of 100.");
				marks[i]=sc.nextInt();
			}
		}
		
		//print the marks obtained
		
		for(int i=0;i<subjects;i++){
			System.out.println("the marks obtained in subject " + (i+1) +" is: "+ marks[i]);
		}
		
		//find sum of marks
		
		int sum=0;
		for(int i=0;i<subjects;i++){
			sum=sum+marks[i];
		}
		System.out.println("Sum of all the marks obtained are: "+ sum);
		
		//percentage obtained
		
		int percentage=sum/subjects;
		System.out.println("Average percentage obtained: "+ percentage);
		
		//grade obtained
		
		int grades;
		if(percentage>=90){
			System.out.println("Grade obtained: A1");
		}
		else if(percentage<90 && percentage>=80){
			System.out.println("Grade obtained: A2");
		}
		else if(percentage<80 && percentage>=70){
			System.out.println("Grade obtained: B1");
		}
		else if(percentage<70 && percentage>=60){
			System.out.println("Grade obtained: B2");
		}
		else if(percentage<60 && percentage>=50){
			System.out.println("Grade obtained: C1");
		}
		else if(percentage<50 && percentage>=40){
			System.out.println("Grade obtained: C2");
		}
		else{
			System.out.println("Grade obtained: FAIL");
		}
	}
}