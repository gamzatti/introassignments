public class Triangle2 {
    public static void main (String args[]){
        Triangle2 t = new Triangle2();
        //t.drawHorizontal(8);
        //t.drawVertical(3);
        t.drawTriangle(3);
    }

    public void drawHorizontal(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public void drawVertical(int n) {
        for (int i=0; i<n; i++) {
            System.out.println("*");
        }
    }

    public void drawTriangle(int n) {
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//found my repository?

