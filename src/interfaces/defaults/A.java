package interfaces.defaults;

public interface A {
    default void hello(){
        System.out.println("Hello from A");
    }
}
