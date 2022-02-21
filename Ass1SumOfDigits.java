package week1.day2;

public class Ass1SumOfDigits {

	public static void main(String[] args) {
		int n = 456;
		int sum = 0;
		while ( n > 0 )
		{
			int rem = n % 10;
			sum = sum + rem;
			n = n / 10;
		}
		System.out.println("The sum of the digits 456 is : "+sum);
	}

}
