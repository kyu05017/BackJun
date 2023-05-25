package Programers.Lv000;

import java.util.HashMap;

/**
 * @Author: kyu05017
 * @Date: 2023/05/15
 * @Description: 프로그래머스 Lv01 100단게
 * @Ttitle :문자열 묶기
 */

public class Step100 {
	public static void main(String[] args) {
		solution(new String[]{"a","bc","d","efg","hi"});
	}
	public static int solution(String[] strArr) {
		HashMap<Integer, Integer> lengthMap = new HashMap<>();

		for (String str : strArr) {
			int length = str.length();
			lengthMap.put(length, lengthMap.getOrDefault(length, 0) + 1);
		}

		int maxGroupSize = 0;
		for (int count : lengthMap.values()) {
			if (count > maxGroupSize) {
				maxGroupSize = count;
			}
		}

		return maxGroupSize;
	}
}


