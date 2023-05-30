package Programers.Lv001;

/**
 * @Author: kyu05017
 * @Date: 2023/05/30
 * @Description: 프로그래머스 Lv1 24단게
 * @Ttitle :수박수박수박수박수박수?
 */

public class Setp024 {
	public static void main(String[] args) {
		System.out.println((solution(3)));
	}

	public static String solution(int n) {
		String answer = "";
		for(int i=0;i<n;i++){
			if(i%2==0){
				answer+="수";
			}else{
				answer+="박";
			}
		}
		return answer;
	}
}
