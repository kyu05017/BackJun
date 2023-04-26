package BackJun.Step003;

/**
 * @Author: kyu05017
 * @Date: 2023/04/25
 * @Description: 백준 단계별 연습문제 풀이 3단계 4번
 * @Ttitle : 영수증
 */

import java.util.Scanner;

public class Practice004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        String result = "";
        for(int i = 0; i < b; i++) {
            int c = sc.nextInt();
            int d = sc.nextInt();
            sum += c*d;
        }
        result = (sum == a)?"Yes":"No";
        System.out.println(result);
    }
}
