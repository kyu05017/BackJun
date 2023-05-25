package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/05/15
 * @Description: 프로그래머스 Lv01 106단게
 * @Ttitle :문자열을 정수로 변환하기
 */

public class Step106 {
	public static void main(String[] args) {

		System.out.println(
				solution("0010")
		);
	}
	public static String solution(String n_str) {
		String answer = "";
		if(n_str.startsWith("0")){
			boolean flag = false;
			String[] task = n_str.split("");
			for(int i = 0; i < task.length; i++){
				if(task[i].equals("0") && flag==false){
					continue;
				}else{
					flag = true;
				}
				if(flag){
					answer += task[i];
				}
			}
		} else {
			return n_str;
		}

		return answer;
	}
}


