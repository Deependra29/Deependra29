package interfaces.multipleInheritance;

public class C implements A,B{

    @Override
    public void display() {
        System.out.println("Display the name .........!");
    }

    @Override
    public void show() {
        System.out.println("Show the name.............!");

    }
}
