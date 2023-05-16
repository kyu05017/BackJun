package Programers.Lv001;

/**
 * @Author: kyu05017
 * @Date: 2023/05/16
 * @Description: 프로그래머스 Lv01 122단게
 * @Ttitle :특별한 이차원 배열 2
 */

public class Step122 {
	public static void main(String[] args) {

		System.out.println(
				(solution(new int[][]{{5, 192, 33}, {192, 72, 95}, {33, 95, 999}}))
		);
	}
	public static int solution(int[][] arr) {
		int answer = 0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				if(arr[0][j]==arr[j][0]){
					answer=1;
				} else {
					answer=0;
					break;
				}
			}
		}
		return answer;
	}
}


