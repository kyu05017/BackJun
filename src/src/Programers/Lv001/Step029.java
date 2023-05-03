package Programers.Lv001;

/**
 * @Author: kyu05017
 * @Date: 2023/04/30
 * @Description: 프로그래머스 Lv01 29단게
 * @Ttitle : 수 조작하기 2
 */

public class Step029 {
	public static void main(String[] args) {
		System.out.println(solution(new int[]{0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1}));
	}

	public static String solution(int[] numLog) {
		String answer = "";
		int temp = 0;
		for(int i = 0; i < numLog.length; i++) {
			if(i + 2 > numLog.length){
				break;
			} else {
				temp = numLog[i] - numLog[i + 1];
				if(temp == -1) {
					answer += "w";
				} else if(temp == 1) {
					answer += "s";
				} else if(temp == -10) {
					answer += "d";
				} else if(temp == 10) {
					answer += "a";
				}
			}

		}

		return answer;
	}
}

