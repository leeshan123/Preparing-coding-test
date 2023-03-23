package CodingTest;

public class level0_031 {

	public static void main(String[] args) {
		// 배열 자르기
		//정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때,
		// numbers의 num1번 째 인덱스부터 num2번째 인덱스까지 자른 정수 배열을 return 하도록 solution 함수를 완성해보세요.
		
		
		//답 확인
		int [] answer1 = solution (new int[]{1,2,3,4,5},1,3);
		for(int i=0; i<answer1.length; i++)
			System.out.println(answer1[i]);
		
		int [] answer2 = solution (new int[]{1,3,5}, 1,2);
		for(int i=0; i<answer2.length; i++)
			System.out.println(answer2[i]);
		
	
		
	}

	
	public static  int[] solution(int[] numbers, int num1, int num2) {
		
		//배열의 크기 지정해주기.
		int  [] answer = new int [num2 - num1 +1];
		
		int index = 0;
		
		//반복문을 이용해서 answer의 배열 값 집어넣기
		for(int i = num1; i<= num2; i++) {
			answer[index] = numbers[i];
			index++;
		}
		
		
		return answer;
		    }
		}



