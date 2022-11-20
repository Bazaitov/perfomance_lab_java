import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int i = 1;
        System.out.println();
        for (; ; ) {
            System.out.print(i);
            i = 1 + (i + m - 2) % n;
            if (i == 1) {
                break;
            }
        }
        System.out.println();
    }
}