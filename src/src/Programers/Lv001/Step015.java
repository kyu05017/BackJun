package Programers.Lv001;

/**
 * @Author: kyu05017
 * @Date: 2023/04/29
 * @Description: 프로그래머스 Lv01 15단게
 * @Ttitle : 두 순의 연산값 비교하기
 */

public class Step015 {
	public static void main(String[] args) {

		solution(91,2);
	}

	public static int solution(int a, int b) {
		int answer = 0;

		String temp =  String.valueOf(a)+String.valueOf(b);
		int tempToNum = Integer.parseInt(temp);
		int tempToNum2 = 2*a*b;

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

