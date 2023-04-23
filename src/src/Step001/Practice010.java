package Step001;

import java.util.Scanner;

/**
 * @Author: kyu05017
 * @Date: 2023/04/23
 * @Description: 백준 단계별 연습문제 풀이 10번
 * @Ttitle : 곱셈
 */

public class Practice010 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int b_a = b/100;
        int b_b = (b%100)/10;
        int b_c = b%10;

        System.out.println(a*b_c);
        System.out.println(a*b_b);
        System.out.println(a*b_a);
        System.out.println(a*b);
    }
}
