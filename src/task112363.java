import java.util.Scanner;
public class task112363 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), s = 0;
        int[][] arr2x = new int[n][m];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                arr2x[i][j] = sc.nextInt();
                s += arr2x[i][j];
            }
        }
        System.out.println(s);
    }
}