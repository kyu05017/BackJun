package Programers.Lv001;

import java.util.Arrays;

/**
 * @Author: kyu05017
 * @Date: 2023/05/25
 * @Description: 프로그래머스 Lv1 1단게
 * @Ttitle : 달리기 경주
 */


public class Setp001 {
	public static String[] solution(String[] players, String[] callings) {

		String[] answer = new String[players.length];
		System.arraycopy(players, 0, answer, 0, answer.length);
		System.out.println(Arrays.toString(answer));
		for(int i = 0; i < callings.length; i++) {
			for(int j = 0; j < players.length; j++) {

			}
		}
		return answer;
	}
}
