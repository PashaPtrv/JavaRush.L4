import java.util.Scanner;

public class Main {

    //Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        if (num1 > num2)
            System.out.println(num2);
         else System.out.println(num1);
    }

}

