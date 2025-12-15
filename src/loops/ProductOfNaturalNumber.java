package loops;

public class ProductOfNaturalNumber {
    public static void main(String[] args) {
        int product = 1;
        for(int i=1; i<=10; i++){
            product = product*i;
        }
        System.out.println("Product of N natural number : " + product);
    }
}
