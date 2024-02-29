package inheritance7Interface1;

public class Main {
    public static void main(String[] args) {
        Bag bag = new Bag();
        System.out.println(bag.color);
        System.out.println(bag.shape);
        System.out.println(bag.size);
        bag.close();
        bag.open();
        bag.carry();
        bag.write(); // used from pen;
        bag.store();// use from box;

    }
}
