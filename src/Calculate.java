// Lambda Expression

interface Calculator {
	public int perform(int a, int b);
}

class Add implements Calculator {
	public int perform(int a, int b) {
		return a + b;
	}
}

class Multiply implements Calculator {
	public int perform(int a, int b) {
		return a * b;
	}
}

class Calculate {
	public static void main(String args[]) {
		System.out.println("Without Lambda Expression");
		Calculator calculator = new Add();
		System.out.println(calculator.perform(1, 1));

		System.out.println("With Lambda Expression");
		Calculator calculator1 = (a, b) -> a - b;
		System.out.println(calculator1.perform(5, 1));

	}
}
