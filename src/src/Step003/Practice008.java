package Step003;

/**
 * @Author: kyu05017
 * @Date: 2023/04/25
 * @Description: 백준 단계별 연습문제 풀이 3단계 8번
 * @Ttitle : A+B_8
 */

import java.io.IOException;
import java.util.Scanner;

public class Practice008 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);


        String task = sc.nextLine();
        for(int i = 1; i <= Integer.parseInt(task); i++){
            String score = sc.nextLine();
            String[] arr = score.split(" ");
            System.out.println("Case #"+i+": "+(Integer.parseInt(arr[0])+" + "+Integer.parseInt(arr[1])) + " = " + (Integer.parseInt(arr[0])+Integer.parseInt(arr[1])));
        }

    }
}
