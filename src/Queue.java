import java.util.LinkedList;

public class Queue {
    LinkedList<Person> linkedList = new LinkedList<>();

    public Queue(){
    }

    public void enqueue(Person person){
        linkedList.addFirst(person);
    }

    public Person dequeue(){
        return linkedList.removeLast();
    }

    public Person getFront(){
        return linkedList.getLast();
    }

    public boolean isEmpty(){
        return linkedList.isEmpty();
    }

    public void clear(){
        linkedList.clear();
    }
}
