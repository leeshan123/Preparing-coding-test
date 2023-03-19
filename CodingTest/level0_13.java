package CodingTest;

public class level0_13 {

	public static void main(String[] args) {
		//최빈값구하기
		//못푼 문제
		// 코드가 안돌아감.. 아직 map이나 이런걸 잘 사용 못하겠음 ( 출력값은 맞게 나오나 프로그래머스에서 틀리다고 뜸)
	
		int answer1 = solution(new int [] { 1,2,3,3,3,4});
		System.out.println(answer1);
		
		int answer2 = solution(new int [] { 1,1,2,2});
		System.out.println(answer2);
		
		int answer3 = solution(new int [] { 1});
		System.out.println(answer3);
		
		

		
	}

	
	public static  int solution(int[] array) {
		
		// 배열 정렬시켜주기
		for(int i = 0; i<array.length; i++) {
			for(int j = i; j<array.length; j++) {
				if(array[j] < array[i]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		int answer = 0;
		int max = 0;
		int maxNum = array[0];
		int count = 1;
		
		// 정렬한 값이 같으면 cnt를 높혀서 그게 가장 높을때의 값을 maxNum에 저장하여 값을 출력
		// cnt == max가 같으면 -1을 출력
		// 아니라면 1을 출력
		for(int i = 1; i< array.length; i++) {
			if(array[i] == array[i-1]) {
				count++;
				if(count > max) {
					max = count;
					maxNum = array[i];
				}
				else if(count == max) {
					maxNum = -1;
				}
				
				}
			else{
				count =1;
			}
		}
		
		answer = maxNum;
		
		
        return answer;
	}
}



