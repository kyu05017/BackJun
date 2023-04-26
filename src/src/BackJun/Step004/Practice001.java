package BackJun.Step004;

/**
 * @Author: kyu05017
 * @Date: 2023/04/25
 * @Description: 백준 단계별 연습문제 풀이 4단계 1번
 * @Ttitle : 개수 세기
 */

import java.util.Scanner;

public class Practice001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int length = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        int select = sc.nextInt();
        String[] strArray = str.split(" ");
        for(int i = 0; i < length; i++) {
            if(strArray[i].equals(select + "")) {
                result++;
            }
        }
        System.out.println(result);
    }

}
