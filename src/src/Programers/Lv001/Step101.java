package Programers.Lv001;

import java.util.HashMap;

/**
 * @Author: kyu05017
 * @Date: 2023/05/15
 * @Description: 프로그래머스 Lv01 101단게
 * @Ttitle :배열의 길이에 따라 다른 연산하기
 */

public class Step101 {
	public static void main(String[] args) {
		solution(new int[]{0, 1, 1, 2, 2, 3} , 3);
	}
	public static int[] solution(int[] arr, int n) {
		if(arr.length%2==0){
			for(int i = 0;i<arr.length;i++){
				if(i%2!=0){
					arr[i]=arr[i]+n;
				}
			}
		}else{
			for(int i = 0;i<arr.length;i++){
				if(i%2==0){
					arr[i]=arr[i]+n;
				}
			}
		}
		return arr;
	}
}


