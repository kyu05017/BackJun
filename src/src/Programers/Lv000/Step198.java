package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/05/23
 * @Description: 프로그래머스 Lv01 198단게
 * @Ttitle : 양꼬치
 */

public class Step198 {
	public static void main(String[] args) {

		System.out.println(
				(solution(10,3))
		);
	}

	public static int solution(int n, int k) {
		int answer = 0;
		int nM = 12000;
		int dM = 2000;

		if(n == 0){
			answer = k*dM;
		} else if(k == 0){
			answer = n*nM;
		} else {
			int temp = n/10;
			if(temp != 0){
				k = k - temp;
				answer = (n*nM) + (k*dM);
			} else {
				answer = (n*nM) + (k*dM);
			}
		}
		return answer;
	}
} 