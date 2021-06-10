import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите высоту фигуры ");
        int a = scanner.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j <= a; j++) {
                if ((j == a - 1) || ((i == 0) && (j < a)) || (j == i)) {
                    System.out.print('*');
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }

        System.out.println(" ");

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if ((i == 0) || (j >= i)) {
                    System.out.print('*');
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}
