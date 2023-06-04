package Programers.Lv001;

/**
 * @Author: kyu05017
 * @Date: 2023/06/04
 * @Description: 프로그래머스 Lv1 42단계
 * @Ttitle : 숫자 문자열과 영단어
 */

public class Setp042 {
	public static void main(String[] args) {
		System.out.println(
				(
						solution("one4seveneight")
				)
		);
	}

	public static long solution(String s) {
		String[] nums = {"zero","one","two","three","four","five","six","seven","eight","nine"};

		String temp = s;
		for(int i = 0; i < nums.length; i++) {
			if(temp.indexOf(nums[i]) != -1){
				temp = temp.replace(nums[i],String.valueOf(i));
				System.out.println(temp);
			}
		}
		return Long.parseLong(temp);
	}
}
