package BackJun.Step004;

/**
 * @Author: kyu05017
 * @Date: 2023/04/25
 * @Description: 백준 단계별 연습문제 풀이 4단계 2번
 * @Ttitle : X보다 작은수
 */

import java.util.Scanner;

public class Practice002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = 0;
        for(int i = 0; i < a; i++) {
            c = sc.nextInt();

            if(c < b) {
                System.out.print(c+" ");
            }
        }

    }

}
