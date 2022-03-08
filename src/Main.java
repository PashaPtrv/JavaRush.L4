import java.util.Scanner;

public class Main {

    /*Ввести с клавиатуры строку name.
        Ввести с клавиатуры дату рождения (три числа): y, m, d.
        Вывести на экран текст:
        «Меня зовут name
        Я родился d.m.y»*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();
        System.out.println("Введите дату рождения год/месяц/день ");
        int y = scanner.nextInt();
        int m = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.println("Меня зовут " + name);
        System.out.println("Я родился " + d + "." + m + "." + y);
    }
}









