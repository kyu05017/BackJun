package BackJun.Step004;

import java.util.Scanner;

/**
 * @Author: kyu05017
 * @Date: 2023/04/25
 * @Description: 백준 단계별 연습문제 풀이 4단계 5번
 * @Ttitle : 공넣기
 */

public class Practice005 {

	public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
	    int n = sc.nextInt();
		int[] arr = new int[n];

		int m = sc.nextInt();

		for(int i = 0; i < m; i++) {
           int j = sc.nextInt();
		   int k = sc.nextInt();
		   int l = sc.nextInt();

		   for(int s = j -1; s < k; s++) {
			   arr[s] = l;
		   }
        }
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
    }
}
