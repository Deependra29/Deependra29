package variables;

public class StaticVariable {
    static int age = 11;

    /*public static void main(String[] args) {
        StaticVariable.static1();
        StaticVariable s = new StaticVariable();
        s.abc();

        System.out.println(StaticVariable.age);
    }*/

    public void abc() {
        System.out.println(StaticVariable.age);
        System.out.println("My name is deep");
    }

    public static void static1() {
        System.out.println(StaticVariable.age);
    }
}
