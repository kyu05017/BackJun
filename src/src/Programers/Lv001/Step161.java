package Programers.Lv001;

import java.util.*;
/**
 * @Author: kyu05017
 * @Date: 2023/05/18
 * @Description: 프로그래머스 Lv01 161단게
 * @Ttitle : 문제 설명
 */

public class Step161 {
	public static void main(String[] args) {

		System.out.println(
				Arrays.toString(solution(new int[]{1, 2, 3, 4, 5, 6},4))
		);
	}
	public static int[] solution(int[] numlist, int n) {
		int[] answer = new int[numlist.length];
		double[] tesk = new double[numlist.length];
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < numlist.length; i++){
			if(numlist[i] - n < 0){
				tesk[i] = Math.abs((numlist[i] - n)-0.5);
			} else {
				tesk[i] = (numlist[i] - n);
			}
		}
		Arrays.sort(tesk);
		for(int i = 0;i <answer.length;i++){
			if(tesk[i] % 1 != 0) {
				answer[i] = n - (int)tesk[i];
			} else {
				answer[i] = (int)tesk[i] + n;
			}
		}
		return answer;
	}
}


