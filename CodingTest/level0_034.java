package CodingTest;

public class level0_034 {

	public static void main(String[] args) {
		// 순서쌍의 개수
		//순서쌍이란 두 개의 숫자를 순서를 정하여 짝지어 나타낸 쌍으로 (a, b)로 표기합니다.
		// 자연수 n이 매개변수로 주어질 때 두 숫자의 곱이 n인 자연수 순서쌍의 개수를 return하도록 solution 함수를 완성해주세요.
		
		//답 확인
		System.out.println(solution(20));
		
		System.out.println(solution(100));
		
		
	
		
		
	
		
	}

	
	public static int solution(int n) {
		
		int answer = 0;
        int count = 0;
        
        //n값을 i로 나눴을때 나머지가 0이면 count를 높혀줌
        for(int i = 1; i <=n; i++){
            if(n % i == 0){
                count++;
            }
        }
        answer = count;
        
		
	
		
		        return answer;
		    }
		}



