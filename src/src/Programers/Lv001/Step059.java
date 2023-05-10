package Programers.Lv001;


import java.util.ArrayList;
import java.util.List;

/**
 * @Author: kyu05017
 * @Date: 2023/05/10
 * @Description: 프로그래머스 Lv01 59단게
 * @Ttitle : 첫 번째로 나오는 음수
 *
 */

public class Step059 {

	public static void main(String[] args) {
		System.out.println(solution(new int[]{12, 4, 15, 46, 38, -2, 15}));
	}
	public static int solution(int[] num_list) {
		int answer = -1;
		for(int i=0; i<num_list.length;i++){
			if(num_list[i] <= 0 ){
				answer = i;
				break;
			}
		}
		return answer;
	}
}

