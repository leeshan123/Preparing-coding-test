package CodingTest;

public class level0_022 {

	public static void main(String[] args) {
		// 배열 뒤집기
		//정수가 들어 있는 배열 num_list가 매개변수로 주어집니다. 
		// num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return하도록 solution 함수를 완성해주세요.
		
		//답 확인
		int answer1 [] = solution(new int[]{1,2,3,4,5});
		System.out.println(answer1);
		
		int answer2 [] = solution(new int[]{1,1,1,1,1,2});
		System.out.println(answer1);
		
		int answer3 [] = solution(new int[]{1,0,1,1,1,3,5});
		System.out.println(answer1);
		
	
		
	}

	
	public static  int [] solution(int[] num_list) {
		int  [] answer = new int[num_list.length] ;
		
		for(int i =0; i < num_list.length; i++) {
			answer[i] = num_list[num_list.length -i-1];
		}
		// 여기서num_list.length -i에 -1을 해줘야함. 배열은 0 부터 시작하기 때문에
		for(int i =0; i < num_list.length; i++)
			System.out.println(answer[i]);
		
		        return answer;
		        //리턴 값때문에 주소값이 나옴
		        
		    }
		}



