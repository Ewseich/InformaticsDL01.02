import java.util.Scanner;
public class task112371 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), min, flag, flag1, flag2 = 1;
        int[][] arr2x = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr2x[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                min = arr2x[i][j];
                flag1 = 1;
                for (int l = 0; l < m; l++) {
                    if (arr2x[i][l] < min) {
                        flag1 = 0;
                        break;
                    }
                }
                flag = 1;
                for (int k = 0; k < n; k++) {
                    if (arr2x[k][j] > min) {
                        flag = 0;
                        break;
                    }
                }
                if (flag == 1 && flag1 == 1) {
                    System.out.println((i+1) + " " + (j+1));
                    flag2 = 0;
                    System.out.println();
                }

            }
        }
        if (flag2 == 1) {
            System.out.println(0);
        }
    }

}