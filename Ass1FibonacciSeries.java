package week1.day2;

public class Ass1FibonacciSeries {
public static void main(String[] args) {
	int number=8; 
	int firstNumber=0; 
	int secondNumber=1; 
	int sum;
	System.out.println(firstNumber);
	System.out.println(secondNumber);
	for (int i = 2; i <number; i++) 
	{
		sum=firstNumber+secondNumber;
		System.out.println(sum);
		firstNumber=secondNumber;
		secondNumber=sum;		
	}	
	}	
}
