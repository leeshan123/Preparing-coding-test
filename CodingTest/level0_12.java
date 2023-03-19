package CodingTest;

public class level0_12 {

	public static void main(String[] args) {
		//중앙값구하기
		
		//답확인
		int answer1 = solution(new int [] { 1, 2, 7, 10, 11});
		System.out.println(answer1);
		
		int answer2 = solution(new int [] {9, -1, 0});
		System.out.println(answer2);
		
		

		
	}

	
	public static  int solution(int[] array) {
		int answer = 0;
	
		//sort 써도 되는데 일단 연습해야하니까 반복문 사용
		// 비교해서 앞에께 뒤에 보다 값이 크면 앞에껄 뒤로 정렬시키기
		for(int i = 0; i<array.length; i++) {
			for(int j = i; j<array.length; j++) {
				if (array[j] < array[i]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		answer = array[array.length / 2 ];
		
		
        return answer;
	}
}



