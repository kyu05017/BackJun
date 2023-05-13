package Programers.Lv001;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: kyu05017
 * @Date: 2023/05/13
 * @Description: 프로그래머스 Lv01 66단게
 * @Ttitle : n 번째 원소까지
 */

import java.util.*;
public class Step066 {
	public static void main(String[] args) {
		System.out.println((Arrays.toString(solution(new int[]{2, 1, 6}, 1))));
	}
	public static int[] solution(int[] num_list, int n) {
		return Arrays.copyOfRange(num_list,0, n);
	}
}

