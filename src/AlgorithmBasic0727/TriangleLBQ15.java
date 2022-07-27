package AlgorithmBasic0727;

import java.util.Scanner;

public class TriangleLBQ15 {
    static void triangleLB(int n) {
        for(int i = 0; i <= n; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    static void triangleLU(int n) {
//        for(int i = 1; i <= n; i++) {
//            for(int j = 1; j > n - i + 1; j++) {
//                System.out.print('*');
//            }
//            System.out.println();
//        }
        for (int i = 1; i <= n; i++) { 				// i행 (i = 1, 2, … ,n)
            for (int j = 1; j <= n - i + 1; j++) 	// n-i+1개의 '*'를 나타냄
                System.out.print('*');
            System.out.println(); 					// 개행(줄변환)
        }
    }

    static void triangleRU(int n) {
        for(int i = 1; i <= n; i++) {
            for(int k = 1; k < i; k++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleRB(int n) {
        for(int i = 1; i <= n; i++) {
            for(int k = 1; k < n - i + 1; k++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("수 입력 : ");
            n = sc.nextInt();
        } while(n <= 0);

        System.out.println("왼쪽 아래가 직각인 이등변 삼각형\n");
        triangleLB(n);
        System.out.println("왼쪽 위가 직각인 이등변 삼각형\n");
        triangleLU(n);
        System.out.println("오른족 위가 직각인 이등변 삼각형\n");
        triangleRU(n);
        System.out.println("오른쪽 아래가 직각인 이등변 삼각형\n");
        triangleRB(n);

    }
}
