package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/05/17
 * @Description: 프로그래머스 Lv01 146단게
 * @Ttitle : 한 번만 등장한 문자
 */

import java.util.*;

public class Step146 {
	public static void main(String[] args) {

		System.out.println(
				(solution("abcabcadc"))
		);
	}
	public static String solution(String s) {
		String a = "";
		char[] t = s.toCharArray();
		Map<String,Integer> m = new HashMap<>();
		List<String> l = new ArrayList<>();
		for(int i=0;i<t.length;i++){
			m.put(String.valueOf(t[i]),m.getOrDefault(String.valueOf(t[i]),0)+1);
		}
		m.forEach((k,v)->{
			if(v==1){
				l.add(k);
			}
		});
		String[] z = new String[l.size()];
		for(int i=0;i<z.length;i++){
			z[i] = l.get(i);
		}
		Arrays.sort(z);
		for(String dd :z){
			a +=dd;
		}
		return a;
	}

}


