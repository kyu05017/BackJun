package Programers.Lv000;


import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @Author: kyu05017
 * @Date: 2023/05/10
 * @Description: 프로그래머스 Lv01 52단게
 * @Ttitle : qr code
 *
 */

public class Step052 {

	public static void main(String[] args) {
		System.out.println(solution(3,1,"qjnwezgrpirldywt"));
	}
	public static String solution(int q, int r,String code) {
		String answer = "";
		char[] arr = code.toCharArray();
		for(int i = 0; i < arr.length;i++) {
			if((i%q==r)){
				answer += String.valueOf(arr[i]);
			}
		}
		// IntStream 풀이
		String answer2 = IntStream.range(0, code.length()).filter(e -> e % q == r).mapToObj(i -> String.valueOf(code.charAt(i))).collect(Collectors.joining());

		/*
		*  IntSteam.range(시작 점 , 끝점)
		*  filter 조건문 ( 람다식 )
		*  matToObj(람다식) 결과물
		*
		* */
		String[] arr2 = new String[]{"a", "b", "c"};
		Stream<String> stream = Arrays.stream(arr2);
		Stream<String> streamOfArrayPart = Arrays.stream(arr2, 1, 3); // 1~2 요소 [b, c]

		streamOfArrayPart.forEach(System.out::println);

		return answer;
	}
}

