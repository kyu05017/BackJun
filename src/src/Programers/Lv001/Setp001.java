package Programers.Lv001;

import java.util.Arrays;

/**
 * @Author: kyu05017
 * @Date: 2023/05/25
 * @Description: 프로그래머스 Lv1 1단게
 * @Ttitle : 달리기 경주
 */


public class Setp001 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new String[]{"mumu", "soe", "poe", "kai", "mine"},new String[]{"kai", "kai", "mine", "mine"})));
	}

	public static String[] solution(String[] players, String[] callings) {
		// 해당 풀이는 시간초과
		String[] answer = new String[players.length];
		System.arraycopy(players, 0, answer, 0, answer.length);

		for(int i = 0; i < callings.length; i++) {
			for(int j = 0; j < players.length; j++) {
				if(callings[i].equals(answer[j])) {
					String temp = answer[j - 1];
					answer[j - 1] = answer[j];
					answer[j] = temp;
				}else {
					continue;
				}
			}
		}
		// 해당 풀이는 시간초과
		return answer;
	}
}
