import java.util.Scanner;

public class Main {

    //Вывести на экран таблицу умножения 10х10 используя цикл while.
    //Числа разделить пробелом.

    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        while (a <= 10) {
            while (b <= 10) {
                System.out.print(a * b + " ");
                b++;
            }
            a++;
            b = 1;
            System.out.println();
        }
    }
}







