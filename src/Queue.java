import java.util.LinkedList;

public class Queue {
    private LinkedList<Person> linkedList = new LinkedList<>();
    private static final int LAST_NAME = 1;
    private static final int AGE = 2;

    QuickSort quickSort = new QuickSort();

    public Queue(){
    }

    public void enqueue(Person person){
        linkedList.addLast(person);
    }

    public Person dequeue(){
        return linkedList.removeFirst();
    }

    public Person getFront(){
        return linkedList.getFirst();
    }

    public boolean isEmpty(){
        return linkedList.isEmpty();
    }

    public void clear(){
        linkedList.clear();
    }

    public void printAll(){
        for(int i = 0; i<linkedList.size(); i++){
            linkedList.get(i).printPerson();
        }
    }

    public void sortLastName(){
        quickSort.sort(linkedList, LAST_NAME);
    }

    public void sortAge(){
        quickSort.sort(linkedList, AGE);
    }

}
