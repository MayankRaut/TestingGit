package coding;

public class PrintDigitsOfNumbers {
	public static void main(String[] args) {
		PrintDigitsOfNumbers.fetchOddDigits(124123992);
	}

	public static void fetchOddDigits(int num) {
		while (num > 0) {
			int rem = num % 10;
			if (rem % 2 != 0) {
				System.out.println(rem);
			}
			num /= 10;
		}
	}
}