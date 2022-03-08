import java.util.Scanner;

public class Main {

    //Вводить с клавиатуры числа и считать их сумму.
    // Если пользователь ввел -1, вывести на экран сумму и завершить программу. -1 должно учитываться в сумме.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int a = scanner.nextInt();
        while (a != -1){
            sum += a;
            a = scanner.nextInt();
        }
        System.out.println(sum - 1);
    }
}









