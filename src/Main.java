import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Queue queue = new Queue();

        for(int i = 1; i<6; i++){
            System.out.println("Input the first name, last name, and age of person " + i +":");
            queue.enqueue(new Person(scan.next(), scan.next(), scan.next()));
        }

        System.out.println("Starting queue:");
        queue.printAll();

        queue.sortLastName();

        System.out.println("Sorted by last name (descending):");
        queue.printAll();

        queue.sortAge();

        System.out.println("Sorted by age (descending):");
        queue.printAll();
    }
}