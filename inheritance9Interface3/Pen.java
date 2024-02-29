package inheritance9Interface3;

public class Pen implements Inter1 {
    String color = "blue";
    int size = 2;
    String shape = "square";

    public void write(){
        System.out.println("This is pen write");
    }
    public void open(){
        System.out.println("This is pen open");
    }
    public void close(){
        System.out.println("This is pen close");
    }

}
