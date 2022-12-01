import java.util.HashMap;
import java.util.Map;

public class task10 {

    // Вам дан массив путей, где пути[i] = [”Город А”, “Город Б”] означают, что существует прямой путь, идущий от
    // ”Город А” до“Город Б”. Верните город назначения, то есть город без какого-либо пути, ведущего в другой город.
    // Пример 1: Input: s = [["Москва","Самара"], ["Курск","Пенза"],["Самара","Курск"]]  Output: Пенза
    // Пример 2: Input: s = [["Москва","Самара"]]  Output: Самара
    public static void main(final String[] args) {
        Task2 task2 = new Task2();
        Map<String, String> taskMap = new HashMap<>();
        taskMap.putIfAbsent("Москва","Самара");
        taskMap.putIfAbsent("Курск","Пенза");
        taskMap.putIfAbsent("Самара","Курск");
        System.out.println(task2.getFinalCity(taskMap));
    }

    public String getFinalCity(final Map<String, String> map){
        String res = "";
        for (String item: map.values()){
            if (map.containsKey(item) == false) res += item + " ";
        }
        return res;
    }

}
