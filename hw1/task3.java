import java.util.Scanner;

//Реализовать простой калькулятор


public class task3 {
    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);
        System.out.printf("Введите число a: ");
        double a = isc.nextDouble();
        System.out.printf("Введите число b: ");
        double b = isc.nextDouble();
        System.out.printf("Что вы хотите сделать с числами (1 - сложить, 2 - вычесть, 3 - умножить, 4 - разделить): ");
        int oper = isc.nextInt();
        isc.close();


        switch (oper) {
            case 1:
                System.out.println("a + b = " + (a+b));
                break;
            case 2:
                System.out.println("a - b = " + (a-b));
                break;
            case 3:
                System.out.println("a * b = " + (a*b));
                break;
            case 4:
                System.out.println("a / b = " + (a/b));
                break;
            default:
                System.out.println("Неверный выбор действия.");
                break;
        }


    }
    
}
