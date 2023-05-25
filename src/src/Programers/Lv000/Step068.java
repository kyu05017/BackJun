package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/05/13
 * @Description: 프로그래머스 Lv01 68단게
 * @Ttitle : 홀수 vs 짝수
 */

public class Step068 {
	public static void main(String[] args) {
		System.out.println((solution(new int[]{4, 2, 6, 1, 7, 6})));
	}
	public static int solution(int[] num_list) {
		int num1 = 0,num2 = 0;
		for(int i = 0; i < num_list.length; i++) {
			if(i%2==0){
				num1 += num_list[i];
			}else{
				num2 += num_list[i];
			}
		}
		return  Math.max(num1, num2);
	}
}

