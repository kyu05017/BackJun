package BackJun.Step003;

/**
 * @Author: kyu05017
 * @Date: 2023/04/25
 * @Description: 백준 단계별 연습문제 풀이 3단계 9번
 * @Ttitle : 벨찍기
 */
import java.util.Scanner;

public class Practice009_Check {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();


        for(int i = 1; i <= height; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
