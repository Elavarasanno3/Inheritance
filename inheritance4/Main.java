package inheritance4;

public class Main {
    public static void main(String[] args) {
        Box box = new Bag();
        System.out.println(box.color);
        System.out.println(box.shape);
        System.out.println(box.size);
        box.store();
        box.close();
        box.open();
        box.write(); // used from pen
    }
}
