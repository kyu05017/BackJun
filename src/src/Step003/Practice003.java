package Step003;

/**
 * @Author: kyu05017
 * @Date: 2023/04/25
 * @Description: 백준 단계별 연습문제 풀이 3단계 3번
 * @Ttitle : 합
 */

import java.util.Scanner;

public class Practice003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstNum = sc.nextInt();
        int sum = 0;
        // 반복횟수마다 증가되는 수를 더한다
        for(int i = 1; i <= firstNum; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
