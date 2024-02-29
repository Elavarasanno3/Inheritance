package inheritance7Interface1;

public class Bag extends Box implements Inter1 {
    String color = "black";
    int size = 10;
    String shape = "square";

    public void carry(){
        System.out.println("This is bag carry");
    }
    public void open(){
        System.out.println("This is bag open");
    }
    public void close(){
        System.out.println("This is bag close");
    }
}
