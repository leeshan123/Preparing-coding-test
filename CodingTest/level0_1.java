package CodingTest;

public class level0_1 {

	public static void main(String[] args) {
		
		//중복된 숫자 개수
		
		int [] arr = {1, 1, 2, 3, 4, 5};
		int n = 1;
		
		int answer = solution(arr,n);
		System.out.println(answer);
		//답확인
		
		int [] arr1 = {0,2,3,4};
		int n1 = 1;
		int answer1 = solution(arr1,n1);
		System.out.println(answer1);
		//답확인

	}
	
	 public static int solution(int[] array, int n) {
	        int answer = 0;
	        
	        for(int i = 0; i < array.length ; i++){
	            if(array[i] == n){
	                answer ++;
	            }
	        }
	        // n이랑 array의 배열이 같으면 answer을 증가 시켜서 문제를 품
	        
	        
	        
	        return answer;
	    }
	}
	
	
	



   
