import java.util.Scanner;
public class task112367 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), s = 0, mins = Integer.MAX_VALUE, ind = 0;
        int[][] arr2x = new int[n][m];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                arr2x[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                s += arr2x[i][j];
            }
            if (s < mins) {
                ind = i;
                mins = s;
            }
            s = 0;
        }
        for (int i = 0; i < m; i++){
            System.out.print(arr2x[ind][i] + " ");
        }
    }
}