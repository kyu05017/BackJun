package Programers.Lv001;


import java.util.*;

/**
 * @Author: kyu05017
 * @Date: 2023/05/09
 * @Description: 프로그래머스 Lv01 38단게
 * @Ttitle : 주사위 게임3
 */

public class Step038 {

	public static void main(String[] args) {

		System.out.println(solution(6,3,3,6));
	}
	public static int solution(int a, int b, int c, int d) {
		int answer = 0;
		Set<Integer> set = new HashSet<>(Arrays.asList(a, b, c, d));
		int [] arr = {a,b,c,d};
		HashMap<Integer,Integer> task = new HashMap<>();
		ArrayList<Integer> keys = new ArrayList<>();
		ArrayList<Integer> value = new ArrayList<>();

		if (set.size() == 4) {
			int min = arr[0];
			for (int i = 1; i < arr.length; i++) {
				if (min > arr[i]) {
					min = arr[i];
				}
			}
			answer = min;
		} else if (set.size() == 3) {
			for(int i = 0; i < arr.length; i++) {
				for(int j = 1; j <= 6; j++){
					if(arr[i] == j){
						task.put(arr[i],task.getOrDefault(arr[i],0)+1);
					}
				}
			}

			for(Map.Entry<Integer, Integer> elem : task.entrySet()){
				keys.add(elem.getKey());
				value.add(elem.getValue());
			}

			if(value.get(0) == 2) {
				answer = keys.get(1)*keys.get(2);
			} else if(value.get(1) == 2) {
				answer = keys.get(0)*keys.get(2);
			} else if(value.get(2) == 2) {
				answer = keys.get(1)*keys.get(0);
			}
		} else if(set.size() == 2) {
			for(int i = 0; i < arr.length; i++) {
				for(int j = 1; j <= 6; j++){
					if(arr[i] == j){
						task.put(arr[i],task.getOrDefault(arr[i],0)+1);
					}
				}
			}
			for(Map.Entry<Integer, Integer> elem : task.entrySet()){
				keys.add(elem.getKey());
				value.add(elem.getValue());
			}
			int p = keys.get(0);
			int q = keys.get(1);
			int r = 0;
			if(value.get(0) == 3){
				r = (10* keys.get(0) + keys.get(1));
				r = r*r;
			} else if(value.get(1) ==3){
				r = (10* keys.get(1) + keys.get(0));
				r = r*r;
			} else if(value.get(0) == 2) {
				r = (p+q)*(p-q);
			}

			if (r < 0) {
				r = r*-1;
			}
			answer =  r;
		} else if(set.size() == 1){
			answer = a * 1111;
		}
		return answer;
	}
}

