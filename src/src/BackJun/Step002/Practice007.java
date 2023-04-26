package BackJun.Step002;


import java.util.Scanner;

/**
 * @Author: kyu05017
 * @Date: 2023/04/25
 * @Description: 백준 단계별 연습문제 풀이 2단계 7번
 * @Ttitle : 주사위 3개
 */
public class Practice007 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        String[] results = setScore(a,b,c);
        int result = callBackInt(results);

        System.out.println(result);
    }
    public static int callBackInt(String[] temp) {
        int result = 0;
        if(temp[0].equals("A")){
            result = 10000+ (Integer.parseInt(temp[1]) * 1000);
        } else if(temp[0].equals("B")){
            result = 1000+ (Integer.parseInt(temp[1]) * 100);
        } else{
            result = (Integer.parseInt(temp[1]) * 100);
        }
        return result;
    }

    public static String[] setScore(int a, int b, int c) {
        String[] result = new String[2];
        if(a==b && b==c){
            result[0] = "A";
            result[1] = Integer.toString(a);
        } else if(a!=b && b!=c && a!=c){
            result[0] = "C";
            if(a > b && a > c){
                result[1] = Integer.toString(a);
            } else if(b > a && b > c) {
                result[1] = Integer.toString(b);
            } else {
                result[1] = Integer.toString(c);
            }
        } else {
            result[0] = "B";
            if(a == b) {
                result[1] = Integer.toString(a);
            } else if(a == c) {
                result[1] = Integer.toString(c);
            } else {
                result[1] = Integer.toString(b);
            }
        }
        return result;
    }
}