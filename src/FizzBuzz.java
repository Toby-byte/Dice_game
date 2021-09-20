public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {

            int devisibleBy3 = i % 3;
            int devisibleBy5 = i % 5;

            if (devisibleBy5 == 0 && devisibleBy3 == 0) {
                System.out.println("FizzBuzz");
            } else if (devisibleBy3 == 0) {
                System.out.println("Fizz");
            } else if (devisibleBy5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
