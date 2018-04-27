public class Diamond {
    public static void main(String [] args) {
        Diamond d = new Diamond();
        d.drawDiamond(5);
    }
    public void drawLine(int n){

    }

    public void drawDiamond(int n) {

        for (int i=1; i<(n*2); i+=2) {
            for (int k=1; k<=(n-(i/2)); k++) {
                System.out.print("_");
            }
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            for (int k=1; k<=(n-(i/2)); k++) {
                System.out.print("_");
            }
            System.out.println("");
        }
        for (int i=(n*2)-3; i>=1; i-=2) {
            for (int k=1; k<=(n-(i/2)); k++) {
                System.out.print("_");
            }
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            for (int k=1; k<=(n-(i/2)); k++) {
                System.out.print("_");
            }
            System.out.println("");
        }

        }
}
