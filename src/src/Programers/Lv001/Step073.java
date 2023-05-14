package Programers.Lv001;

import java.util.Arrays;

/**
 * @Author: kyu05017
 * @Date: 2023/05/14
 * @Description: 프로그래머스 Lv01 73단게
 * @Ttitle :조건에 맞게 수열 변환하기 2
 */

public class Step073 {
	public static void main(String[] args) {
		System.out.println(
				(
						(solution(new int[]{1, 2, 3, 100, 99, 98}))
				)
		);
	}
	public static int solution(int[] arr) {
		int k = 0;
		boolean task =  true;
		int[] temp = arr.clone();
		while (task) {
			for (int i = 0; i < temp.length; i++) {
				if (temp[i] >= 50 && temp[i] % 2 == 0) {
					temp[i] = temp[i] / 2;
				} else if (temp[i] < 50 && temp[i] % 2 != 0) {
					temp[i] = (temp[i] * 2) + 1;
				}
			}
			int tesknum = 0;
			for(int i = 0; i < temp.length; i++) {
				if(arr[i] == temp[i]) {
					tesknum++;
				}
			}
			if(tesknum == arr.length){
				return k;
			}
			arr = temp.clone();
			k++;
		}
		return k;
	}
}

