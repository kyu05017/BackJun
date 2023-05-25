package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/04/30
 * @Description: 프로그래머스 Lv01 27단게
 * @Ttitle : 마지막 두 원소
 */

public class Step027 {
	public static void main(String[] args) {
		System.out.println(solution(new int[]{5, 2, 1, 7, 5}).toString());
	}

	public static int[] solution(int[] num_list) {
		int answer[] = new int[num_list.length + 1];
		int lastNum = num_list[num_list.length-1];
		int taskNum = num_list[num_list.length-2];

		if(lastNum > taskNum) {
			for(int i = 0; i < answer.length; i++) {
				if(i == answer.length -1){
					answer[i] = lastNum - taskNum;
				} else {
					answer[i] = num_list[i];
				}
			}
		} else {
			for(int i = 0; i < answer.length; i++) {
				if(i == answer.length -1){
					answer[i] = lastNum*2;
				} else {
					answer[i] = num_list[i];
				}
			}
		}

		return answer;
	}
}

