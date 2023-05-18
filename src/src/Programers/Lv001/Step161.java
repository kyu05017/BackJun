package Programers.Lv001;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

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
		List<Integer> list = new ArrayList<Integer>();
		int[] answer = new int[numlist.length];
		answer[0] = n;
		for(int i =1; i< numlist.length;i++ ){
			list.add(numlist[i] - n);
		}
		for(Integer temp : list){
			System.out.println(temp);
		}
		return answer;
	}
}


