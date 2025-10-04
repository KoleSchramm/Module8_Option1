import java.util.LinkedList;

public class QuickSort {
    private final int LAST_NAME = 1;
    private final int AGE = 2;

    public void sort(LinkedList<Person> list, int sortBy){
        if(list.size() <= 1){
            return;
        }

        Person pivot = list.getLast();
        LinkedList<Person> left = new LinkedList<>();
        LinkedList<Person> right = new LinkedList<>();

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

        if(sortBy == AGE){
            for(int i = 0; i<list.size() - 1; i++){
                if(list.get(i).getAge().compareToIgnoreCase(pivot.getAge())>0) {
                    left.add(list.get(i));
                }
                else{
                    right.add(list.get(i));
                }
            }
        }

        sort(left, sortBy);
        sort(right, sortBy);

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
