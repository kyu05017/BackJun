package Programers.Lv001;

import java.util.*;

/**
 * @Author: kyu05017
 * @Date: 2023/06/03
 * @Description: 프로그래머스 Lv1 39단계
 * @Ttitle : 최소직사각형
 */

public class Setp039 {
	public static void main(String[] args) {
		System.out.println(
				(
						solution(new int[][]{{60,50},{30,70},{60,30},{80,40}})
				)
		);
	}

	public static int solution(int[][] sizes) {
		List<Integer> xlist = new ArrayList<Integer>() , ylist = new ArrayList<Integer>();
		for(int i = 0; i < sizes.length; i++) {
			int max = Math.max(sizes[i][0],sizes[i][1]) ,  min = Math.min(sizes[i][0],sizes[i][1]);
			xlist.add(max);
			ylist.add(min);
		}
		int xMax = Collections.max(xlist), yMax = Collections.max(ylist);
		return xMax*yMax;
	}
}
