package CodingTest;

public class level0_2 {

	public static void main(String[] args) {
		
		//머쓱이보다 키 큰사람
		
		int [] arr1 = {149, 180, 192, 180};
		int height1 = 167;
		int answer1 = solution(arr1,height1);
		
		System.out.println(answer1);
		//정답확인
		
		int [] arr2 = {180, 120, 140};
		int height2 = 190;
		int answer2 = solution(arr2,height2);
	
		System.out.println(answer2);
		//정답 확인
		
		
		
	

	}
	public static int solution(int[] array, int height) {
        int answer = 0;
        
        for(int i=0; i< array.length ; i++){
            if(array[i] > height){
                answer++;
            }
        }
        //if 문으로 머쓱이보다 키가 크면 answer을 +1해줌
       
        
        return answer;
    }
}


