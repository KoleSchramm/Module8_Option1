public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(new Person("1", "1", "1"));
        queue.enqueue(new Person("2", "2", "2"));
        queue.enqueue(new Person("3", "3", "3"));

        queue.printAll();
        System.out.println();

        queue.dequeue().printPerson();
        System.out.println();

        queue.printAll();
        System.out.println();

        System.out.println(queue.isEmpty());
        System.out.println();

        queue.clear();
        queue.printAll();

        System.out.println("Starting queue: ");
        queue.enqueue(new Person("Jeff", "Goldbloom", "45"));
        queue.enqueue(new Person("Rick", "Sanchez", "89"));
        queue.enqueue(new Person("Phil", "Phillips", "23"));
        queue.enqueue(new Person("Peter", "Griffin", "45"));
        queue.enqueue(new Person("John", "Johnson", "4"));

        queue.printAll();
        System.out.println();

        System.out.println("Sorted by last name:");
        queue.sortLastName();
        queue.printAll();
        System.out.println();

    }
}