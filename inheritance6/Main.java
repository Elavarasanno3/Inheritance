package inheritance6;

public class Main {
    public static void main(String[] args) {
        Pen pen = new Bag();
        System.out.println(pen.color);
        System.out.println(pen.shape);
        System.out.println(pen.size);
        pen.close();
        pen.open();
        pen.write(); // used from pen
    }
}
