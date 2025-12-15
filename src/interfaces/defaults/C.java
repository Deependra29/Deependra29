package interfaces.defaults;


public class C implements A, B{

    @Override
    public void hello() {
        A.super.hello();
        B.super.hello();
    }
}
