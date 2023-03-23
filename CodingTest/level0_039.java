package CodingTest;

public class level0_039 {

	public static void main(String[] args) {
		// 점의 위치 구하기
		//사분면은 한 평면을 x축과 y축을 기준으로 나눈 네 부분입니다. 사분면은 아래와 같이 1부터 4까지 번호를매깁니다.
		
		
		//답 확인
		System.out.println(solution(new int []{2,4}));
		
		System.out.println(solution(new int []{-7,9}));
		
	
		
		
	}

	
	public static int solution(int[] dot) {
		
int answer = 0;
        
// if를 이용해서 사분면만 체크해주면 됨
        if (dot[0] > 0){
            if(dot[1] > 0)
                answer = 1;
            else
                answer = 4;
        }
        else if(dot[0] < 0){
            if(dot[1]>0)
                answer = 2;
            else
                answer = 3;
        }
		
	
		
		        return answer;
		    }
		}



