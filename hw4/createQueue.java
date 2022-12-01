import java.util.LinkedList;
import java.util.Queue;

public class createQueue {
    
    private final Queue<Integer> qList;

// Реализуйте очередь с помощью LinkedList со следующими методами:
    public createQueue(LinkedList<Integer> lList){
        Queue<Integer> quList = new LinkedList<>();
        int size = lList.size();
        for (int i = 0; i < size; i++){
            quList.add(lList.removeFirst());
        }

        this.qList = quList;
    }

// enqueue() - помещает элемент в конец очереди,
    public void enqueue(Integer element){
        this.qList.add(element);
    }
// dequeue() - возвращает первый элемент из очереди и удаляет его,
    public Integer dequeue(){
        return this.qList.poll();
    }
// first() - возвращает первый элемент из очереди, не удаляя. 
    public Integer first(){
        Integer ans = this.qList.poll();
        this.qList.add(ans);
        for (int i = 0; i < this.qList.size() - 1; i++){
            this.qList.add(this.qList.poll());
        }
        return ans;
    }

    public Queue<Integer> getqList() {
        return qList;
    }
    @Override
    public String toString() {
        return this.qList.toString();
    }
    
}
