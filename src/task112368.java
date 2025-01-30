import java.util.Scanner;
public class task112368 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), s = 0, maxel = Integer.MIN_VALUE, ind = 0;
        int[][] arr2x = new int[n][m];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                arr2x[i][j] = sc.nextInt();
                if (arr2x[i][j] > maxel) maxel = arr2x[i][j];
            }
        }
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (arr2x[j][i] == maxel){
                    s = 1;
                }
            }
            if (s != 0){
                for (int k = 0; k < n; k++){
                    System.out.print(arr2x[k][i] + " ");
                }
                System.out.println();
            }
            s = 0;
        }
    }
}
