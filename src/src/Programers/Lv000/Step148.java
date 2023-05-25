package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/05/17
 * @Description: 프로그래머스 Lv01 148단게
 * @Ttitle : 영어가 싫어요
 */

public class Step148 {
	public static void main(String[] args) {

		System.out.println(
				(solution("onetwothreefourfivesixseveneightnine"))
		);
	}
	public static long solution(String numbers) {
		String[] nums = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		String temp = numbers;
		for(int i = 0; i < nums.length;i++){
			numbers = temp.replace(nums[i],String.valueOf(i));
			temp = numbers;
		}
		long answer = Long.parseLong(temp);
		return answer;
	}
}


