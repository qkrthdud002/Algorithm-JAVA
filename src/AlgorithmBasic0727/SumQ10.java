package AlgorithmBasic0727;

import java.util.Scanner;

public class SumQ10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.print("a의 값 : ");
        a = sc.nextInt();

        do {
            System.out.print("b의 값 : ");
            b = sc.nextInt();

//            if (b < a) {
//                System.out.println("a보다 큰 값을 입력하세요!");
//            }
        } while (b < a);

        int result = 0;
        int temp;
        temp = a;
        a = b;
        b = temp;

        result = (a - b);
        System.out.println("b = a는 " + result + "입니다.");

    }
}
