package AlogorithmBasic0728;

import java.util.Scanner;

public class SpiraQ16 {
    static void spira(int n) {
        for (int i = 1; i <= n; i++) {
            for(int a = 1; a < n - i + 1; a++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= (i-1)*2+1; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("단 입력 : ");
            n = sc.nextInt();
        } while (n <= 0);

        spira(n);

    }
}
