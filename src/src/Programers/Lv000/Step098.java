package Programers.Lv000;

import java.util.*;

/**
 * @Author: kyu05017
 * @Date: 2023/05/15
 * @Description: 프로그래머스 Lv01 97단게
 * @Ttitle :배열의 길이를 2의 거듭제곱으로 만들기
 */

public class Step098 {
	public static void main(String[] args) {
		solution(new int[]{0, 1, 1, 2, 2, 3});
	}
	public static int[] solution(int[] arr) {
		int[] answer = {};
		List<Integer> list = new ArrayList<>();
		int z = 0;
		int pow = 0;
		while(true){
			if(arr.length <= (int)Math.pow(2,z)){
				pow=(int)Math.pow(2,z);
				break;
			}
			z++;
		}

		if(arr.length==pow){
			answer=arr;
		}else{
			for(int i=0;i<pow;i++){
				if(i<arr.length){
					list.add(arr[i]);
				}else{
					list.add(0);
				}
			}
			answer = new int[list.size()];
			for(int i = 0; i < answer.length;i++){
				answer[i]=list.get(i);
			}
		}
		return answer;
	}
}


