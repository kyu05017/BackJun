package BackJun.Step004;
/**
 * @Author: kyu05017
 * @Date: 2023/04/25
 * @Description: 백준 단계별 연습문제 풀이 4단계 6번
 * @Ttitle : 공바꾸기
 */

import java.util.Scanner;
public class Practice006 {

	public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
	    int n = sc.nextInt();
		int[] arr = new int[n];

		int m = sc.nextInt();
		int temp1 = 0;
		int temp2 = 0;

		for(int i = 0; i < n; i++) {
			arr[i] = i+1;
		}
		for(int i = 0; i < m; i++) {
            int j = sc.nextInt();
		    int k = sc.nextInt();

			temp1 = arr[j-1];
			temp2 = arr[k-1];

			arr[k-1] = temp1;
			arr[j-1] = temp2;
        }

		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
	    }
    }
}
