package Programers.Lv000;

import java.util.*;

/**
 * @Author: kyu05017
 * @Date: 2023/05/18
 * @Description: 프로그래머스 Lv01 160단게
 * @Ttitle : 등수 매기기
 */

public class Step160 {
	public static void main(String[] args) {

		System.out.println(
				Arrays.toString(solution(new int[][]{{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}}))
		);
	}
	public static int[] solution(int[][] score) {
		List<Integer> scoreList = new ArrayList<>();
		for(int[] t : score){
			scoreList.add(t[0] + t[1]);
		}
		// 내림차순 정렬
		scoreList.sort(Comparator.reverseOrder());
		
		int[] answer = new int[score.length];
		for(int i=0; i<score.length; i++){
			// 리스트에 indexOf 를 사용하면 그 해당 객체의 인덱스 번호를 반환한다
			answer[i] = scoreList.indexOf(score[i][0] + score[i][1])+1;
		}
		return answer;
	}
}


