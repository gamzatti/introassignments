public class Diamond {
    public static void main(String [] args) {
        Diamond d = new Diamond();
        //d.drawDiamond(3);
        d.drawDiamondName(3);
        //d.drawIsoc(3);
        //d.drawMiddle(3);
    }
    public void drawLine(int n, int i){
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

    public void drawIsoc(int n) {
        for (int i=1; i<(n*2)-2; i+=2) {
            drawLine(n, i);
        }
    }

    public void drawMiddle(int n) {
        drawLine(n, n+2);
    }

    public void drawBottom(int n) {
        for (int i=(n*2)-3; i>=1; i-=2) {
            drawLine(n, i);
        }
    }
    public void drawDiamond(int n) {
        drawIsoc(n);
        drawMiddle(n);
        drawBottom(n);
        }

    public void drawDiamondName(int n) {
        drawIsoc(n);
        System.out.println("Emily");
        drawBottom(n);
    }
}
