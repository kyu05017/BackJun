package Programers.Lv001;

/**
 * @Author: kyu05017
 * @Date: 2023/05/19
 * @Description: 프로그래머스 Lv01 166단게
 * @Ttitle : 외계어 사전
 */

public class Step166 {
	public static void main(String[] args) {

		System.out.println(
				(solution(new String[]{"p", "o", "s"}, new String[]{"sod", "eocd", "qixm", "adio", "soo"}))
		);
	}

	public static int solution(String[] spell, String[] dic) {
		int answer = 2;
		int test = spell.length;
		int tmp = 0;
		for (int i = 0; i < dic.length; i++) {
			for (int j = 0; j < spell.length; j++) {
				if (dic[i].indexOf(spell[j]) != -1) {
					tmp++;
				}
			}
			if (tmp >= test) {
				return 1;
			}
			tmp = 0;
		}
		return answer;
	}
}

