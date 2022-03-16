import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int M = a.nextInt(); //�ּڰ�
		int N = a.nextInt(); //�ִ�
		
		int[] visit = new int[N+1]; //�湮�迭 ����
		
		for(int i=2;i<N+1;i++) {  //���� ū �� �Ʒ��� ��� �Ҽ��� ã��
			for(int j=1;i*j<=N;j++) {
					visit[i*j]++;
			}
		}
		int count=0;
		for(int i=M;i<N+1;i++) { //�ּڰ� ���� �ִ񰪻����� �Ҽ� ���� ã��
			if(visit[i]==1) {
				count++;
			}
		}
		int[] prime_number = new int[count]; //�Ҽ����� ũ�� ��ŭ�� �迭 ����
		int k=0;
		for(int i=M;i<N+1;i++) { //
			if(visit[i]==1) {
				prime_number[k]=i;
				k++;
			}
		}
		for(int i=0;i<count;i++) {
			System.out.println(prime_number[i]);
		}
		a.close();
	}

}
