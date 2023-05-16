package Programers.Lv001;

import java.util.*;

/**
 * @Author: kyu05017
 * @Date: 2023/05/16
 * @Description: 프로그래머스 Lv01 117단게
 * @Ttitle :그림 확대
 */

public class Step117 {
	public static void main(String[] args) {

		System.out.println(
				(solution(new String[]{".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."},2))
		);
	}
	public static String[] solution(String[] picture, int k) {
		List<String> list = new ArrayList<>();
		for(int i =0;i<picture.length;i++){
			for(int j=0;j<k;j++){
				list.add(task(picture[i],k));
			}

		}
		String[] answer = new String[list.size()];
		for(int i=0;i<answer.length;i++){
			answer[i]=list.get(i);
		}
		return answer;
	}
	public static String task(String a,int k){
		String result = "";
		char[] arr = a.toCharArray();
		for(int i = 0;i<arr.length;i++){
			for(int j =0;j<k;j++){
				result+=arr[i];
			}
		}
		return result;
	}
}


