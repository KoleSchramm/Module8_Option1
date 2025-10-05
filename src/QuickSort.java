import java.util.LinkedList;

public class QuickSort {
    private static final int LAST_NAME = 1;
    private static final int AGE = 2;

    public void sort(LinkedList<Person> list, int sortBy){
        if(list.size() <= 1){
            return;
        }

        Person pivot = list.getLast();
        LinkedList<Person> left = new LinkedList<>();
        LinkedList<Person> right = new LinkedList<>();

        //Split into two linked lists based on last name
        if(sortBy == LAST_NAME){
            for(int i = 0; i<list.size() - 1; i++){
                if(list.get(i).getLastName().compareToIgnoreCase(pivot.getLastName())>0) {
                    left.add(list.get(i));
                }
                else{
                    right.add(list.get(i));
                    }
            }
        }

        //Parse strings into integers, split into two linked lists based on age
        if(sortBy == AGE){
            try {
                Integer.parseInt(pivot.getAge());
            }
            catch (Exception e){
                System.out.println("Age could not be sorted: ");
                pivot.printPerson();
                System.out.println();
                return;
            }
            for(int i = 0; i<list.size() - 1; i++){
                try {
                    int age = Integer.parseInt(list.get(i).getAge());
                    if (age-Integer.parseInt(pivot.getAge())>0) {
                        left.add(list.get(i));
                    } else {
                        right.add(list.get(i));
                    }
                }
                catch (Exception e){
                    System.out.println("Age could not be sorted: ");
                    list.get(i).printPerson();
                    System.out.println();
                    return;
                }
            }
        }

        //Recursively sort left and right lists
        sort(left, sortBy);
        sort(right, sortBy);

        //Rebuild list with sorted elements
        list.clear();
        for(int i = 0; i< left.size(); i++){
            list.addLast(left.get(i));
        }
        list.addLast(pivot);
        for(int i = 0; i< right.size(); i++){
            list.addLast(right.get(i));
        }
    }
}