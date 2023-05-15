package Programers.Lv001;

/**
 * @Author: kyu05017
 * @Date: 2023/05/16
 * @Description: 프로그래머스 Lv01 112단게
 * @Ttitle :꼬리 문자열
 */

public class Step112 {
	public static void main(String[] args) {

		System.out.println(
				(solution(new String[]{"abc", "def", "ghi"},"ef"))
		);
	}
	public static String solution(String[] str_list, String ex) {

		String answer = "";
		for(String str : str_list){
			if(!str.contains(ex)){
				answer += str;
			}
		}
		// return Arrays.stream(strList).filter(s -> !s.contains(ex)).collect(Collectors.joining());Step112
		return answer;
	}
}


