package BackJun.Step003;

/**
 * @Author: kyu05017
 * @Date: 2023/04/25
 * @Description: 백준 단계별 연습문제 풀이 3단계 10번 (응용문제)
 * @Ttitle : 벨찍기2
 */
import java.util.Scanner;

public class Practice010_2 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();


        for(int i = 0; i < height; i++) {
            for(int j = 1; j <= height; j++) {
                if(j <= height - i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
