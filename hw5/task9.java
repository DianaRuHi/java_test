import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class task9 {

    // Дана строка. Необходимо написать метод, который отсортирует слова в строке по длине с помощью TreeMap.
    // Строки с одинаковой длиной не должны “потеряться”.
    public static void main(final String[] args) {
        Task3 task3 = new Task3();
        String text = "Мороз и солнце день чудесный еще ты дремлешь друг прелестный";
        System.out.println(task3.getSortedIncludesWords(text));
    }

    public String getSortedIncludesWords(final String inputText){
        List<String> textList = Arrays.asList(inputText.toLowerCase().split(" "));
        Map<Integer, List<String>> map = new TreeMap<>();
        for (String item: textList){
            if (map.containsKey(item.length())){
                List<String> temp = map.get(item.length());
                temp.add(item);

                map.put(item.length(), temp);
            } else {
                List<String> temp = new ArrayList<>();
                temp.add(item);
                map.put(item.length(), temp);
            }
        } 
        String res = "";
        for (List<String> item: map.values()){
            for (String item2: item){
                res += item2 + " ";
            }
        }

        return res;
    }

}
