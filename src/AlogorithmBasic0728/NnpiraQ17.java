package AlogorithmBasic0728;

import java.util.Scanner;

public class NnpiraQ17 {
    static void npira(int n) {
        int num = 1;
        for(int i = 1; i <= n; i++) {
            for(int a = 1; a <= n - i + 1; a++) {
                System.out.print(' ');
            }
            for(int j = 1; j <= (i-1)*2+1; j++) {
                System.out.print(i % 10); // num
            }
//            num++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("단 입력 : ");
            n = sc.nextInt();
        } while(n <= 0);

        npira(n);
    }
}
