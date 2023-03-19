package CodingTest;

public class level0_16 {

	public static void main(String[] args) {
		//피자 나눠먹기 2
		
		//답 확인
		System.out.println(solution(6));
		
		System.out.println(solution(10));
		
		System.out.println(solution(4));
		
		
		
	
		
	}

	
	public static  int solution(int n) {
		int answer = 0;
		
		// 6 x i(판수) 를 n으로 나눴을때 0이 되면 그게 정답이기 때문에 이렇게 반복문으로 풀었다.
		for(int i = 1; i<=6 *n; i++) {
			if(6*i % n ==0) {
				answer = i;
				break;
			}
		}
		
		
		
		
        return answer;
	}
}



