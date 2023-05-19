package Programers.Lv001;

/**
 * @Author: kyu05017
 * @Date: 2023/05/19
 * @Description: 프로그래머스 Lv01 167단게
 * @Ttitle : 삼각형의 완성조건 (2)
 */
import java.util.*;
public class Step167 {
	public static void main(String[] args) {

		System.out.println(
				(solution(new int[]{1, 2}))
		);
	}

	public static int solution(int[] s) {
		int max = Math.max(s[0],s[1]);
		int min = Math.min(s[0],s[1]);
		List<Integer> a = new ArrayList<>();
		for(int i=1;i+min<min+max;i++){
			if(i+min>max){
				a.add(i);
			}
		}
		return a.size()*2+1;
	}
}

