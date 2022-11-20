//Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение)
import java.util.Scanner;


public class task5 {
    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);
        System.out.printf("Введите строку: ");
        String strin = isc.nextLine();
        isc.close();

        task5 t5 = new task5();
        System.out.println(Boolean.toString(t5.isPolindrom(strin)));

    }

    public Boolean isPolindrom(String str){
        Boolean res = true;
        int len = str.length();
        for (int i = 0; i < len/2; i++){
            if (!(str.charAt(i) == str.charAt(len - i -1))) res = false;
        }

        return res;
    }
    
}
