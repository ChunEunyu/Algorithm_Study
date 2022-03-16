import java.util.*;
public class Main {
	public static void main(String[] args) {
		try (Scanner a = new Scanner(System.in)) {
			int N = a.nextInt();
			int [] arr = new int[N];
			int max = 1; 
			for(int i=0;i<N;i++) { //���� ����
				arr[i]=a.nextInt();
			}
			for(int i=0;i<N;i++) { //�������� ���� ū �� ã�� 
				if(arr[i]>max) {
					max = arr[i];
				}
			}
			
			int[] visit = new int[max+1]; //�湮�迭 ����
			
			for(int i=2;i<max+1;i++) {  //���� ū �� �Ʒ��� �Ҽ��� ã��
				for(int j=1;i*j<=max;j++) {
						visit[i*j]++;
				}
			}
			int count=0;
			for(int i=2;i<max+1;i++) {
				if(visit[i]==1) {
					for(int j=0;j<N;j++) { //arr�迭���� �Ҽ� ���� ã��
						if(arr[j]==i) {
							count++;
							break;
						}
					}
				}
			}
			int[] prime_number = new int[count]; //�Ҽ�������ŭ�� �Ҽ��迭 ����
			int k=0;
			for(int i=2;i<max+1;i++) { 
				if(visit[i]==1) {
					for(int j=0;j<N;j++) {
						if(arr[j]==i) {
							prime_number[k]=i;
							k++;
							break;
						}
					}
				}
			}
			if(k==0) { //�Ҽ��� ���� ���
				System.out.println("-1");
			}
			else if(k==1) { //�Ҽ��� �� ���� ���
				System.out.println(prime_number[0]);
			}
			else { //������ ���
				int Mul=1;
			
				for(int i=0;i<count;i++) {
					Mul=Mul*prime_number[i];
					}
				System.out.println(Mul);
				}
			a.close();
		}

	}

}