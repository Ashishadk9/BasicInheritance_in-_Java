public class InheritanceApply {
    public static void main(String[] args) {
        CalculationThird calc = new CalculationThird();
        System.out.println("Addition: " + calc.add(10, 5));
        System.out.println("Subtraction: " + calc.subtract(10, 5));
        System.out.println("Multiplication: " + calc.multiply(10, 5));
        System.out.println("Factorial: " + calc.factorial(5));
        System.out.println("Division: " + calc.division(10, 5));
    }
}