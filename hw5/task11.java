import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class task11 {

    // Дана последовательность чисел. Необходимо вернуть число совпадающих пар в этой последовательности
    // Пример 1:     In: arr = [1, 2]  Out: 0
    // Пример 2:     In: arr = [1, 1, 2]  Out: 1
    // Пример 3:     In: arr = [1, 1, 1, 2, 2]  Out: 4
    public static void main(final String[] args) {
        Task1 task1 = new Task1();
        List<Integer> taskList = new ArrayList<>(List.of(1, 1, 1, 2, 2, 2));
        System.out.println(task1.getNumberOfCouples(taskList));

    }

    public Integer getNumberOfCouples(final List<Integer> list){
        Map<Integer,Integer> checkMap = new HashMap<>();
        Task1 task1 = new Task1();

        for (Integer item: list) {
            checkMap.put(item, 1 + checkMap.getOrDefault(item, 0));
        }
        Integer res = 0;
        for (Integer item: checkMap.values()){
            BigInteger temp1 = task1.factorial(new BigInteger(Integer.toString(item)));
            BigInteger temp2 = task1.factorial(new BigInteger(Integer.toString(item - 2)));
            Integer tem1 =  temp1.intValue();
            Integer tem2 =  temp2.intValue(); 
            res = res + tem1/(2*tem2); // C из n по k
        }

        return res;
    }

    public BigInteger factorial(BigInteger number) {
        BigInteger result = BigInteger.valueOf(1);
    
        for (long factor = 2; factor <= number.longValue(); factor++) {
            result = result.multiply(BigInteger.valueOf(factor));
        }
    
        return result;
    }

}
