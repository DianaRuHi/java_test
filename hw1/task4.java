import java.util.Scanner;

// *+Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. 
// Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.



public class task4 {
    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);
        System.out.printf("Введите выражение: ");
        String f = isc.nextLine();
        isc.close();

        String[] ur = f.split(" ");
        String a = ur[0], b = ur [2], res = ur[4];
        int count = 0;

        //Случай когда в каждом числе может быть только один ?
        for(int i = 0; i < 10; i ++){
            int a1 = Integer.valueOf(a.replace('?', Character.forDigit(i, 10)));
            for(int j = 0; j < 10; j ++){
                int b1 = Integer.valueOf(b.replace('?', Character.forDigit(j, 10)));
                for(int k = 0; k < 10; k ++){
                    int res1 = Integer.valueOf(res.replace('?', Character.forDigit(k, 10)));
                    if (a1 + b1 == res1){
                        count++;
                        System.out.println(a1 + " + " + b1 + " = " + res1 );
                        break;
                    }
                    if (count != 0) break;
                }
                if (count != 0) break;
            }
    
        }
        if (count == 0) System.out.println("Нет решения");

    }
}
