package BackJun.Step002;


import java.util.Scanner;

/**
 * @Author: kyu05017
 * @Date: 2023/04/25
 * @Description: 백준 단계별 연습문제 풀이 2단계 5번
 * @Ttitle : 알람 시계
 */
public class Practice005_Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fir = sc.nextInt();
        int sec = sc.nextInt();

        fir -= 45/60;
        sec -= 45%60;

        if(sec < 0){
            fir -= 1;
            sec += 60;
        }
        if(fir < 0){
            fir += 24;
        }
        System.out.println(fir+" "+sec);
    }
}
