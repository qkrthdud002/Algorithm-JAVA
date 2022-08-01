package DataStructureBasic0801;

import java.util.Scanner;

public class ArraySumQ3 {
    static void sumOf(int[] a) {
        int sum = 0;
        for(int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수는 : ");
        int num = sc.nextInt();

        int[] x = new int[num];

        for(int i = 0; i < num; i++) {
            x[i] = sc.nextInt();
        }

        System.out.print("배열의 모든 요소의 합계 : ");
        sumOf(x);
    }
}
