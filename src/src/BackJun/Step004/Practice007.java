package BackJun.Step004;
/**
 * @Author: kyu05017
 * @Date: 2023/04/25
 * @Description: 백준 단계별 연습문제 풀이 4단계 7번
 * @Ttitle : 과제 안내신 분
 */

import java.util.Scanner;

public class Practice007 {

	public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
		//int[] arr = {1,0,3,4,5,6,7,0,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};///new int[30];
	    int [] arr = new int[30];

	    for(int i = 0; i < 28; i++) {
			int num = sc.nextInt();
			arr[num-1] = num;
	    }

		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 0) {
				System.out.println(i+1);
			}
		}
    }
}
