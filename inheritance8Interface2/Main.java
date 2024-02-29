package inheritance8Interface2;

public class Main {
    public static void main(String[] args) {
        Bag bag2 = new Bag();
        System.out.println(bag2.color);
        System.out.println(bag2.shape);
        System.out.println(bag2.size);
        bag2.close();
        bag2.open();
        bag2.carry();
        bag2.write(); // used from pen;
        bag2.store();// use from box;

    }
}
