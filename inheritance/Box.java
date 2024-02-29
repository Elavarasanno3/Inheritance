package inheritance;

public class Box extends Pen {
    String color = "yellow";
    int size = 5;
    String shape = "square";

    public void store(){
        System.out.println("This is Box store");
    }
    public void open(){
        System.out.println("This is Box open");
    }
    public void close(){
        System.out.println("This is Box close");
    }
}
