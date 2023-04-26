package BackJun.Step003;

/**
 * @Author: kyu05017
 * @Date: 2023/04/25
 * @Description: 백준 단계별 연습문제 풀이 3단계 11번
 * @Ttitle : A+B_5
 */

import java.util.Scanner;

public class Practice011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        boolean flag = true;
        while (flag) {
            int firstNum = sc.nextInt();
            int secondNum = sc.nextInt();

            if(firstNum != 0 && secondNum != 0) {
                System.out.println(firstNum + secondNum);
            } else {
                flag = false;
            }
        }
    }
}
