package Programers.Lv001;

/**
 * @Author: kyu05017
 * @Date: 2023/05/30
 * @Description: 프로그래머스 Lv1 5단게
 * @Ttitle :문자열 내 p와 y의 개수
 */


public class Setp010 {
	public static void main(String[] args) {
		System.out.println((solution("pPoooyY")));
	}

	public static boolean solution(String s) {
		int p = 0,y=0;
		char[] temp = s.toCharArray();
		for(int i = 0; i < temp.length; i++) {
			if(String.valueOf(temp[i]).equals("y") || String.valueOf(temp[i]).equals("Y")){
				y++;
			} else if(String.valueOf(temp[i]).equals("p")||String.valueOf(temp[i]).equals("P")){
				p++;
			}
		}
		return y == p;
	}
}
