package CodingTest;

public class level0_033 {

	public static void main(String[] args) {
		// 진료 순서 정하기
		//외과의사 머쓱이는 응급실에 온 환자의 응급도를 기준으로 진료 순서를 정하려고 합니다.
		// emergency가 매개변수로 주어질 때 응급도가 높은 순서대로 진료 순서를 정한 배열을 return하도록 solution 함수를 완성해주세요.
		
		//답 확인
		int [] answer1 =solution(new int[]{3,76,24});
		for(int i=0; i<answer1.length; i++)
			System.out.println(answer1[i]);
		
		int [] answer2 =solution(new int[]{1,2,3,4,5,6,7});
		for(int i=0; i<answer2.length; i++)
			System.out.println(answer2[i]);
		
	
		
		
	
		
	}

	
	public static int[] solution(int[] emergency) {
		
		//answer 배열의 크기를 설정
		int[] answer = new int [emergency.length];
		
		// 반복문을 이용하여 answer[i]를 더해줘서 풀이
		for(int i =0; i < emergency.length ; i++){
            for(int j = 0; j < emergency.length; j++){
                if(emergency[i]< emergency[j])
                    answer[i]++;
            }
             answer[i]++;
        }
		
		
	
		
		        return answer;
		    }
		}



