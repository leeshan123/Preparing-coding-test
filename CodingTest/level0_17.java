package CodingTest;

public class level0_17 {

	public static void main(String[] args) {
		//피자 나눠먹기 3
		
		//답 확인
		System.out.println(solution(7,10));
		
		System.out.println(solution(4,12));
		
		
		
		
		
	
		
	}

	
	public static  int solution(int slice, int n) {
		int answer = 0;
		
		// n명의 사람이 slice 조각으로 자른 피자를 한조각씩 먹으려면 딱 맞으면 n/slice 딱 안맞으면 n/slice에 +1만 해주면 된다.
		 if ( n % slice == 0)
	            answer = n / slice;
	        else
	            answer = n / slice + 1;
	        
	        
		
		        return answer;
		    }
		}



