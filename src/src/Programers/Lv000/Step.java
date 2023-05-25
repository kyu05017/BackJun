package Programers.Lv000;

import java.text.DecimalFormat;

/**
 * @Author: kyu05017
 * @Date: 2023/05/01
 * @Description: 프로그래머스 Lv01 34단게
 * @Ttitle : 배열 만들기 2
 */

public class Step {

	public static void main(String[] args) {
		// 판매가 , 수수료 , 제작비 넣으면 자동으로 판매원가 만들어줘용
		int result = solution(12000 , 45 , 5000);
		DecimalFormat decFormat = new DecimalFormat("###,###원");
		String str = decFormat.format(result);
		System.out.println(str);
	}

	public static int solution(int l, int pers, int mad) {
		int temp = (l / 100) * pers;

		int answer = 0;

		answer = l -(temp+mad);

		return answer;
	}
}


