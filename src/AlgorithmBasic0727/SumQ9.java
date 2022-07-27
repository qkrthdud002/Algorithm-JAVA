package AlgorithmBasic0727;

import java.util.Scanner;

public class SumQ9 {
    static int sumof(int a, int b) {
        int max, min;

        if(a < b) {
            min = a;
            max = b;
        } else {
            min = b;
            max = a;
        }
        int sum = 0;
        for(int i = min; i <= max; i++)
            sum += i;
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("a의 값 : ");
        int a = sc.nextInt();
        System.out.print("b의 값 : ");
        int b = sc.nextInt();

        System.out.println(sumof(a, b));
    }
}
