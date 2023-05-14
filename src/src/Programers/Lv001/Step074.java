package Programers.Lv001;

import java.util.Arrays;

/**
 * @Author: kyu05017
 * @Date: 2023/05/14
 * @Description: 프로그래머스 Lv01 74단게
 * @Ttitle :1로 만들기
 */

public class Step074 {
	public static void main(String[] args) {
		System.out.println(
				(
						(solution(new int[]{12, 4, 15, 1, 14}))
				)
		);
	}
	public static int solution(int[] num_list) {
		boolean flag = true;
		int answer = 0;

		while(flag) {
			int task = 0;
			for(int i = 0; i < num_list.length; i++) {
				if(num_list[i] == 1){
					continue;
				}
				if(num_list[i]%2==0) {
					num_list[i] = num_list[i]/2;
					answer++;
				}else {
					num_list[i] = (num_list[i]-1)/2;
					answer++;
				}
			}

			for(int i = 0; i < num_list.length; i++) {
				if(num_list[i] == 1) {
					task++;
				}
			}

			if(task == num_list.length){
				flag = false;
			}

		}
		// 스트림
		// num_list의 내용물을 1개씩 꺼내서 바이너리 스트링으로 만들고 길이 - 1이 1이 될때까지 나눈 횟수.
		int result = Arrays.stream(num_list).map(i -> Integer.toBinaryString(i).length() - 1).sum();
		int result2 = Arrays.stream(num_list).map(i -> Integer.toBinaryString(i).length() -1).sum();
		return answer;
	}
}

