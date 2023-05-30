package Programers.Lv001;

/**
 * @Author: kyu05017
 * @Date: 2023/05/30
 * @Description: 프로그래머스 Lv1 22단게
 * @Ttitle :제일 작은 수 제거하기
 */

public class Setp022 {
	public static void main(String[] args) {
		System.out.println((solution(new int[]{1,2,3,4,6,7,8,0})));
	}

	public static int[] solution(int[] arr) {
		if(arr.length <= 1){
			return new int[]{-1};
		}

		int[] answer = new int[arr.length-1];
		int min = arr[0];
		for(int i=1;i<arr.length;i++){
			if(min > arr[i]){
				min=arr[i];
			}
		}
		int j =0;
		for(int i =0;i<arr.length;i++){
			if(arr[i] != min){
				answer[j]=arr[i];
				j++;
			}
		}
		return answer;
	}
}
