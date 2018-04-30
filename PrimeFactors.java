import java.util.ArrayList;

public class PrimeFactors {
    public static void main (String [] args) {
        PrimeFactors p = new PrimeFactors();
        //ArrayList<Integer> result = p.generate(1);
        //System.out.println(result);
        //result = p.generate(30);
        System.out.println(p.generate(30));

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
        return true;
    }

}
