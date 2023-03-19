package CodingTest;

public class level0_9 {

	public static void main(String[] args) {
		//분수의 덧셈
		// 못품..ㅠㅠ
		
		
		int [] answer1 = solution(1,2,3,4);
		System.out.println(answer1);
		
		int [] answer2 = solution(9,2,1,3);
		System.out.println(answer2);

		
	}
	
	public static  int[] solution(int num1, int denom1, int num2, int denom2) {
	     int[] answer = {0, 0};
        int top = num1 * denom2 + num2 * denom1; 
        int bottom = num1 * num2;
        
        
        return answer;
	}
}



