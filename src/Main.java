import java.util.Scanner;

public class Main {

    //Ввести с клавиатуры имя и, используя цикл for 10 раз, вывести: [*имя* любит меня.]
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();
        for (int i = 0; i < 10; i++){
            System.out.println(name + " любит меня");
        }
    }
}









