package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/04/29
 * @Description: 프로그래머스 Lv01 14단게
 * @Ttitle : 더크게 합치기
 */

public class Step014 {
	public static void main(String[] args) {

		solution(9,91);
	}

	public static int solution(int a, int b) {
		int answer = 0;

		String temp =  String.valueOf(a)+String.valueOf(b);
		int tempToNum = Integer.parseInt(temp);
		String temp2 = String.valueOf(b)+String.valueOf(a);
		int tempToNum2 = Integer.parseInt(temp2);

		if(tempToNum == tempToNum2) {
			answer = tempToNum;
		} else if(tempToNum > tempToNum2) {
			answer = tempToNum;
		}else {
			answer = tempToNum2;
		}
		return answer;
	}
}

