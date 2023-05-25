package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/05/17
 * @Description: 프로그래머스 Lv01 130단게
 * @Ttitle : 문자열 밀기
 */

public class Step130 {
	public static void main(String[] args) {

		System.out.println(
				(solution("hello","ohell"))
		);
	}
	public static int solution(String A, String B) {
		int answer = 0;
		String A2 = A;
		for(int i=0;i<A.length();i++){
			if(A2.equals(B)){
				return answer;
			}
			String last = A2.substring(A2.length()-1);
			A2 = last+A2.substring(0,A2.length()-1);
			answer++;
		}
		return -1;
	}
}


