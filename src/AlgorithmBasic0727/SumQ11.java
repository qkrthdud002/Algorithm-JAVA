package AlgorithmBasic0727;

import java.util.Scanner;

public class SumQ11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        do {
            System.out.print("수를 입력하세요 : ");
            num = sc.nextInt();
        } while(num <= 0);

        int a = 0;
        while(num > 0) {
            num /= 10;
            a++;
        }

        System.out.println("그 수는 " + a + "자리입니다.");
    }
}
