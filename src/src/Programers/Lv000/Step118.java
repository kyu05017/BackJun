package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/05/16
 * @Description: 프로그래머스 Lv01 118단게
 * @Ttitle :조건에 맞게 수열 변환하기 3
 */

public class Step118 {
	public static void main(String[] args) {

		System.out.println(
				(solution(new int[]{1, 2, 3, 100, 99, 98},3))
		);
	}
	public static int[] solution(int[] arr, int k) {
		if(k%2==0){
			for(int i=0;i<arr.length;i++){
				arr[i]=arr[i]+k;
			}
		}else{
			for(int i=0;i<arr.length;i++){
				arr[i]=arr[i]*k;
			}
		}
		int[] answer = arr;
		return answer;
	}
}


