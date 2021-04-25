public class Main {
	public static void main(String[] args) {
		Ints intsCalc = new IntsCalculator();
		System.out.println("Result sum = " + intsCalc.sum(2, 2));
		System.out.println("Result mult = " + intsCalc.mult(10, 22));
		System.out.println("Result pow = " + intsCalc.pow(2, 10));
	}
}
