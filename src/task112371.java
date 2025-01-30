import java.util.Scanner;
public class task112371 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), indx1 = -1, indx2 = -2, indy1 = -1, indy2 = -2, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int[][] arr2x = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr2x[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr2x[i][j] < min) {
                    min = arr2x[i][j];
                    indx1 = j;
                    indy1 = i;
                }
            }
            for (int k = 0; k < n; k++) {
                if (arr2x[k][indy1] > max) {
                    max = arr2x[k][indy1];
                    indx2 = k;
                    indy2 = i;
                }
            }
            if (indy1 == indy2 && indx1 == indx2) System.out.println(indx1 + " " + indy1 + " ");
            max = Integer.MIN_VALUE;
            min = Integer.MAX_VALUE;
            indx1 = -1; indx2 = -2; indy1 = -1; indy2 = -2;
        }
    }

}