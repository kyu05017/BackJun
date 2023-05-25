package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/05/19
 * @Description: 프로그래머스 Lv01 165단게
 * @Ttitle : 저주의 숫자 "3"
 */
import java.util.*;
public class Step165 {
	public static void main(String[] args) {

		System.out.println(
			(solution(15))
		);
	}
	public static int solution(int n) {
		List<Integer> l = new ArrayList<>();
		for (int i = 1; l.size() < n; i++) {
			if (i % 3 == 0 || String.valueOf(i).indexOf("3") != -1) {
				continue;
			}
			l.add(i);
		}
		return l.get(l.size() - 1);
	}
}


