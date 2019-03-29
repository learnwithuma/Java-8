// Default Methods in interface

interface Calculation {
	public int perform(int a, int b);
	default void printResult(Integer result) {
		System.out.println("The result is " + result);
	}
}

interface Alphabets {
	public int perform(int a, int b);
	default void printResult(Integer result) {
		System.out.println("The alphabet is " + result);
	}
}

class Addition implements Calculation, Alphabets {
	public int perform(int a, int b) {
		return a + b;
	}
	
	public void printResult(Integer result) {
		System.out.println("The alphabet is " + result);
		Calculation.super.printResult(result);
	}
}


class CalculateNumbers {
	public static void main(String args[]) {
		System.out.println("Without Lambda Expression");
		Calculation calculation = new Addition();
		calculation.printResult(calculation.perform(1, 1));

		
	}
}
