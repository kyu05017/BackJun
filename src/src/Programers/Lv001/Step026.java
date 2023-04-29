package Programers.Lv001;

/**
 * @Author: kyu05017
 * @Date: 2023/04/30
 * @Description: 프로그래머스 Lv01 26단게
 * @Ttitle : 이어 붙인 수
 */

public class Step026 {
	public static void main(String[] args) {
		System.out.println(solution(new int[]{3, 4, 5, 2, 1}));
	}

	public static int solution(int[] num_list) {
		int answer = 0;
		String even = "";
		String odd = "";

		for(int i = 0; i < num_list.length; i++) {
			if(num_list[i] % 2 == 0) {
				even += num_list[i] + " ";
			} else {
				odd += num_list[i] + "";
			}
		}

		answer = Integer.parseInt(even) + Integer.parseInt(odd);
		return answer;
	}
}

