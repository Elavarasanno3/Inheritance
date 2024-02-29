package inheritance11interface5;

public class Main {
    public static void main(String[] args) {
        Pen pen  = new Box();
        System.out.println(pen.color);
        System.out.println(pen.shape);
        System.out.println(pen.size);
        pen.close(); // method running from bag
        pen.open(); // method running from bag
//        pen.carry(); // method running from bag if its not available in box, or pen then its an error.
        pen.write(); // used from pen;
//        pen.store();// use from box;

    }
}
