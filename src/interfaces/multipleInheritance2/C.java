package interfaces.multipleInheritance2;

public class C implements A, B{

    @Override
    public void show() {
        System.out.println("If 2 interface has same method then implemention class give only one method");
    }
}
