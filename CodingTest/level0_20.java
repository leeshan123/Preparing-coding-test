package CodingTest;

public class level0_20 {

	public static void main(String[] args) {
		// 아이스 아메리카노
		
		//답 확인
		int[] answer1 = solution(5500);
		for(int i=0; i< answer1.length; i++) {
			System.out.println(answer1[i]);
		}
		
		int[] answer2 = solution(15000);
		for(int i=0; i< answer2.length; i++) {
			System.out.println(answer2[i]);
		}
		
		
	
		
		
		
		
		
	
		
	}

	
	public static  int[] solution(int money) {
		int [] answer = new int[2];
		
		// answer[0] 값에는 5500을 나눈 몫을 입력 / answer[1]는 나머지 값을 입력
		answer[0] = money /5500;
		answer[1] = money % 5500;
		
		
		        return answer;
		    }
		}



