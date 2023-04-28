package BackJun.Step004;

/**
 * @Author: kyu05017
 * @Date: 2023/04/25
 * @Description: 백준 단계별 연습문제 풀이 4단계 4번
 * @Ttitle : 최대값
 */

import java.util.Scanner;

public class Practice004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int max = arr[0];
        int cnt = 0;

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] > max) {
                max = arr[i];
                cnt = i + 1;
            }
        }
        System.out.println(max + " " + cnt);
    }

}
