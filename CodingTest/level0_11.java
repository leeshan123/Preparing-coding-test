package CodingTest;

public class level0_11 {

	public static void main(String[] args) {
		//나머지 구하기
		
		//답확인
		int answer1 = solution(3,2);
		System.out.println(answer1);
		
		int answer2 = solution(10,5);
		System.out.println(answer2);
		
		

		
	}

	
	public static  int solution(int num1, int num2) {
		int answer = 0;
	
		answer = num1 % num2;
		
		
		
        return answer;
	}
}



