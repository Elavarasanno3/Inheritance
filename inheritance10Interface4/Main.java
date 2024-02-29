package inheritance10Interface4;

public class Main {
    public static void main(String[] args) {
        Box box = new Bag();
        System.out.println(box.color);
        System.out.println(box.shape);
        System.out.println(box.size);
        box.close(); // method running from bag
        box.open(); // method running from bag
        box.carry(); // method running from bag
        box.write(); // used from pen;
        box.store();// use from box;

    }
}
