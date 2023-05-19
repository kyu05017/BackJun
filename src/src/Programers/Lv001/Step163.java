package Programers.Lv001;

/**
 * @Author: kyu05017
 * @Date: 2023/05/19
 * @Description: 프로그래머스 Lv01 163단게
 * @Ttitle : 겹치는 선분의 길이
 */
import java.util.*;
public class Step163 {
	public static void main(String[] args) {

		System.out.println(
			(solution(new int[][]{{0,1},{2,5},{3,9}}))
		);
	}
	public static int solution(int[][] a) {
		int answer = 0;
		List<String> l = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			for (int j = a[i][0]; j < a[i][1]; j++) {
				String t = j + "," + (j + 1);
				l.add(t);
			}
		}
		List<String> l2 = new ArrayList<>();
		for (int i = 0; i < l.size(); i++) {
			for (int j = i + 1; j < l.size(); j++) {
				if (l.get(i).equals(l.get(j))) {
					l2.add(l.get(i));
				}
			}
		}
		Set<String> set = new HashSet<String>(l2);
		return set.size();
	}
}


