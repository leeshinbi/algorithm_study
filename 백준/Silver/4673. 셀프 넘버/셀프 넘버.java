public class Main {
 
	public static void main(String[] args) {
 
		boolean[] x = new boolean[10001];	// 1~10000의 수 
 
		for (int i = 1; i < 10001; i++){
			//boolean 배열의 인덱스를 사용하여 해당 위치를 true로 바꿈
			//d 함수 사용한 값을 n이라 함
			int n = d(i); 
		
			if(n < 10001){	// 10000 이 넘는 수는 필요가 없음
				x[n] = true;
			}
		}
 
        
		for (int i = 1; i < 10001; i++) {
			if (x[i]==false) {	// false 인 인덱스만 출력
				System.out.println(i);
			}
		}
	}

	public static int d(int number){ //d 함수 생성
		int sum = number;
    
		while(number != 0){
			sum = sum + (number % 10); // 첫 째 자리수
			number = number/10;	// 10을 나누어 첫 째 자리를 없앤다
		}
    
		return sum;
	}
} 