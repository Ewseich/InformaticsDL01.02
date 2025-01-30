import java.util.Scanner;
public class task111626 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), obrsp = 0;
        int[][] arr2x = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr2x[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            obrsp += arr2x[n-1][i];
            obrsp += arr2x[0][i];
            if (i > 0 && i < n-1){
                obrsp += arr2x[i][0];
                obrsp += arr2x[i][n - 1];

            }
        }
        System.out.println(obrsp);

    }

}
