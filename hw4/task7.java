import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

// Пусть дан LinkedList с несколькими элементами. +
// Реализуйте метод, который вернет “перевернутый” список. +
// Реализуйте очередь с помощью LinkedList со следующими методами:  +
// enqueue() - помещает элемент в конец очереди,  +
// dequeue() - возвращает первый элемент из очереди и удаляет его,  +
// first() - возвращает первый элемент из очереди, не удаляя. +
// * В калькулятор добавьте возможность отменить последнюю операцию. ?????

public class task7 {
    public static void main(String[] args) {
        task7 t7 = new task7();

        LinkedList<Integer> lList = new LinkedList<>(Arrays.asList(9,3,1,5,0));
        System.out.println("List: " + lList.toString());

        LinkedList<Integer> rList = t7.revers(lList);
        System.out.println("Revers list : " + rList.toString());

        createQueue cQ = new createQueue(rList);
        System.out.println("Queue: " + cQ.toString());

        cQ.enqueue(99);
        System.out.println("Add to the end: " + cQ.toString());

        System.out.println(Integer.toString(cQ.dequeue()));
        System.out.println("Take first with delete: " + cQ.toString());

        System.out.println(Integer.toString(cQ.first()));
        System.out.println("Take first without delete: " + cQ.toString());
    }
// Реализуйте метод, который вернет “перевернутый” список.
    public LinkedList<Integer> revers(LinkedList<Integer> lList){
        LinkedList<Integer> rList = new LinkedList<>();
        int size = lList.size();
        for (int i = 0; i < size; i++){
            rList.add(lList.removeLast());
        }
        return rList;
    }
}
