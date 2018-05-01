import java.util.ArrayList;

public class PrimeFactors {
    public static void main (String [] args) {
        PrimeFactors p = new PrimeFactors();
        System.out.println(p.generate(1));
        System.out.println(p.generate(5));
        System.out.println(p.generate(30));
        System.out.println(p.generate(45));
        System.out.println(p.generate(60));
//        System.out.println("1 " + p.isprime(1));   //false
//        System.out.println("2 " + p.isprime(2));   //true
//        System.out.println("3 " + p.isprime(3));   //true
//        System.out.println("4 " + p.isprime(4));   //false
//        System.out.println("5 " + p.isprime(5));   //true
//        System.out.println("6 " + p.isprime(6));   //false
//        System.out.println("7 " + p.isprime(7));   //true
//        System.out.println("8 " + p.isprime(8));   //false
//        System.out.println("9 " + p.isprime(9));   //false
//        System.out.println("10 " + p.isprime(10));   //false

    }

    private ArrayList<Integer> generate(int n) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 1; i<n; i++) {
            if (isfactor(n,i) && isprime(i)) {
                result.add(i);
            }
        }
        return result;
    }

    private boolean isfactor(int n, int i) {
        return n % i == 0;
    }


    private boolean isprime(int i) {
        if (i == 1) {
            return false;
        }
        for (int j = 2; j < i; j++) {
            if (isfactor(i,j)) {
                return false;
            }
        }
        return true;
    }

}
