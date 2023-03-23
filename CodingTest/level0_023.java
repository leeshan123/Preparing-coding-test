package CodingTest;

public class level0_023 {

	public static void main(String[] args) {
		// 문자열 출력
		//문자열 my_string이 매개변수로 주어집니다. my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요.
		
		
		//답 확인
		System.out.println(solution("jaron"));
		
		System.out.println(solution("bread"));
	
		
		
	
		
	}

	
	public static  String solution(String my_string) {
		String answer = "";
		
		//꺼구로 뒤집어야하니까 반복문을 이렇게 해야함.
		for(int i=my_string.length()-1; i>=0; i--) {
			answer = answer + my_string.substring(i,i+1);
		}
		
		
		        return answer;
		    }
		}



