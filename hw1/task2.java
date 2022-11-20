//Вывести все простые числа от 1 до 1000


public class task2 {
    public static void main(String[] args) {
        int countAll = 0;

        for (int i = 2; i <= 1000; i++){
            int count = 0;
            for (int j = 2; j < i; j++){
                if (i%j == 0) count ++;
            }
            if (count == 0){
                System.out.println(i);
                countAll++;
            }
            
        }
        System.out.println("Всего простых чисел от 1 до 1000: " + countAll); // Для проверки (168 простых числа)
        
    }
    
}
