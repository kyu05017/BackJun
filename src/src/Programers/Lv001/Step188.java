package Programers.Lv001;

import java.math.BigInteger;

/**
 * @Author: kyu05017
 * @Date: 2023/05/23
 * @Description: 프로그래머스 Lv01 188단게
 * @Ttitle : 구슬을 나누는 경우의 수
 */

public class Step188 {
	public static void main(String[] args) {

		System.out.println(
				(solution(5,3))
		);
	}

	public static BigInteger solution(int n, int m) {
		BigInteger temp1 = maker(n),temp2 = maker(m),temp3 = maker(n-m);
		BigInteger temp4 = temp2.multiply(temp3);
		BigInteger reuslt = temp1.divide(temp4);
		return reuslt;
	}

	public static BigInteger maker(int n){
		BigInteger temp1 = new BigInteger("1");
		for(int i = 1; i <= n; i++){
			BigInteger temp2 = new BigInteger(String.valueOf(i));
			temp1 = temp1.multiply(temp2);
		}
		return  temp1;
	}
} 