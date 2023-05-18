package Programers.Lv001;

/**
 * @Author: kyu05017
 * @Date: 2023/05/18
 * @Description: 프로그래머스 Lv01 159단게
 * @Ttitle : 로그인 성공?
 */

public class Step159 {
	public static void main(String[] args) {

		System.out.println(
				(solution(new String[]{"meosseugi", "1234"},new String[][]{{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}}))
		);
	}
	public static String solution(String[] ip, String[][] db) {
		String id=ip[0],pw=ip[1];
		String answer = "";
		for(int i=0;i<db.length;i++){
			if(id.equals(db[i][0])&&pw.equals(db[i][1])){
				answer="login";
				break;
			}else if(id.equals(db[i][0])&&!pw.equals(db[i][1])){
				answer="wrong pw";
				break;
			}else if(!id.equals(db[i][0])){
				answer="fail";
			}
		}
		return answer;
	}
}


