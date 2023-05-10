package Programers.Lv001;


import java.math.BigInteger;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @Author: kyu05017
 * @Date: 2023/05/09
 * @Description: 프로그래머스 Lv01 40단게
 * @Ttitle : 9로 나눈 나머지
 */

public class Step040 {

	public static void main(String[] args) {

		System.out.println(solution("78720646226947352489"));
	}
	public static int solution(String number) {
		int answer = 0;

		// 바로 9로 나눈 나머지를 계산한 경우
		/*if(number.length() > 8) {
			BigInteger task = new BigInteger(number);
			BigInteger num = new BigInteger("9");
			answer = Integer.parseInt(String.valueOf(task.remainder(num)));

		} else {
			answer = Integer.parseInt(number)%9;
		}*/

		// 각자리수의 합을 더해 9로 나눈경우
		for(char c : number.toCharArray()){
			answer += c - '0'; // 48 || '0' 을 빼면 정수 계산 가능
		}
		answer %= 9;

		// 스트림 이용
		int i = number.chars().map(
				c -> (c - '0')).sum() % 9;
		System.out.println(i);

		// 어레이 스트림
		int j = Arrays.stream(number.split("")).mapToInt(Integer::parseInt).sum()%9;
		int k = Stream.of(number.split("")).mapToInt(Integer::parseInt).sum()%9;
		int test = 123456;

		return answer;
	}
}

