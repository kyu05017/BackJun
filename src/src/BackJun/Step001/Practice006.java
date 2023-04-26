package BackJun.Step001;

import java.util.Scanner;

/**
 * @Author: kyu05017
 * @Date: 2023/04/23
 * @Description: 백준 단계별 연습문제 풀이 6번
 * @Ttitle : 사칙연산
 */

public class Practice006 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();

        System.out.println(firstNum+secondNum);
        System.out.println(firstNum-secondNum);
        System.out.println(firstNum*secondNum);
        System.out.println(firstNum/secondNum);
        System.out.println(firstNum%secondNum);
    }
}
