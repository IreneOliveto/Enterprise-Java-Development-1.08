package Exercise4;

public class IntArrayList implements IntList {
    int numberElements = 0;
    int size = 10;
    int[] arrayList = new int[size];

    public void add(int number) {
        if(numberElements < size) {
            arrayList[numberElements] = number;
            numberElements++;
        } else {
            size = size + ( size / 2);
            int[] temporal = new int[size];
            for (int i = 0; i < arrayList.length; i++ ) {
                temporal[i]= arrayList[i];
            }
        }

    }

    public int get(int id) {
        return arrayList[id];
    }
}
