package week1.day2;

public class Ass1PrimeNumber {

	public static void main(String[] args) {
		int n = 12;
		boolean prime=true;
		for (int i = 2; i < n ; i++) {
			if (n % 2 == 0)
				prime=false;
			break;
			}  
		System.out.println(prime);
		
	}

}
