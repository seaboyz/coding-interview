public class App {
    public static void main(String[] args) throws Exception {
        fizzBuzz(100);
    }

    public static void fizzBuzz(int n) {

        for (int i = 0; i < n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
                continue;
            }
            if (i % 3 == 0) {
                System.out.println("Fizz");
                continue;
            }
            if (i % 5 == 0) {
                System.out.println("Buzz");
                continue;
            }

            System.out.println(i);
        }
    }
}
