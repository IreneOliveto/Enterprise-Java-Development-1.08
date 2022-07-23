package Exercise4;

import java.util.ArrayList;

public class IntVector implements IntList {

    int numberElements = 0;
    int size = 20;
    int[] arrayList = new int[size];

    //constructor
    public IntVector() {
    }

    public void add(int number) {
        if (numberElements < size) {
            arrayList[numberElements] = number;
            numberElements++;
        } else {
            size = size * 2;
            int[] temporal = new int[size];
            for (int i = 0; i < arrayList.length; i++ ) {
                temporal[i]= arrayList[i];
            }
            arrayList = temporal;
        }
    }

    public int get(int id) {
        return arrayList[id];
    }
}
