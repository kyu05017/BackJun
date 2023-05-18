package Programers.Lv001;

/**
 * @Author: kyu05017
 * @Date: 2023/05/18
 * @Description: 프로그래머스 Lv01 158단게
 * @Ttitle : 치킨 쿠폰
 */

public class Step158 {
	public static void main(String[] args) {

		System.out.println(
				(solution(1801	))
		);
	}
	public static int solution(int a) {
		int s = a;
		int c = s/10,d=s%10,z=0;
		while(c+d>=10){
			c=s/10;
			d=s%10;
			z+=c;
			s=c+d;
		}
		return z;
	}
}


