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
		// other for 문 은 위 for문의 -i-1 '-1' 이라는 값 소거가능.
	 	// for ( int i = num_list.length ; i >= 0 ; i-- ) {
		//	answer[num_list.length-i] = num_list[i];
		// }
		// other for 문
		
		// 여기서num_list.length -i에 -1을 해줘야함. 배열은 0 부터 시작하기 때문에
		for(int i =0; i < num_list.length; i++)       //  <-- 위에 for문은 for문 안에 로직이 1줄이여도 { } 를 감싸줬는데 왜 여기에선 안 감쌋는지?
			System.out.println(answer[i]);
		
		        return answer;
		        //리턴 값때문에 주소값이 나옴         // <-- 리턴 값 '떄문에'가 아니라 리턴 값을 배열자체로 하니깐 배열의 주소가 print 되는것임
		        
		    }
		}
		
	}


