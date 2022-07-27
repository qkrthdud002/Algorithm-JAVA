package AlgorithmBasic0727;

import java.util.Scanner;

public class SumQ8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("n의 값을 입력하세요 : ");
        int n = sc.nextInt();

        int sum = 0;

        sum = ((1 + n) * (n / 2));

        if(n%2 != 0) {
             sum += (n + 1) / 2;
        }

        System.out.println("1부터 " + n + "까지의 합 : " + sum);
    }
}
