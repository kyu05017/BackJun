package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/05/17
 * @Description: 프로그래머스 Lv01 132단게
 * @Ttitle : 7의 개수
 */

public class Step132 {
	public static void main(String[] args) {

		System.out.println(
				(solution(new int[]{7, 77, 17}))
		);
	}
	public static int solution(int[] array) {
		int answer = 0;
		for(int temp : array){
			char[] task = String.valueOf(temp).toCharArray();
			for(int i=0;i<task.length;i++){
				if(String.valueOf(task[i]).equals("7")){
					answer++;
				}
			}
		}
		return answer;
	}
}


