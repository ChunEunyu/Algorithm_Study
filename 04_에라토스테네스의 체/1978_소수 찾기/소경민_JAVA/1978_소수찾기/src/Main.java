import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int N = a.nextInt();
		int [] arr = new int[N];	//arr�迭 ����
		int count=0;
		for(int i=0;i<N;i++) {	//���� �Է�
			arr[i]=a.nextInt();
		}
		
		for(int j=0;j<N;j++) {	//2�� ������ ��� �ڿ����߿� 2���� arr�迭�� �ڱ� �ڽŰ� �� ���� ��� ���� �������� ������� ������ ������ ������ ���ٸ� �Ҽ��̴�.
			int x =0;
			if(arr[j]==2) {
				count++;
			}
			for(int i =2;i<arr[j];i++) {	//�Ҽ� ���� ã��
				if(arr[j]%i!=0) {
					x++;
					if(x==arr[j]-2) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
		
		a.close();
	}

}
