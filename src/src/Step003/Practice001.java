package Step003;

/**
 * @Author: kyu05017
 * @Date: 2023/04/25
 * @Description: 백준 단계별 연습문제 풀이 3단계 1번
 * @Ttitle : 구구단
 */

import java.util.Scanner;
public class Practice001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstNum = sc.nextInt();

        for(int i = 1; i <= 9; i++) {
            System.out.println(firstNum+" * "+i+" = "+(firstNum*i));
        }
    }
}
