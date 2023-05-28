package Programers.Lv001;

import java.util.*;

/**
 * @Author: kyu05017
 * @Date: 2023/05/25
 * @Description: 프로그래머스 Lv1 1단게
 * @Ttitle : 달리기 경주
 */


public class Setp001 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution2(new String[]{"mumu", "soe", "poe", "kai", "mine"},new String[]{"kai", "kai", "mine", "mine"})));
	}

	public static String[] solution1(String[] players, String[] callings) {
		// 해당 풀이는 시간초과
		String[] answer = new String[players.length];
		System.arraycopy(players, 0, answer, 0, answer.length);

		for(int i = 0; i < callings.length; i++) {
			for(int j = 0; j < players.length; j++) {
				if(callings[i].equals(answer[j])) {
					String temp = answer[j - 1];
					answer[j - 1] = answer[j];
					answer[j] = temp;
				}
			}
		}
		// 해당 풀이는 시간초과
		return answer;
	}

	public static String[] solution2(String[] players, String[] callings){
		Map<String, Integer> playersMap = new HashMap<>();
		for(int i=0; i<players.length; i++) playersMap.put(players[i], (i+1));

		for(int i=0; i<callings.length; i++) {
			String temp = "";
			temp = players[playersMap.get(callings[i])-2];
			players[playersMap.get(callings[i])-2] = players[playersMap.get(callings[i])-1];
			players[playersMap.get(callings[i])-1] = temp;

			playersMap.put(callings[i], playersMap.get(callings[i])-1);
			playersMap.put(temp, playersMap.get(temp)+1);

		}
		return players;
	}
}
