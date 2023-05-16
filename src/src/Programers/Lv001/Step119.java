package Programers.Lv001;

/**
 * @Author: kyu05017
 * @Date: 2023/05/16
 * @Description: 프로그래머스 Lv01 119단게
 * @Ttitle :l로 만들기
 */

public class Step119 {
	public static void main(String[] args) {

		System.out.println(
				(solution("abcdevwxyz"))
		);
	}
	public static String solution(String myString) {
		String answer = "";
		char[] arr = myString.toCharArray();
		for(int i=0;i<arr.length;i++){
			if(arr[i]<'l'){
				answer += "l";
			}else{
				answer += arr[i];
			}
		}
		return answer;
	}
}


