import java.util.*;

public class Main {
	public static int Euclidean(int a,int b){ //�ִ����� ���ϱ�
	     int r = a % b;
	     if (r == 0)
	         return b;
	     else
	         return Euclidean(b,r);
	}
	
	
	
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		int N = a.nextInt();
		int[] arr= new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=a.nextInt();
		}
		
		int Gcd = Euclidean(arr[0],arr[1]); //N�� 2�̻��̱� ������
		
		if(N>=3) {
			for(int i=2;i<N;i++) {
				Gcd=Euclidean(arr[i],Gcd);
			}
		}
		
		for(int i=1; i<Gcd+1; i++){//�ִ������� ���
            if((Gcd%i)==0){
                System.out.println(i);
                
            }
		}
	a.close();
	}
	
	}
