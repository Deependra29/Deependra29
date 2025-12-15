package interfaces.defaults;

public interface B {
    default void hello(){
        System.out.println("This is hello from B ");
    }
}
