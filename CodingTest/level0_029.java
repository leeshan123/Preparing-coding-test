package CodingTest;

public class level0_029 {

	public static void main(String[] args) {
		//각도기
		//각에서 0도 초과 90도 미만은 예각, 90도는 직각, 90도 초과 180도 미만은 둔각 180도는 평각으로 분류합니다. 
		// 각 angle이 매개변수로 주어질 때 예각일 때 1, 직각일 때 2, 둔각일 때 3, 평각일 때 4를 return하도록 solution 함수를 완성해주세요.
		
		//답 확인
		System.out.println(solution(70));
		
		System.out.println(solution(91));
		
		System.out.println(solution(180));
	
		
		
	
		
	}

	
	public static  int solution(int angle) {
		int  answer = 0;
		
		// if와 else if 활용
		if( angle == 180)
            answer = 4;
        else if (angle > 90)
            answer = 3;
        else if (angle == 90)
            answer = 2;
        else
            answer = 1;
        
		
		
		        return answer;
		    }
		}



