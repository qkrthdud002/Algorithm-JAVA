package Search0913;

import java.util.Scanner;

public class SeqSearchEx {

    static int seqSearchEx(int[] a, int n, int key) {
        // 배열 a의 앞쪽 n개 요소에서 key와 같은 요소를 선형 검색 (보초법)
        System.out.print("   |");
        for(int k = 0; k < n; k++)
            System.out.printf("%4d", k);
        System.out.println();

        System.out.print("---+");
        for(int k = 0; k < 4 * n + 2; k++)
            System.out.print("-");
        System.out.println();

        for(int i = 0; i < n; i++) {
            System.out.print("   |");
            System.out.printf(String.format("%%%ds*\n", (i * 4) + 3), "");
            System.out.printf("%3d|", i);
            for(int k = 0; k < n; k++)
                System.out.printf("%4d", a[k]);
            System.out.println("\n   |");
            if(a[i] == key)
                return i; // 검색 성공
        }
        return -1; // 검색 실패
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = sc.nextInt();
        int[] x = new int[new]; // 요솟수 num인 배열

        for()
    }

}
