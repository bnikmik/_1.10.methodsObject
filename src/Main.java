import java.util.Random;

public class Main {
    private static void task1(int a, int b) {
        Random random = new Random();
        int number = random.nextInt(a, b + 1);
        System.out.println(number);
    }

    private static boolean task2(String word) {
        for (int i = 0; i < word.length() / 2; i++) {
            char a = word.charAt(i);
            char b = word.charAt(word.length() - 1 - i);
            if (a != b) {
                return false;
            }
        }
        return true;
    }

    private static void task3(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    private static void task4(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        task1(3,6);
        System.out.println(task2("кокц"));
        task3(23);
        task4(2314512);
    }
}