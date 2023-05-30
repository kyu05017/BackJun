package Programers.Lv001;

/**
 * @Author: kyu05017
 * @Date: 2023/05/30
 * @Description: 프로그래머스 Lv1 18단게
 * @Ttitle :나누어 떨어지는 숫자 배열
 */
import java.util.*;

public class Setp018 {
	public static void main(String[] args) {
		System.out.println((solution(new int[]{5,9,7,10},5)));
	}

	public static int[] solution(int[] a, int d) {
		List<Integer> temp = new ArrayList<>();
		for(int i=0;i<a.length;i++){
			if(a[i]%d==0){
				temp.add(a[i]);
			}
		}
		if(temp.size()==0){
			return new int[]{-1};
		}
		int[] answer = new int[temp.size()];
		for(int i=0;i<answer.length;i++){
			answer[i]=temp.get(i);
		}
		Arrays.sort(answer);
		return answer;
	}
}
