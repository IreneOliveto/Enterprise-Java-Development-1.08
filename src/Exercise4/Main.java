package Exercise4;

public class Main {
    public static void main(String[] args) {
        IntArrayList vec = new IntArrayList();

        for(int i = 0; i < 100; i++) {
            vec.add(i);
            System.out.println(vec.size);
        }
    }
}
