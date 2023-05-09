package Programers.Lv001;



/**
 * @Author: kyu05017
 * @Date: 2023/05/09
 * @Description: 프로그래머스 Lv01 39단게
 * @Ttitle : 글자 이어 붙여 문자열 만들기
 *
 */

public class Step039 {

	public static void main(String[] args) {

		System.out.println(solution("zpiaz",new int[]{1, 2, 0, 0, 3}));
	}
	public static String solution(String my_string, int[] index_list) {
		String answer = "";
		char[] str = my_string.toCharArray();

		for(int i = 0; i < index_list.length;i++){
			answer = answer + str[index_list[i]];
		}


		return answer;
	}
}

