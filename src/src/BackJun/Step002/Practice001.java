package BackJun.Step002;


import java.util.Scanner;

/**
 * @Author: kyu05017
 * @Date: 2023/04/25
 * @Description: 백준 단계별 연습문제 풀이 2단계 1번
 * @Ttitle : 비교
 */
public class Practice001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();

        if(firstNum > secondNum) {
            System.out.println(">");
        }else if(firstNum < secondNum) {
            System.out.println("<");
        } else if(firstNum == secondNum) {
            System.out.println("==");
        }
    }
}
