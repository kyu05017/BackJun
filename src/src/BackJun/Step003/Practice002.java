package BackJun.Step003;

/**
 * @Author: kyu05017
 * @Date: 2023/04/25
 * @Description: 백준 단계별 연습문제 풀이 3단계 2번
 * @Ttitle : A+b_3
 */

import java.util.Scanner;

public class Practice002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstNum = sc.nextInt();

        // 각 입력된 케이스 횟수 마다 결과 값을 출력!!!!

        for(int i = 0; i < firstNum; i++) {
            int secondNum = sc.nextInt();
            int thirdNum = sc.nextInt();

            System.out.println(secondNum + thirdNum);
        }
    }
}
