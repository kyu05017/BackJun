package BackJun.Step002;


import java.util.Scanner;

/**
 * @Author: kyu05017
 * @Date: 2023/04/25
 * @Description: 백준 단계별 연습문제 풀이 2단계 2번
 * @Ttitle : 시험성적
 */
public class Practice002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();

        String result = setScore(score);

        System.out.println(result);

    }

    public static String setScore(int score) {
        String result = "F";

        if(score >= 90) {
            result = "A";
        } else if(score >= 80 && score < 90) {
            result = "B";
        } else if(score >= 70 && score < 80) {
            result = "C";
        } else if(score >= 60 && score < 70) {
            result = "D";
        }
        return result;
    }
}
