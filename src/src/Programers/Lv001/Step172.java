package Programers.Lv001;

import java.util.Arrays;

/**
 * @Author: kyu05017
 * @Date: 2023/05/19
 * @Description: 프로그래머스 Lv01 172단게
 * @Ttitle : 캐릭터의 좌표
 */

public class Step172 {
	public static void main(String[] args) {

		System.out.println(
				Arrays.toString(solution(new String[]{"up", "up", "up", "up", "up"} , new int[]{7, 9}))
		);
	}

	public static int[] solution(String[] k, int[] b) {
		int zX = 0;
		int zY = 0;
		int minX = b[0]/2*-1;
		int maxX = (b[0]/2);

		int minY = b[1]/2*-1;
		int maxY = (b[1]/2);
		System.out.println(minX);System.out.println(maxX);System.out.println(minY);System.out.println(maxY);
		for(int i = 0; i < k.length; i++) {
			if (k[i].equals("left")) {
				if ((zX > minX)) {
					zX -=1;
				}
			} else if (k[i].equals("right")) {
				if ((zX < maxX)){
					zX+=1;
				}
			} else if (k[i].equals("up")) {
				if ((zY < maxY)) {
					zY+=1;
				}
			} else if (k[i].equals("down")) {
				if ((zY > minY)) {
					zY-=1;
				}
			}
		}
		int[] answer = new int[]{zX, zY};
		return answer;
	}
}