import java.util.Scanner;

public class Main {

    //Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись «Подрасти еще»
    //Ввести с клавиатуры имя и возраст.
    //Если возраст больше 20 вывести надпись «И 18-ти достаточно»
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();
        System.out.println("Введите возраст: ");
        int age = scanner.nextInt();
        if (age < 18) System.out.println("Подрасти еще");
        else if (age > 20) System.out.println("И 18-ти достаточно");

    }
}





