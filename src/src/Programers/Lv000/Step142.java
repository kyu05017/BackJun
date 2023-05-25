package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/05/17
 * @Description: 프로그래머스 Lv01 142단게
 * @Ttitle : 문자열 계산하기
 */

public class Step142 {
	public static void main(String[] args) {

		System.out.println(
				(solution("3 + 4"))
		);
	}
	public static int solution(String m) {
		String[] a=m.split(" ");
		int r = Integer.parseInt(a[0]);
		for(int i=0;i<a.length;i++){
			if(a[i].equals("+")){
				r = r+Integer.parseInt(a[i+1]);
			}else if(a[i].equals("-")){
				r=r-Integer.parseInt(a[i+1]);
			}
		}
		return r;
	}
}


