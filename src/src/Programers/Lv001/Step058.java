package Programers.Lv001;


import java.util.ArrayList;
import java.util.List;

/**
 * @Author: kyu05017
 * @Date: 2023/05/10
 * @Description: 프로그래머스 Lv01 58단게
 * @Ttitle : 리스트 자르기
 *
 */

public class Step058 {

	public static void main(String[] args) {
		System.out.println(solution(3, new int[]{1, 5, 2}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
	}
	public static int[] solution(int n, int[] slicer, int[] num_list) {
		List<Integer> list = new ArrayList<>();
		if(n == 1){
			for(int i = 0; i < slicer[1]; i++) {
				list.add(num_list[i]);
			}
		} else if (n == 2) {
			for(int i = slicer[0]; i < num_list.length; i++) {
				list.add(num_list[i]);
			}
		} else if (n == 3) {
			for(int i = slicer[0]; i <= slicer[1]; i++) {
				list.add(num_list[i]);
			}
		} else if (n == 4) {
			for(int i = slicer[0]; i <= slicer[1]; i = i+ slicer[2]) {
				list.add(num_list[i]);
			}
		}


		int[] answer = new int[list.size()];
		for(int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
}

