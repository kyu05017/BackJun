package Programers.Lv000;


/**
 * @Author: kyu05017
 * @Date: 2023/05/10
 * @Description: 프로그래머스 Lv01 54단게
 * @Ttitle : 배열만들기1
 *
 */
import java.util.*;
public class Step054 {

	public static void main(String[] args) {
		System.out.println(solution(10,3));
	}
	public static int[] solution(int n, int k) {
		int[] answer = {};
		List<Integer> list = new ArrayList<Integer>();

		for(int i = 1; i <=n ; i++){
			if(i%k == 0){
				list.add(i);
			}
		}

		answer = new int[list.size()];

		for(int i = 0; i < list.size(); i++){
			answer[i] = list.get(i);
		}
		Arrays.sort(answer);
		return answer;
	}
}

