
public class demo21 {
	static void method1() {

	}

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++)
			// Multiple markers at this line
			// - Syntax error on token ",", . expected
			// - j cannot be resolved or is not a field
			System.out.println(i);
		System.err.println("hello");
	}

}
