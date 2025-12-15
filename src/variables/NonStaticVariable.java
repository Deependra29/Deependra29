package variables;

public class NonStaticVariable {
    String name = "Deependra";
    static StaticVariable st;
    StaticVariable st1;
    public static void main(String[] args) {
        NonStaticVariable result = new NonStaticVariable();
        System.out.println(result.name);

        result.abc1();
        NonStaticVariable.abc2();
    }
    public void abc1(){
        NonStaticVariable result2 = new NonStaticVariable();
        System.out.println(result2.name);

        //System.out.println("Static class variable : "+st.age);
        System.out.println("Static class variable : ");
        st.static1();
        st1= new StaticVariable();
        System.out.println(".....................");
        st1.abc();

    }
    public static void abc2(){
        NonStaticVariable result2 = new NonStaticVariable();
        System.out.println(result2.name);

        //System.out.println("Static class variable : "+st.age);
        System.out.println("Inside abc method : Static class variable : ");
        st.static1();
        System.out.println("Inside abc2");
        st.abc();
        //st1= new StaticVariable();
        //System.out.println(".....................");
        //st1.abc();

    }
}
