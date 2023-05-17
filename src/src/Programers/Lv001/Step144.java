package Programers.Lv001;

/**
 * @Author: kyu05017
 * @Date: 2023/05/17
 * @Description: 프로그래머스 Lv01 144단게
 * @Ttitle : 편지
 */

public class Step144 {
	public static void main(String[] args) {

		System.out.println(
				(solution("happy birthday!"))
		);
	}
	public static int solution(String m) {
		return m.length()*2;
	}
}


