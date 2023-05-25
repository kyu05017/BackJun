package Programers.Lv000;

import java.util.*;

/**
 * @Author: kyu05017
 * @Date: 2023/05/17
 * @Description: 프로그래머스 Lv01 131단게
 * @Ttitle : 잘라서 배열로 저장하기
 */

public class Step131 {
	public static void main(String[] args) {

		System.out.println(
				Arrays.toString(solution("abc1Addfggg4556b",6))
		);
	}
	public static String[] solution(String my_str, int n) {
		List<String> list = new ArrayList<>();
		String task="",tmp="";
		char[] temp = my_str.toCharArray();
		for(int i=0;i<temp.length;i++){
			task+=temp[i];

			if(task.length()==n){
				list.add(task);

				task="";
			}
		}
		for(String aa : list){
			tmp+=aa;
		}
		if(tmp.length()!=my_str.length()){
			list.add(
					my_str.substring(
							my_str.length()-my_str.length()%n,my_str.length()
					)
			);
		}
		String[] answer = new String[list.size()];
		for(int i=0;i<answer.length;i++){
			answer[i]=list.get(i);
		}
		return answer;
	}
}


