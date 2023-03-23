package CodingTest;

public class level0_030 {

	public static void main(String[] args) {
		//짝수의 합
		//정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을 return 하도록 solution 함수를 작성해주세요.
	
		
		//답 확인
		System.out.println(solution(10));
		
		System.out.println(solution(4));
		
		
	
		
		
	
		
	}

	
	public static  int solution(int n) {
		int  answer = 0;
		
		// 반복문으로 짝수일때마다 answer에 더해줘서 값을 구하면 됨.
		for(int i = 0; i < n+1; i++){
            if (i % 2 == 0)
                answer += i;
        }
        
		
		
		        return answer;
		    }
		}



