import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class task8 {

    // Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
    // Пусть дан список сотрудников:Иван Иванов (и остальные, полный текст дз будет на платформе)
    // Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
    // Отсортировать по убыванию популярности.
    public static void main(final String[] args) {
        Homework hw = new Homework();
        String finum =  "Ева,Дарахвелидзе,89010348765;Ева,Дарахвелидзе,89010344345;Андрей,Иванов,89050377654;Дмитрий,Пономаренко,89344322343;Андрей,Иванов,89050352659;";
        System.out.println(hw.getCount(finum));
    }

    public String getCount (String fioNumber) {
        String res = "";
        List<String> people = Arrays.asList(fioNumber.split(";"));
        Map<String, Integer> mans = new HashMap<>();
        for (String person: people){
            List<String> info = Arrays.asList(person.split(","));
            String fi = info.get(0) + " " + info.get(1);
            if (mans.containsKey(fi)){
                Integer count = mans.get(fi) + 1;
                mans.put(fi, count);
            } else {
                mans.putIfAbsent(fi, 1);
            }
        }
        for (String fi:mans.keySet()){
            res += fi + " - " + Integer.toString(mans.get(fi)) + " тел.; ";
        }
        return res;
    }

}