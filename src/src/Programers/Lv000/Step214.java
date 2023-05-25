package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/05/25
 * @Description: 프로그래머스 Lv01 214단게
 * @Ttitle : 최빈값 구하기
 */

import java.util.*;

public class Step214 {
	public static void main(String[] args) {
		System.out.println(
				(solution(new int[]{2,4,4,4,2}))
		);
	}

	public static int solution(int[] a) {
		int answer = 0;

		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < a.length; i++) {
			map.put(a[i],map.getOrDefault(a[i],0)+1);
		}

		int maxCnt = 0;
		map.forEach((k,v)->{
			list.add(v);
		});

		list.sort(Collections.reverseOrder());
		if(list.size() == 1){
			answer = a[0];
		} else if(map.size() == 1){
			answer = -1;
		} else {
			if(list.get(0) == list.get(1)){
				answer = -1;
			} else {
				List<Integer> temp = new ArrayList<Integer>();

				map.forEach((k,v)->{
					if(v == list.get(0)) {
						temp.add(k);
					}
				});
				answer = temp.get(0);
			}
		}

		return answer;
	}
} 