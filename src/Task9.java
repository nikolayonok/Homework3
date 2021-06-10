import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[2];
        System.out.println("Введите число ярусов и высоту первого яруса через пробел: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int a = array[0];
        int height = array[1];

        for (int m = 0; m < a; m++) {
            for (int i = 0; i < height + m; i++) {
                for (int j = -a; j < height - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < (2 * i + 1); k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
