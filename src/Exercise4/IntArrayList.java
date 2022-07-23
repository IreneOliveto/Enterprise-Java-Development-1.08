package Exercise4;

import java.util.List;
import java.util.ArrayList;

public class IntArrayList implements IntList {

    int numberElements = 0;
    int size = 10;
    ArrayList<Integer> arrayList = new ArrayList<Integer>(size);

    //constructor
    public IntArrayList() {
    }

    public void add(int number) {
        if (numberElements < size) {
            arrayList.add(number);
            numberElements++;
        } else {
            size = size + ( size / 2);
            ArrayList<Integer> temporal = new ArrayList<Integer>(size);
            for (int i = 0; i < arrayList.size(); i++ ) {
                temporal.add(i, arrayList.get(i));
            }
            arrayList = temporal;
        }
    }

    public int get(int id) {
        return arrayList.get(id);
    }
}
