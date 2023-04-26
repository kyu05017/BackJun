package BackJun.Step004;

/**
 * @Author: kyu05017
 * @Date: 2023/04/25
 * @Description: 백준 단계별 연습문제 풀이 4단계 1번
 * @Ttitle : 개수 세기
 */

import java.util.Scanner;

public class Practice003_Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            int target = sc.nextInt();
            arr[i] = target;
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }

            if(min > arr[i]) {
                min = arr[i];
            }
        }

        System.out.println(min + " " + max);
    }

}
