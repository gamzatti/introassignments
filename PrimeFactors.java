import java.util.ArrayList;

public class PrimeFactors {
    public static void main (String [] args) {
        PrimeFactors p = new PrimeFactors();
        ArrayList<Integer> result = p.generate(1);
        System.out.println(result);
        //result = p.generate(30);
        //System.out.println(p.generate(1));

    }

    private ArrayList<Integer> generate(int n) {
        ArrayList<Integer> result = new ArrayList<>();
        return result;
    }
}
