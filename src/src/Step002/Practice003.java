package Step002;


import java.util.Scanner;

/**
 * @Author: kyu05017
 * @Date: 2023/04/25
 * @Description: 백준 단계별 연습문제 풀이 2단계 3번
 * @Ttitle : 윤년
 */
public class Practice003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstNum = sc.nextInt();

        System.out.println(callBackYearYN(firstNum));
    }

    public static int callBackYearYN(int year) {
        int result = 0;
        if((year % 4) == 0 && (year % 100) != 0 || (year % 400) == 0) {
            result = 1;
        } else {
            result = 0;
        }
        return result;
    }
}
