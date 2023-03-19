package CodingTest;

public class level0_10 {

	public static void main(String[] args) {
		//배열 두배 만들기
		
		// 1번째 방법
		// 배열안에 값을 가져오기 위해서 반복문으로 하나씩 출력
		int[] numbers = {1,2,3,4,5};
		int [] answer1 = solution(numbers);
		
		for(int i =0;  i < numbers.length; i++) {
		System.out.println(answer1[i]);
		}
		
		
		// 이렇게 했었는데 안됨. 솔루션을 찾긴 하는데 배열의 값을 가져오는게 아니라 주소값을 가져오기 때문
		
		//int[] answer = solution(new int [] {1,2,3,4,5});
		//System.out.println(answer);
		
	   

		
	}

	
	public static  int[] solution(int[] numbers) {
		int[] answer = new int[numbers.length];
		
		for(int i =0; i < answer.length; i++) {
			answer[i] = numbers[i] * 2;
			// 배열의 길이만큼 돌리고 X2배 해주면 됨
		}
	    
		
		
		
        return answer;
	}
}



