package variables;

public class N1 {
    N2 x = new N2();
    static N2 y = new N2();

    public static void main(String[] args) {
        N1.s1();
        N1 n1 = new N1();
        n1.ns1();

    }

    public void ns1(){
        /* we can access static and non-static method of other class using static
         and non-static reference variable in main class
         */
        x.s();
        x.ns();
        y.ns();
        y.s();
    }

    public static void s1() {

        // We can access other's class methods through static reference variable in the main class
        y.s();
        y.ns();

        // We can not access other's class methods through non-static reference variable in the main class
       /* x.s();
        x.ns();*/
    }
}
