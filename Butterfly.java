public class Butterfly {
    public static void main(String[] args) {
        int n = 5;
        // Butterfly

        for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
        System.out.print("*");
        }
        for(int j=1;j<=(2*(n-i));j++){
        System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
        System.out.print("*");
        }
        System.out.println();
        }
        for(int i=n;i>=1;i--){
        for(int j=1;j<=i;j++){
        System.out.print("*");
        }
        for(int j=1;j<=(2*(n-i));j++){
        System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
        System.out.print("*");
        }
        System.out.println();
        }


        //Hollow Butterfly

        // upper part
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 1; j <= (2 * (n - i)); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (j == 1 || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // lower part
        for (int i = n; i >=1 ; i--) {
            for (int j = 1; j <= i; j++) {
                if ( j == 1 || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 1; j <= (2 * (n - i)); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (j == 1 || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }
}
