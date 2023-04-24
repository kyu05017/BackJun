package Step002;


import java.util.Scanner;

/**
 * @Author: kyu05017
 * @Date: 2023/04/25
 * @Description: 백준 단계별 연습문제 풀이 2단계 4번
 * @Ttitle : 4분면
 */
public class Practice004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fir = sc.nextInt();
        int sec = sc.nextInt();
        System.out.println(callBackYearYN(fir,sec));
    }

    public static int callBackYearYN(int fir, int sec) {
        int result = 0;

        if(fir > 0 && sec > 0) {
            result = 1;
        } else if(fir < 0 && sec > 0){
            result = 2;
        } else if(fir < 0 && sec < 0){
            result = 3;
        } else if(fir > 0 && sec < 0){
            result = 4;
        }
        return result;
    }
}
