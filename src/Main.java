import java.util.Scanner;

public class Main {

    //Ввести с клавиатуры два числа m и n.
    //Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(8);
            }
            System.out.println();
        }
    }
}








