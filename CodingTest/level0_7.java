package CodingTest;

public class level0_7 {

	public static void main(String[] args) {
		// 두 수의 나눗셈
		
		int answer1 = solution(3,2);
		System.out.println(answer1);
		
		int answer2 = solution(7,3);
		System.out.println(answer2);
		
		int answer3 = solution(1,16);
		System.out.println(answer3);

	}

	public static int solution(int num1, int num2) {
		// 나눗셈이니까 정수가 나와야함 double이나 float로 형변환 시켜줘야함
		
	   double answer = ((double)num1 / num2) * 1000;
	    
	    
	    return (int)answer;
	    // 답은 인트를 원하니까 answer을 인트로 형변환
	}
	}

