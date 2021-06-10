import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество ступенек в леснице: ");
        int a = scanner.nextInt();

        for (int i = 0; i < a; i++) {

            for (int j = 0; j <= i; j++) {
                if (j == i) {
                    System.out.println("***");
                } else {
                    System.out.print("  ");
                }
            }
            for (int j = 0; j <= i; j++) {
                if (j == i) {
                    System.out.println("  *");
                } else {
                    System.out.print("  ");
                }
            }
        }
    }
}
