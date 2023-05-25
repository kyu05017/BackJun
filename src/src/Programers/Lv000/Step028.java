package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/04/30
 * @Description: 프로그래머스 Lv01 28단게
 * @Ttitle : 수 조작하기 1
 */

public class Step028 {
	public static void main(String[] args) {
		System.out.println(solution(0,	"wsdawsdassw"));
	}

	public static int solution(int n, String control) {
		int answer = n;

		char[] conts = control.toCharArray();

		for(int i=0; i<conts.length; i++) {
			if(conts[i] == 'w' || conts[i] == 'W') {
				answer += 1;
			} else if(conts[i] == 's'  || conts[i] == 'S') {
				answer -= 1;
			} else if(conts[i] == 'd'  || conts[i] == 'D') {
				answer += 10;
			} else if(conts[i] == 'a'  || conts[i] == 'A') {
				answer -= 10;
			}
		}
		return answer;
	}
}

