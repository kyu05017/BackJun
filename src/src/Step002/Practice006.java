package Step002;


import java.util.Scanner;

/**
 * @Author: kyu05017
 * @Date: 2023/04/25
 * @Description: 백준 단계별 연습문제 풀이 2단계 5번
 * @Ttitle : 오븐
 */
public class Practice006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fir = sc.nextInt();
        int sec = sc.nextInt();
        int thr = sc.nextInt();

        fir += thr/60;
        sec += thr%60;

        if(sec > 59){
            fir += 1;
            sec -= 60;
        }
        if(fir > 23){
            fir -= 24;
        }

        System.out.printf("%d %d", fir, sec);
    }
}
