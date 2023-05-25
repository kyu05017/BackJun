package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/05/15
 * @Description: 프로그래머스 Lv01 92단게
 * @Ttitle :rny_string
 */

public class Step092 {
	public static void main(String[] args) {
		System.out.println(
				(
						((solution("masterpiece")))
				)
		);
	}
	public static String solution(String rny_string) {
		String answer = rny_string;
		if(rny_string.contains("m")){
			answer = rny_string.replace("m","rn");
		}
		return answer;
	}
}


