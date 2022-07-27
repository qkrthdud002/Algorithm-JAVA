package AlgorithmBasic0727;

import java.util.Scanner;

public class SumQ7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.print("n : ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("1부터 n까지의 합 : " + sum);
    }
}
