package CodingTest;

public class level0_037 {

	public static void main(String[] args) {
		// 틀린문제(풀이는 o , 테스트도 o , 근데 제출했을때 테스트 실패가 나옴)
		//구슬을 나누는 경우의 수
		// 머쓱이는 구슬을 친구들에게 나누어주려고 합니다. 구슬은 모두 다르게 생겼습니다
		// 머쓱이가 갖고 있는 구슬의 개수 balls와 친구들에게 나누어 줄 구슬 개수 share이 매개변수로 주어질 때, 
		//balls개의 구슬 중 share개의 구슬을 고르는 가능한 모든 경우의 수를 return 하는 solution 함수를 완성해주세요.
		
		
		//답 확인
		System.out.println(solution(3, 2));
		System.out.println(solution(5,3));
	
		
		
	
		
	}

	
	public static  int solution(int balls, int share) {
		
		// 경우의 수 공식을 이용해서 풀었는데 틀렸다고 나옴.. 테스트 답은 잘나옴
		 int answer = 0;
	        int n=1;
	        int nm=1;
	        int m = 1;
	        
	        for(int i = 1; i <=balls; i++){
	            n = n*i;
	        }
	        
	        for(int j = 1; j <= balls-share; j++){
	            nm = nm*j;
	        }
	        
	        for(int k = 1; k <=share; k++){
	            m = m*k;
	        }
	       
	        int a = nm * m;
	        answer = n / a;
	       
		
		        return answer;
		    }
		}



