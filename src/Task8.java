import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = scanner.nextInt();

        int a = 0;
        int count = 0;

        while (n != 0) {
            count++;
            a = a + n % 10;
            n = n / 10;
        }
        System.out.println("Сумма чисел: " + a);
        System.out.println("Количество чисел: " + count);
    }
}
