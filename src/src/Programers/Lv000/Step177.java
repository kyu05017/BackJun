package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/05/20
 * @Description: 프로그래머스 Lv01 177단게
 * @Ttitle : 숨어있는 숫자의 덧셈 (1)
 */

public class Step177 {
	public static void main(String[] args) {

		System.out.println(
				(solution("aAb1B2cC34oOp"))
		);
	}

	public static int solution(String a) {
		String result2 = a.replaceAll("[^0-9]","");
		char[] result = result2.toCharArray();
		int answer = 0;
		for(char temp : result){
			answer += (temp-'0');
		}
		return answer;
	}
}