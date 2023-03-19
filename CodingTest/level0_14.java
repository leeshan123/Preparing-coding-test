package CodingTest;

public class level0_14 {

	public static void main(String[] args) {
		//짝수는 싫어요
		
		//답 확인
		int[] answer1 = solution(10);
		for(int i =0;  i < 5; i++) 
			System.out.println(answer1[i]);
		
		int[] answer2 = solution(15);
		for(int i =0;  i < 8; i++) 
			System.out.println(answer1[i]);
		
		
		
	
		
	}

	
	public static  int[] solution(int n) {
		int [] answer = {};
		int k = 0;
		
		// 배열의 크기 잡아주기 짝수면 n/2 홀수면 n/2에 +1 추가.
		if(n%2 == 0) {
			answer = new int[n / 2];
			
		} else {
			answer = new int[n/2 + 1];
		}
		
		//k 이용해서 홀수 값을 int [] answer 배열에 넣기.
		for(int i = 0; i<=n; i++) {
			if(i % 2 ==1) {
				answer[k] = i;
				k++;
			}
		}
		
		
		
		
        return answer;
	}
}



