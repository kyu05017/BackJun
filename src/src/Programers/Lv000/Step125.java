package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/05/16
 * @Description: 프로그래머스 Lv01 125단게
 * @Ttitle : 옹알이
 */

public class Step125 {
	public static void main(String[] args) {

		System.out.println(
				(solution(new String[]{"ayaye", "uuuma", "ye", "yemawoo", "ayaa"}))
		);
	}
	public static int solution(String[] babbling) {
		int answer = 0;
		for(String tmp : babbling){
			if(tester(tmp)){
				answer ++;
			}
		}
		return answer;
	}
	private static boolean tester(String str) {
		String[] words = {"aya", "ye", "woo", "ma"};
		for (String word : words) {
			str = str.replace(word, "-");
		}
		boolean flag = true;
		char[] tmp = str.toCharArray();
		for(char temp : tmp) {
			if(temp != '-') {
				flag = false;
				break;
			}
		}
		return flag;
	}
}


