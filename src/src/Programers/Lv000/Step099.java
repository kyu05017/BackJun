package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/05/15
 * @Description: 프로그래머스 Lv01 99단게
 * @Ttitle :배열 비교하기
 */

public class Step099 {
	public static void main(String[] args) {
		solution(new int[]{49, 13}, new int[]{70, 11, 2});
	}
	public static int solution(int[] arr1, int[] arr2) {
		int answer = 0;
		if(arr1.length == arr2.length){
			int tmp1=0,tmp2=0;
			for(int i = 0;i<arr1.length;i++){
				tmp1+=arr1[i];
				tmp2+=arr2[i];
			}
			if(tmp1>tmp2){
				answer = 1;
			} else if(tmp1<tmp2){
				answer = -1;
			}
		} else {
			if(arr1.length > arr2.length){
				answer = 1;
			}else{
				answer = -1;
			}
		}
		return answer;
	}
}


