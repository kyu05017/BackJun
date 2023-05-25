package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/05/15
 * @Description: 프로그래머스 Lv01 91단게
 * @Ttitle :문자열 바꿔서 찾기
 */

public class Step091 {
	public static void main(String[] args) {
		System.out.println(
				(
						((solution("ABBAA","AABB")))
				)
		);
	}
	public static int solution(String myString, String pat) {
		String task = "";
		String[] arr = myString.split("");

		for(int i = 0; i < arr.length; i++) {
			if(arr[i].equals("A")){
				arr[i] = "B";
			} else {
				arr[i] = "A";
			}
			task += arr[i];
		}
		return task.contains(pat) ? 1 : 0;
	}
}


