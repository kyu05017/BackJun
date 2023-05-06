package AlgorithmPractice.선형검색과보초법;


import java.util.Scanner;

/**
 * @Author: kyu05017
 * @Date: 2023/05/06
 * @Description: 알고리즘 공부하기
 * @Ttitle : 선형검색과 보초법
 */
public class 선형검색과보초법 {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		int[] arr = {72, 68, 92, 88, 41, 53, 97, 84, 39, 55};

		int selectMode = sc.nextInt();

		int findNum = sc.nextInt();

		int result = -1;

		// 선형 검색 (순차검색){(Sequential Search)}
		/**
		 * 순차검색은 구현이 쉽고 리스트의 정렬 여부와 상관없이 동작하느 장점이 있지만
		 * 리스트의 모든 요소를 확인해야 하기 때문에 검색 할 시그트의 길이가 길면 비효율적이라는 단점이 있습니다.
		 */
		if(selectMode == 1) {
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] == findNum) {
					result = i;
					break;
				}
			}
			System.out.printf("결과 값 : %d \n",result);
		}

		// 보초법 {(Sentinel method)}
		else if(selectMode == 2) {
			int[] newArr = new int[arr.length+1];

			System.arraycopy(arr, 0, newArr, 0, arr.length);
			newArr[arr.length] = findNum;

			for(int i = 0; i < newArr.length; i++) {
				if(newArr[i] == findNum) {
					result = -1;
					break;
				} else {
					result = i;
				}
			}

			System.out.printf("결과 값 : %d \n",result);
		}
		/**
		 * 보초 법이란 반복의 종료를 알리는 특정한 값인 보초 값을 사용하여 종료 조건중 검색 싶해 조건을 제거하여 판단횟수를 줄이는 방법
		 * 검색하고자 하는 키 값을 기존 리스트의 맨 끝 자리에 추가하고 이를 보초 값으로 사용
		 * 이렇게 하면 리스에 찾던 값이 없어도 보초 값까지 검색하면 종료(종료 조건 1[검색실패])를 만족
		 */

	}
}
