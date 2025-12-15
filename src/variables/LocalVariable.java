package variables;

public class LocalVariable {
    public void showDetails(){
        int age = 26; // Local Variable
        String name  = "Deependra"; // Local Variable

        System.out.println(age);
        System.out.println(name);
    }
    public static void main(String[] args) {
        LocalVariable l = new LocalVariable();
        l.showDetails();
    }
}
