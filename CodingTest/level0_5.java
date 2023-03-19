package CodingTest;

public class level0_5 {

	public static void main(String[] args) {
		// 두 수의 곱
		int answer1 = solution(3,4);
		System.out.println(answer1);
		
		int answer2 = solution(27,19);
		System.out.println(answer2);

	}
	
	public static int solution(int num1, int num2) {
        int answer = 0;
        
        answer = num1 * num2;
        //곱이니까 그냥 이렇게 바로 출력
        
        return answer;
	}
}

