package inheritance;

public class Main {
    public static void main(String[] args) {
        Bag bag = new Bag();
        System.out.println(bag.color);
        System.out.println(bag.shape);
        System.out.println(bag.size);
        bag.carry();
        bag.close();
        bag.open();
        bag.write(); // pen writing used in bag
        bag.store();// box store used in box
    }
}
