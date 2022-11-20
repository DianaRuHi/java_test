// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
import java.util.Scanner;


public class task1 {
    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);
        System.out.printf("Введите n: ");
        int n = isc.nextInt();
        isc.close();

        int fac = 1;
        int treu = 0;
        for (int i = 1; i <= n; i++){
            fac *= i;
            treu += i;
        }
        System.out.println("Треугольное число: " + treu);
        System.out.println("Факториал: " + fac);
    }
}