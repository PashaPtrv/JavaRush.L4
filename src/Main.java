import java.util.Scanner;

public class Main {

    //Ввести с клавиатуры четыре числа, и вывести максимальное из них.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        if (num1 > num2 && num1 > num3 && num1 > num4){
            System.out.println(num1);
        } else if (num2 > num1 && num2 > num3 && num2 > num4){
            System.out.println(num2);
        } else if (num3 > num1 && num3 > num2 && num3 > num4){
            System.out.println(num3);
        } else if (num4 > num1 && num4 > num2 && num4 > num3){
            System.out.println(num4);
        } else System.out.println("Все числа равны!");
    }
}



