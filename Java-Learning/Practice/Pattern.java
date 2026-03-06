package Practice;

public class Pattern {
    public static void main(String[] args) {
        int n=5;

        // square stars
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        //right-angle
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        //right-agnle-revrse
        // for(int i=0;i<n;i++){
        //     for(int j=i;j<n;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();

        // }

        //space-right-angle
        for (int i = 0; i <=n; i++) {

            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
