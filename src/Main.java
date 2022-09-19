import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int price, priceMile= 20, mile;
        System.out.println("Введите стоимость билета для вычисления миль, которые будут за него начислены");

        Scanner scanner = new Scanner(System.in);
        price = scanner.nextInt();
        mile= price / priceMile;
        System.out.println("За купленный билет будет начисленно количество миль равное " + mile);
    }
}