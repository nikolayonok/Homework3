import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = scanner.nextInt();

        int a = 0;

        while (n != 0) {
            a = a * 10;
            a = a + n % 10;
            n = n / 10;
        }
        System.out.println("Перевернутое число: " + a);
    }
}
