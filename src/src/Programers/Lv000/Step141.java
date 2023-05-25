package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/05/17
 * @Description: 프로그래머스 Lv01 141단게
 * @Ttitle : 배열의 유사도
 */

public class Step141 {
	public static void main(String[] args) {

		System.out.println(
				(solution(new String[]{"com", "b", "d", "p", "c"},new String[]{"a", "b", "c"}))
		);
	}
	public static int solution(String[] s1, String[] s2) {
		int answer = 0;
		for(String a:s1){
			for(String b:s2){
				if(a.equals(b)){
					answer++;
				}
			}
		}
		return answer;
	}
}


