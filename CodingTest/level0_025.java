package CodingTest;

public class level0_025 {

	public static void main(String[] args) {
		// 짝수 홀수 갯수
		//정수가 담긴 리스트 num_list가 주어질 때, num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
		
		//답 확인
		int [] answer1 = solution (new int[]{1,2,3,4,5});
		for(int i=0; i<answer1.length; i++)
			System.out.println(answer1[i]);
		
		int [] answer2 = solution (new int[]{1,3,5,7});
		for(int i=0; i<answer2.length; i++)
			System.out.println(answer2[i]);
		
	
		
	}

	
	public static  int[] solution(int[] num_list) {
		int  [] answer = new int[2];
		//넣어놓을 공간이 두개가 필요함
		
		for(int i = 0; i<num_list.length; i++) {
			if(num_list[i]%2 == 0)
				answer[0]++;
			else
				answer[1]++;
			// 짝수면 answer[0]에 +1을 홀수면 answer[1]dp +1을 해주면ㄷ 됨
				
		}
		return answer;
		    }
		}



