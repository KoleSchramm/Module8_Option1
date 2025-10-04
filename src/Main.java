public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(new Person("Jeff", "Goldbloom", "45"));
        queue.enqueue(new Person("Rick", "Sanchez", "89"));
        queue.enqueue(new Person("Phil", "Phillips", "23"));
        queue.enqueue(new Person("Peter", "Griffin", "45"));
        queue.enqueue(new Person("John", "Johnson", "4"));

        System.out.println("Starting queue: ");
        queue.printAll();
        System.out.println();

        queue.sortLastName();

        System.out.println("Sorted by last name:");
        queue.printAll();
        System.out.println();

        queue.sortAge();

        System.out.println("Sorted by age:");
        queue.printAll();
        System.out.println();


    }
}