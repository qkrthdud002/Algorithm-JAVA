package DataStructureBasic0806;

// 1000 이하의 소수를 열거
public class PrimeNumber3 {
    public static void main(String[] args) {
        int counter = 0;                // 곱셈과 나눗셈의횟수
        int ptr = 0;                    // 잦은 소수의 개수
        int[] prime = new int[500];     // 소수를 저장하는 배열

        prime[ptr++] = 2;   // 2는 소수
        prime[ptr++] = 3;   // 3은 소수

        for(int n = 5; n <= 1000; n+=2) {   // 대상은 홀수만
            boolean flag = false;
            for(int i = 1; prime[i] * prime[i] <= n; i++) {     // 나누어 떨어지면 소수가 아님
                counter += 2;
                if(n % prime[i] == 0) {
                    flag = true;
                    break;  // 더 이상의 반복은 불 필요
                }
            }
            if(!flag) {     // 마지막까지 나누어떨어지지 않음
                prime[ptr++] = n;   // 소수라고 배열에 저장
                counter++;
            }
        }

        for(int i = 0; i < ptr; i++)    // 찾은 ptr개의 소수를 출력
            System.out.println(prime[i]);

        System.out.println("곱셈과 나눗셈을 수행한 횟수 : " + counter);
    }
}
