import java.util.Scanner;

public class Main {

    //Ввести с клавиатуры строку и число N.
    //Вывести на экран строку N раз, используя цикл while.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = scanner.nextLine();
        System.out.println("Введите количество выводов:");
        int count = scanner.nextInt();
        int num = 1;
        while (num <= count){
            System.out.println(str);
            num++;
        }

    }
}





