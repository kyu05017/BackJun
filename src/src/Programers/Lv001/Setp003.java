package Programers.Lv001;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @Author: kyu05017
 * @Date: 2023/05/30
 * @Description: 프로그래머스 Lv1 3단게
 * @Ttitle : 평균 구하기
 */


public class Setp003 {
	public static void main(String[] args) {
		System.out.println(solution(new int[]{1,2,3,4}));
	}

	public static double solution(int[] arr) {
		List<Integer> arrList = Arrays.stream(arr).boxed().collect(Collectors.toList());
		double tesmp = Arrays.stream(arr).average().getAsDouble();
		System.out.println(tesmp);
		return (double) (arrList.stream().mapToInt(i -> i).sum()) /arr.length;
	}
}
