package CodingTest;

public class level0_18 {

	public static void main(String[] args) {
		//배열의 평균값
		
		//답 확인
		System.out.println(solution(new int[] {1,2,3,4,5,6,7,8,9,10}));
		
		System.out.println(solution(new int[] {89,90,91,92,93,94,95,96,97,98,99}));
		
		
		
		
		
	
		
	}

	
	public static  double solution(int[] numbers) {
		double answer = 0;
        double sum = 0;
        
	    // 배열의 합을 구하기 위해서 반복문을 돌려서 합을 만들어준다.
        // 평균을 구하기 위해서 sum에 배열의 크기만큼 나눠준 값을 asnwer에 집어 넣어서 풀면 됨.
        for(int i =0; i < numbers.length; i++) {
        	sum+= numbers[i];
        }
        answer = sum/ numbers.length;
	        
		
		        return answer;
		    }
		}



