package variables;

public class N2 {
    int age = 28;
    static String name = "Deependra" ;

    public void ns(){
        System.out.println("I am non-static method with non-static variable: " + age);
        System.out.println("I am non-static method with static variable: " + name);
    }
    public static void s(){
        // can not access non-static variable inside static method
        System.out.println("I am static method with non-static variable: " );
        System.out.println("I am static methods with static variable :" + name);
    }
}
