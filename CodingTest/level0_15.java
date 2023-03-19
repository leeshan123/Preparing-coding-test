package CodingTest;

public class level0_15 {

	public static void main(String[] args) {
		//피자 나눠먹기 1
		
		//답 확인
		System.out.println(solution(7));
		
		System.out.println(solution(1));
		
		System.out.println(solution(15));
		
		
		
	
		
	}

	
	public static  int solution(int n) {
		int answer = 0;
		
		if (n % 7 == 0)
			answer = n/ 7;
		else
			answer = n /7 +1;
		
		
		
		
        return answer;
	}
}



