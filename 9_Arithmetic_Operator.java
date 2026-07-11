// 9_Arithmetic_Operator.java


class ArithmeticOperator{
    public static void main(String[] args) {
        // Arithmetic Operators: +, -, *, /, %
        int a = 10;
        int b = 20;

        // Addition
        int sum = a + b;
        System.out.println("Sum: " + sum);

        // Subtraction
        int difference = a - b;
        System.out.println("Difference: " + difference);

        // Multiplication
        int product = a * b;
        System.out.println("Product: " + product);

        // Division
        int quotient = b / a;
        System.out.println("Quotient: " + quotient);

        // Modulus
        int remainder = b % a;
        System.out.println("Remainder: " + remainder);

        // a+= 5;
        a++;
        System.out.println("a =" + a);
    }
}