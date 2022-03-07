import java.util.Scanner;

public class Main {

    //Вывести на экран квадрат из 10х10 букв S используя цикл while.
    //Буквы в каждой строке не разделять.

    public static void main(String[] args) {

        int a = 0;
        int b = 0;
        while (a < 10){
            a++;
            while (b < 10){
                b++;
                System.out.print("S");
            }
            System.out.println();
            b = 0;
        }

    }
}





