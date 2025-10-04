public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(new Person("1", "1", "1"));
        queue.enqueue(new Person("2", "2", "2"));
        queue.enqueue(new Person("3", "3", "3"));

        queue.printAll();
        System.out.println();

        queue.dequeue();

        queue.printAll();
        System.out.println();
    }
}