package Step002;


import java.util.Scanner;

/**
 * @Author: kyu05017
 * @Date: 2023/04/25
 * @Description: 백준 단계별 연습문제 풀이 2단계 6_2번 (응용 연습)
 * @Ttitle : 알람 시계
 */
public class Practice006_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fir = sc.nextInt();
        int sec = sc.nextInt();
        int thr = sc.nextInt();

        fir -= thr/60; // 입력 받은 시간을 60으로 나눈 경우 시간을 구함

        sec -= thr%60; // 입력 받은 시간을 60으로 나머지 경우 분을 구함

        if(sec < 0){// 분이 0 보다 작은 음수면
            fir -= 1; // 한시간을 빼고
            sec += 60; // 60을 더해 분을 구한다
        }

        if(fir < 0){ // 구해진 시간이 0 보다 작을 경우
            fir += 24; // 24를 더해 24시간에 맞춘다
        }

        System.out.printf("%d %d", fir, sec);
    }
}
