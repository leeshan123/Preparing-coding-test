package CodingTest;

public class level0_026 {

	public static void main(String[] args) {
		// 문자 반복 출력하기
		//문자열 my_string과 정수 n이 매개변수로 주어질 때, my_string에 들어있는 각 문자를 n만큼 반복한 문자열을 return 하도록 solution 함수를 완성해보세요.
		
		
		//답 확인
		System.out.println(solution("hello", 3));
		
		
	
		
		
	
		
	}

	
	public static  String solution(String my_string, int n) {
		String answer = "";
		char[] ch = my_string.toCharArray();
		
		// ch.length까지 돌려주면서 n번까지 문자를 반복하는 이중 반복문을 만들면 됨.
		for(int i = 0; i< ch.length; i++)
			for(int j = 0; j<n; j++) 
				answer = answer + ch[i];
		
		
		        return answer;
		    }
		}



