package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/05/19
 * @Description: 프로그래머스 Lv01 173단게
 * @Ttitle : 직사각형 넓이 구하기
 */

public class Step173 {
	public static void main(String[] args) {

		System.out.println(
				(solution(new int[][]{{1,1},{2, 1},{2,2},{1,2}}))
		);
	}

	public static int solution(int[][] d) {
		int[] x = new int[4],y = new int[4];
		for(int i = 0; i < d.length; i++){
			x[i] = d[i][0];
			y[i] = d[i][1];
		}
		int Xmax = x[0],Xmin = x[0],YMax = y[0],Ymin = y[0];
		for(int i = 0; i < x.length; i++){
			if(Xmax < x[i]){
				Xmax = x[i];
			}
			if(Xmin > x[i]){
				Xmin = x[i];
			}
			if(YMax < y[i]){
				YMax = y[i];
			}
			if(Ymin > y[i]){
				Ymin = y[i];
			}
		}
		return (Xmax - Xmin) * (YMax-Ymin);
	}
}