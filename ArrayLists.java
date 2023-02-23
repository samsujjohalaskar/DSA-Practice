import java.util.ArrayList;
import java.util.Collections;

class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        //add operation
        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println(list);

        //get operation
        System.out.println(list.get(1));

        //add element in between
        list.add(1,4);
        System.out.println(list);        

        //modify operation
        list.set(2,1);
        System.out.println(list);

        //delete operation
        list.remove(2);
        System.out.println(list);

        //size
        System.out.println(list.size());

        //loops
        for(int i=0; i<list.size();i++){
            System.out.print(list.get(i));
        }
        System.out.println();

        //sorting
        Collections.sort(list);
        System.out.println(list);

    }
}
