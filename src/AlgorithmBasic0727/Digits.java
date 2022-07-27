package AlgorithmBasic0727;

import java.util.Scanner;

// 2자리의 양수(10~99)를 입력한다.
public class Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("2자리의 정수를 입력하세요.");

        do {
            System.out.print("입력 : ");
            num = sc.nextInt();
        } while(num < 10 || num > 99);

        System.out.println("변수 num의 값은 " + num + "가 되었습니다.");
    }
}
