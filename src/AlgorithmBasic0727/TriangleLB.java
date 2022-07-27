package AlgorithmBasic0727;

import java.util.Scanner;

// 왼쪽 아래가 직각인 이등변 삼각형 출력.
public class TriangleLB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.");

        do {
            System.out.print("몇 단 삼각형입니까? : ");
            num = sc.nextInt();
        } while(num <= 0);

        for(int i = 1; i <= num; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

    }
}
