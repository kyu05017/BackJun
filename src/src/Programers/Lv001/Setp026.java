package Programers.Lv001;

/**
 * @Author: kyu05017
 * @Date: 2023/05/30
 * @Description: 프로그래머스 Lv1 26단게
 * @Ttitle :약수의 개수와 덧셈
 */

public class Setp026 {
	public static void main(String[] args) {
		System.out.println((solution(13,17)));
	}

	public static int solution(int a, int b) {
		int answer = 0;
		for(int i=a;i<=b;i++){
			if(maker(i)){
				answer += i;
			}else{
				answer -= i;
			}
		}
		return answer;
	}
	public static boolean maker(int a){
		int cnt=0;
		for(int i=1;i<=a;i++){
			if(a%i==0){
				cnt++;
			}
		}
		return cnt%2==0 ? true:false;
	}
}
