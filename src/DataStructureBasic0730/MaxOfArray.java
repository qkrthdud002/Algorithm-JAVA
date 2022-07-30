package DataStructureBasic0730;

import java.util.Scanner;

public class MaxOfArray {
    // 배열 a의 최댓값을 구하여 반환한다.
    static int maxOf(int[] a) {
        int max = a[0];
        for(int i = 0; i < a.length; i++) {
            if(a[i] > max)
                max = a[i];
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("키의 최댓값을 구합니다.");
        System.out.print("사람 수 : ");
        int num = sc.nextInt();

        int[] height = new int[num]; // 요솟수가 num인 배열을 생성

        for(int i = 0; i < num; i++) {
            System.out.print("height[" + i + "] : ");
            height[i] = sc.nextInt();
        }

        System.out.println("최댓값은 " + maxOf(height) + "입니다.");
    }
}
