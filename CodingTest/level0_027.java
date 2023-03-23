package CodingTest;

public class level0_027 {

	public static void main(String[] args) {
		// 특정 문자 제거하기
		//문자열 my_string과 문자 letter이 매개변수로 주어집니다. my_string에서 letter를 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
		
		
		//답 확인
		System.out.println(solution("abcdef", "f"));
		
		System.out.println(solution("BCBdbe", "B"));
		
		
	
		
		
	
		
	}

	
	public static  String solution(String my_string, String letter) {
		String answer = "";
		
		//replaceAll 매서드를 사용해서 letter을 다 0으로 만들어줌
		 answer = my_string.replaceAll(letter, "");
		 
		
		
		
		
		        return answer;
		    }
		}



