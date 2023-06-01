package Programers.Lv001;

/**
 * @Author: kyu05017
 * @Date: 2023/05/30
 * @Description: 프로그래머스 Lv1 35단게
 * @Ttitle :이상한 문자 만들기
 */

public class Setp035 {
	public static void main(String[] args) {
		System.out.println(
				(
						solution("  tRy hello  WORLD    ")
				)
		);
	}

	public static String solution(String s) {
		String answer = "";
		String temp = s.replaceAll(" ","_");
		int j = 0;
		char[] tmp = temp.toCharArray();
		for(int i = 0; i < tmp.length; i++){
			if(String.valueOf(tmp[i]).equals("_")){
				j = 0;
			} else if(j % 2 == 0){
				tmp[i] = Character.toUpperCase(tmp[i]);
				j++;
			} else if(j % 2 != 0){
				tmp[i] = Character.toLowerCase(tmp[i]);
				j++;
			}
			answer += tmp[i];
		}
		String result = answer.replaceAll("_"," ");
		return result;
	}
}
