package Programers.Lv001;

/**
 * @Author: kyu05017
 * @Date: 2023/05/17
 * @Description: 프로그래머스 Lv01 151단게
 * @Ttitle : 369게임
 */

public class Step151 {
	public static void main(String[] args) {

		System.out.println(
				(solution(29423))
		);
	}
	public static int solution(int order) {
		int answer = 0;
		char[] tesk = String.valueOf(order).toCharArray();
		for(int i=0; i<tesk.length;i++){
			if(tesk[i]=='3' || tesk[i]=='6' || tesk[i]=='9'){
				answer++;
			}
		}
		return answer;
	}
}


