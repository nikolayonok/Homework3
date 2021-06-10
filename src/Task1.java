import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите высоту фигуры: ");
        int a = scanner.nextInt();

        for (int i = 0; i < a; i++) {
            for (int j = 1; j <= a; j++) {
                if ((j == a) || (i == a - 1)  || (j == a - i)) {
                    System.out.print('*');
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }

        for (int i = 0; i <= a; i++) {
            for (int j = 0; j < a; j++) {
                if ((i == a) || (j >= a - i)) {
                    System.out.print('*');
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}
