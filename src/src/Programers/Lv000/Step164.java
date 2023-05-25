package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/05/19
 * @Description: 프로그래머스 Lv01 164단게
 * @Ttitle : 평행
 */

public class Step164 {
	public static void main(String[] args) {

		System.out.println(
				(solution(new int[][]{{3, 5}, {4, 1}, {2, 4}, {5, 10}}))
		);
	}

	public static int solution(int[][] a) {
		int answer = 0;
		if (maker(a[0], a[1]) == maker(a[2], a[3])) {
			return 1;
		}
		if (maker(a[0], a[2]) == maker(a[1], a[3])) {
			return 1;
		}
		if (maker(a[0], a[3]) == maker(a[1], a[2])) {
			return 1;
		}
		return answer;
	}

	public static double maker(int[] a, int[] b) {
		return (double) (a[1] - b[1]) / (a[0] - b[0]);
	}
}


