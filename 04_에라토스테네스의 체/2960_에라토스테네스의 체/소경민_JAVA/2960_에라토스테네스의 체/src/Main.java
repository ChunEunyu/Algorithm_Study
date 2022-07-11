import java.util.*;
public class Main {

	public static void main(String[] args) {
		try (Scanner a = new Scanner(System.in)) {
			int N = a.nextInt(); //�ִ�
			int K = a.nextInt(); //K��° �������� ��
			int count=0;
			
			boolean[] visit = new boolean[N+1]; //�湮�迭 ����
			
			for(int i=2;i<N+1;i++) { //�Ҽ� ã��
				for(int j=1;i*j<=N;j++) {
					if(visit[i*j]==false) { //�湮���� ���� false �������� ���� true  
						visit[i*j]=true;
						count++;
					} 
					if(count==K) { //count�� ���鼭 K��° �������� ���� ���
						System.out.println(i*j);
						return ;
					}
				}
			}
			a.close();
		}

	}

}
