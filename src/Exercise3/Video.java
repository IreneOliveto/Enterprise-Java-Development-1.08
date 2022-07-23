package Exercise3;

public abstract class Video {
    private String title;
    private String author;
    private int length;
    private boolean seen = false;

    public abstract void method();

    public void watch() {
        seen = true;
    }

}
