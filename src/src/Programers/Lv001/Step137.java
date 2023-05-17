package Programers.Lv001;

/**
 * @Author: kyu05017
 * @Date: 2023/05/17
 * @Description: 프로그래머스 Lv01 137단게
 * @Ttitle : OX퀴즈
 */

public class Step137 {
	public static void main(String[] args) {

		System.out.println(
				(solution(new String[]{"3 - 4 = -3", "5 + 6 = 11"}))
		);
	}
	public static String[] solution(String[] quiz) {
		String[] answer = new String[quiz.length];
		int k = 0;
		for(String temp:quiz){
			int result = 0;
			String tmp=temp.substring(temp.indexOf("=")+2,temp.length());
			temp=temp.substring(0,temp.indexOf("=")-1);
			String[] task=temp.split(" ");
			for(int i=0;i<task.length;i++){
				if(temp.contains("+")){
					result=Integer.parseInt(task[0])+Integer.parseInt(task[2]);
				}else{
					result=Integer.parseInt(task[0])-Integer.parseInt(task[2]);
				}
			}
			if(String.valueOf(result).equals(tmp)){answer[k]="O";}
			else{answer[k]="X";}
			k++;
		}
		return answer;
	}
}


