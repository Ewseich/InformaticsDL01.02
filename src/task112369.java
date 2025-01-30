import java.util.Scanner;
public class task112369 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), s = 0, maxel = Integer.MIN_VALUE, ind = 0;
        int[][] arr2x = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr2x[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                arr2x[i][j] = 0;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr2x[i][j] + " ");
            }
            System.out.println();
        }
    }
}