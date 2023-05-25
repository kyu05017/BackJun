package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/05/20
 * @Description: 프로그래머스 Lv01 175단게
 * @Ttitle : 컨트롤 제트
 */

public class Step175 {
	public static void main(String[] args) {

		System.out.println(
				(solution("1 2 Z 3"))
		);
	}

	public static int solution(String s) {
		String[] a = s.split(" ");
		int answer = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i].equals("Z")){
				answer -= Integer.parseInt(a[i-1]);
			} else {
				answer += Integer.parseInt(a[i]);
			}
		}
		return answer;
	}
}