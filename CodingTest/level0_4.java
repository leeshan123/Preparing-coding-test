package CodingTest;

public class level0_4 {

	public static void main(String[] args) {
		// 두 수의 차
		int answer1 = solution(2,3);
		System.out.println(answer1);
		
		int answer2 = solution(100,2);
		System.out.println(answer2);

	}
	
	public static int solution(int num1, int num2) {
        int answer = 0;
        
        answer = num1 - num2;
        //차니까 그냥 이렇게 바로 출력
        
        return answer;
	}
}


