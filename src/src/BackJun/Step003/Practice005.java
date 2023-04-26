package BackJun.Step003;

/**
 * @Author: kyu05017
 * @Date: 2023/04/25
 * @Description: 백준 단계별 연습문제 풀이 3단계 5번
 * @Ttitle : 코딩은 체육과목 입니다
 */

import java.util.Scanner;

public class Practice005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String result = "";

        for (int i = 1; i <= a / 4; i++) {
            result += "long ";
        }

        System.out.println(result+"int");
    }
}
