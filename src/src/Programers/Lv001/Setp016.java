package Programers.Lv001;

/**
 * @Author: kyu05017
 * @Date: 2023/05/30
 * @Description: 프로그래머스 Lv1 16단게
 * @Ttitle :콜라츠 추측
 */


public class Setp016 {
	public static void main(String[] args) {
		System.out.println((solution(6)));
	}

	public static int solution(int n) {
		long answer = 0,temp=n;
		while(temp!=1){
			if(temp%2==0){
				temp = temp/2;
			}else{
				temp = (temp*3)+1;
			}
			if(temp > Integer.MAX_VALUE){
				return -1;
			}
			answer++;
		}
		return (int)answer;
	}
}
