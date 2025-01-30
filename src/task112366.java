import java.util.Scanner;
public class task112366 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), indmax1 = 0, indmax2 = 0, indmin1 = 0, indmin2 = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        int[][] arr2x = new int[n][m];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                arr2x[i][j] = sc.nextInt();
                if (arr2x[i][j] > max) {
                    max = arr2x[i][j];
                    indmax1 = i;
                    indmax2 = j;
                }
                if (arr2x[i][j] < min) {
                    min = arr2x[i][j];
                    indmin1 = i;
                    indmin2 = j;
                }
            }
        }
        System.out.println((indmin1+1) + " " + (indmin2+1) + " " + min);
        System.out.println((indmax1+1) + " " + (indmax2+1) + " " + max);

    }
}