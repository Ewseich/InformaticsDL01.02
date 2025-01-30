import java.util.Scanner;
public class task112365 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), count = 0, s = 0, razr = 0;
        int[][] arr2x = new int[n][m];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                arr2x[i][j] = sc.nextInt();
            }
        }
        int r = sc.nextInt(), k = sc.nextInt();
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                while (arr2x[i][j] > 0){
                    s += arr2x[i][j] % 10;
                    arr2x[i][j] /= 10;
                    razr++;
                }
                if (s % k == 0 && razr == r){
                    count++;
                }
                s = 0;
                razr = 0;
            }
        }
        System.out.println(count);
    }
}
