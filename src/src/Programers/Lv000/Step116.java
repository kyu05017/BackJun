package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/05/16
 * @Description: 프로그래머스 Lv01 116단게
 * @Ttitle :커피 심부름
 */

public class Step116 {
	public static void main(String[] args) {

		System.out.println(
				(solution(new String[]{"cafelatte", "americanoice", "hotcafelatte", "anything"}))
		);
	}
	public static int solution(String[] order) {
		int answer = 0;
		for(int i = 0; i < order.length; i++){
			if(order[i].contains("cafe")){
				answer += 5000;
			}else{
				answer += 4500;
			}
		}
		return answer;
	}
}


