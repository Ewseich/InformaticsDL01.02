import java.util.Scanner;
public class task1445 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt();
        if (x > 1) System.out.println((x-1) + " " + y);
        if (y > 1) System.out.println(x + " " + (y-1));
        if (x < m) System.out.println((x+1) + " " + y);
        if (y < n) System.out.println(x + " " + (y+1));



    }
}
