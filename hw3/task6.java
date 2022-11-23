import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class task6 {
    
    public static void main(String[] args) {
        task6 t6 = new task6();
        List<String> planets = t6.listOfPlanets(20);
        System.out.println(planets.toString());
        System.out.println();
        t6.numberPlanets(planets);
        System.out.println();
        System.out.println(t6.planetsUno(planets).toString());
        
    }

    // Заполнение списка названиями планет
    public List<String> listOfPlanets (Integer size){
        List<String> planetsList = new ArrayList<>();
        String[] planets = new String[]{"Меркурий","Венера","Земля","Марс","Юпитер","Сатурн","Уран","Нептун","Плутон"};
        Random random = new Random();
        for (int i = 0; i < size; i++){
        planetsList.add(planets[random.nextInt(9)]);
        }

        return planetsList;
    }

    // Выводит название планеты и количество ее повторений в списке
    public void numberPlanets (List<String> planetsList){
        Map<String, Integer> planets = new HashMap<>();
        for(String item: planetsList){
            int count = 1;
            if (planets.containsKey(item)){
                count = planets.get(item) + 1;
                planets.put(item, count);
            } else {
                planets.put(item, count);
            }
        }
        for(String item: planets.keySet()){
            System.out.println(item + ": " + planets.get(item));
        }
    }

    // Удаление повторяющихся элементов
    public List<String> planetsUno (List<String> planetsList){
        int i = 0;
        while (i < planetsList.size()){
            if (planetsList.lastIndexOf(planetsList.get(i)) != i){
                planetsList.remove(planetsList.lastIndexOf(planetsList.get(i)));
            } else {
                i++;
            }
        }
        return planetsList;
    }

}
