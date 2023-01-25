import java.io.*;

public class Main {
public static void main(String args[]) throws IOException {
     
	//br에 연결되는 문자입력 버퍼스트림 생성
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	//bw에 연결되는 문자출력 버퍼스트림 생성 
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	int n = Integer.parseInt(br.readLine());
	
	for (int i = 0; i < n; i++) {
		String string = br.readLine();
		//첫번째 수[0]와 두번째 수[1]를 나눔(split)
		int a = Integer.parseInt(string.split(" ")[0]);
		int b = Integer.parseInt(string.split(" ")[1]);
		
		bw.write(a+b+"\n");
	}
	//남아있는 데이터를 모두 출력시킴 
	bw.flush();
}
}