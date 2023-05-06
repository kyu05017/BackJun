package Programers.Lv001;

import java.util.*;
/**
 * @Author: kyu05017
 * @Date: 2023/05/01
 * @Description: 프로그래머스 Lv01 33단게
 * @Ttitle : 배열 만들기 2
 */

public class Step033_Check {

	public static void main(String[] args) {
		solution(5,555);
	}
	public static int[] solution(int l, int r) {
		List<Integer> list = new ArrayList<>();

		for (int i = l; i <= r; i++) {
			if (containsOnlyZeroesAndFives(i)) {
				list.add(i);
			}
		}

		if (list.size() == 0) {
			return new int[]{-1};
		}

		Collections.sort(list);
		int[] answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}

		return answer;
	}

	public static boolean containsOnlyZeroesAndFives(int n) {
		while (n > 0) {
			int digit = n % 10;
			if (digit != 0 && digit != 5) {
				return false;
			}
			n /= 10;
		}
		return true;
	}
}

