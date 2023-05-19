package Programers.Lv001;

/**
 * @Author: kyu05017
 * @Date: 2023/05/19
 * @Description: 프로그래머스 Lv01 168단게
 * @Ttitle : 안전지대
 */

import java.util.ArrayList;
import java.util.List;

public class Step168 {
	public static void main(String[] args) {

		System.out.println(
				(solution(new int[][]{{0,0,0,0,0},{0,0,1,0,0},{0,0,0,0,0},{0,0,1,0,0},{0,0,0,0,0}}))
		);
	}

	public static int solution(int[][]a) {
		int answer = 0;
		List<String> l1 = new ArrayList<>();
		List<String> l2 = new ArrayList<>();
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++)
				if(a[i][j]==1){
					l1.add(i+","+j);
				}
		}
		for(int i=0;i<l1.size();i++){
			String[] tmp=l1.get(i).split(",");
			int x=Integer.parseInt(tmp[0]);
			int y=Integer.parseInt(tmp[1]);
			l2.add(l1.get(i));
			l2.add((x-1)+","+(y-1));
			l2.add((x)+","+(y-1));
			l2.add((x+1)+","+(y-1));
			l2.add((x-1)+","+(y));
			l2.add((x+1)+","+(y));
			l2.add((x-1)+","+(y+1));
			l2.add((x)+","+(y+1));
			l2.add((x+1)+","+(y+1));
		}
		for(int i=0;i<l2.size();i++){
			String[] tmp=l2.get(i).split(",");
			for(int j=0;j<tmp.length;j++){
				int x = Integer.parseInt(tmp[0]);
				int y=Integer.parseInt(tmp[1]);
				if(x<0||y<0||x>=a.length||y>=a.length){
					continue;
				}
				a[x][y]=1;
			}
		}
		for(int i=0;i<a.length;i++){

			for(int j=0;j<a[i].length;j++)

				if(a[i][j]==0){

					answer++;

				}

		}
		return answer;
	}
}