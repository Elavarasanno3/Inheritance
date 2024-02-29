package inheritance3;

public class Main {
    public static void main(String[] args) {
        Pen pen = new Pen();
        System.out.println(pen.color);
        System.out.println(pen.shape);
        System.out.println(pen.size);
        pen.write();
        pen.close();
        pen.open();
    }
}
