import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		int M = a.nextInt();
		int N = a.nextInt();
		int count=0;   //�Ҽ��� ����
		for(int i=M;i<=N;i++) { //M��N���� �Ҽ�����
			int x=0;
			if(i==2) {
				count++;
			}
			else {
				for(int j=2;j<i;j++) {
					if(i%j!=0) { 
						x++;
						if(x==i-2) {
							count++;
						}
					}
				}
			}
		}
		
		int[] prime_number = new int[count]; //�Ҽ����� �迭
		int k=0;	   //�Ҽ� �迭�� �ڸ���ȣ
		
		for(int i=M;i<=N;i++) { //�Ҽ�ã�� �迭
			int x=0;
			if(i==2) {
				prime_number[k]=i;
				k++;
			}
			else {
				for(int j=2;j<i;j++) {
					if(i%j!=0) { 
						x++;
						if(x==i-2) {
							prime_number[k]=i;
							k++;
						}
					}
					
				}
			}
		}
		int sum=0;     //�Ҽ����� �� 
		
		for(int j=0;j<count;j++) { //�Ҽ����� �ձ��ϱ�
			sum=prime_number[j]+sum;
		}
		
		if(count==0) {
			System.out.println(-1);
		}
		else{
			System.out.println(sum);
			System.out.println(prime_number[0]);
		}
		a.close();
	}
}
