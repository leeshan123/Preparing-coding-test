package CodingTest;

public class level0_038 {

	public static void main(String[] args) {
		//가위 바위 보
		// 가위는 2 바위는 0 보는 5로 표현합니다. 가위 바위 보를 내는 순서대로 나타낸 문자열 rsp가 매개변수로 주어질 때,
		// rsp에 저장된 가위 바위 보를 모두 이기는 경우를 순서대로 나타낸 문자열을 return하도록 solution 함수를 완성해보세요.
		
		
		//답 확인
		System.out.println(solution("2"));
		System.out.println(solution("205"));
	
		
		
	
		
	}

	
	public static  String solution(String rsp) {
		String answer = "";
		
		// 비교해서 0 -> 5로 / 2 -> 0 ,  5 ->2 로 리턴함.
        for(int i =0; i<rsp.length(); i++){
            if(rsp.substring(i,i+1).equals("2"))
                answer += "0";
            else if(rsp.substring(i,i+1).equals("5"))
                answer += "2";
            else if(rsp.substring(i,i+1).equals("0"))
                answer += "5";

        }
		
		        return answer;
		    }
		}



