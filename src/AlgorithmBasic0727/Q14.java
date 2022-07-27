package AlgorithmBasic0727;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("사각형을 출력합니다.");
        int num;
        System.out.print("단 수 : ");
        num = sc.nextInt();

        for(int i = 0; i < num; i++) {
            for(int j = 0; j < num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
