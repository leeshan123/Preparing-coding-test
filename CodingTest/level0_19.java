package CodingTest;

public class level0_19 {

	public static void main(String[] args) {
		// 옷가게 할인
		
		//답 확인
		System.out.println(solution(150000));
		
		System.out.println(solution(580000));
		
		
		
		
		
	
		
	}

	
	public static  double solution(int price) {
		int answer = 0;
       
        
	    // 반복문으로 푸는데 더 포괄적(?)인 값일수록 밑으로 내려야함(주의!)
		// 또한 int로 price 값을 지정하지 않으면 오류가남. answer값이 int 기 때문에
		if (price >= 500000)
			answer = (int)(price * 0.8);
		else if (price >= 300000)
			answer = (int)(price * 0.9);
		else if (price >= 100000)
			answer = (int)(price * 0.95);
		else
            answer = price;
		
		        return answer;
		    }
		}



