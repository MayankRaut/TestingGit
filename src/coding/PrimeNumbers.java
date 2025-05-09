package coding;

public class PrimeNumbers {
	public static void main(String[] args) {
		PrimeNumbers.checkPrimeNumber(12);
	}

	public static void checkPrimeNumber(int num) {
		boolean isPrime = true;
		if (num <= 1) {
			isPrime = false;
		} else {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					isPrime = false;
				}
			}
		}
		if (isPrime) {
			System.out.println("Number is Prime Number");
		} else {
			System.out.println("Number is Non-Prime Number");
		}
	}
}