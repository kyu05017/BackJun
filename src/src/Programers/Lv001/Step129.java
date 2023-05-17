package Programers.Lv001;

/**
 * @Author: kyu05017
 * @Date: 2023/05/17
 * @Description: 프로그래머스 Lv01 129단게
 * @Ttitle : 종이 자르기
 */

public class Step129 {
	public static void main(String[] args) {

		System.out.println(
				(solution(3, 12))
		);
	}
	public static int solution(int M, int N) {
		return M*N-1;
	}
}


