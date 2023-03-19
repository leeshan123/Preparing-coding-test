package CodingTest;

public class level0_8 {

	public static void main(String[] args) {
		//숫자 비교하기
		int answer1 = solution(2,3);
		System.out.println(answer1);
		
		int answer2 = solution(11,11);
		System.out.println(answer2);

		int answer3= solution(7,99);
		System.out.println(answer3);
	}
	
	public static int solution(int num1, int num2) {
        int answer = 0;
        
        if (num1 == num2)
        	answer = 1;
        else
        	answer = -1;
        // num1과 num2가 같으면 1 and 다르면 -1을 하면됨
        
        return answer;
	}
}



