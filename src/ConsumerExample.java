import java.util.function.Consumer;

public class ConsumerExample {
	public static void main(String[] args) {

		
		Consumer<String> c1 = s -> System.out.println(s); 

		c1.accept("Hello");

		
		Consumer<String> c2 = s -> System.out.println(s.length()); 
		
		// Consumer Chaining
		
		c1.andThen(c2).accept("Dave");
				

	}
}
