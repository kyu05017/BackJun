package Programers.Lv000;
import java.util.*;
/**
 * @Author: kyu05017
 * @Date: 2023/05/08
 * @Description: 프로그래머스 Lv01 36단게
 * @Ttitle : 배열만들기4
 */

public class Step036 {

	public static void main(String[] args) {
		solution(new int[]{1, 4, 2, 5, 3});
	}
	public static int[] solution(int[] arr) {
		int[] stk = {};
		List<Integer> list = new ArrayList<>();

		int i = 0;

		while (i < arr.length) {
			if(list.size() == 0) {
				list.add(arr[i]);
				i++;
			} else {
				if(list.get(list.size()-1) < arr[i]) {
					list.add(arr[i]);
					i++;
				}else if(list.get(list.size()-1) >= arr[i]) {
					list.remove(list.size()-1);
				}
			}
		}
		stk = new int[list.size()];
		for(int j = 0; j < list.size(); j++) {
			stk[j] = list.get(j);
		}

		return stk;
	}
}

