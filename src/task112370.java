import java.util.Scanner;
public class task112370 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), s = 0, maxel = Integer.MIN_VALUE, ind = 0;
        int[][] arr2x = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr2x[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr2x[i][j] != arr2x[j][i]) {
                    ind++;
                }
            }
        }
        if (ind == 0) {
            System.out.println("YES");
        }
        else System.out.println("NO");
    }

}
