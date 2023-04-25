package Step004;

/**
 * @Author: kyu05017
 * @Date: 2023/04/25
 * @Description: 백준 단계별 연습문제 풀이 4단계 1번
 * @Ttitle : 개수 세기
 */

import java.util.Scanner;

public class Practice001_IntVer {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int result = 0;
       int length = sc.nextInt();
       int[] box = new int[length];
       for(int i = 0; i < length; i++) {
           int num = sc.nextInt();
           box[i] = num;
       }
       int select = sc.nextInt();

       for(int i = 0; i < length; i++) {
           if(box[i] == select) {
               result++;
           }
       }

        System.out.println(result);
    }

}
