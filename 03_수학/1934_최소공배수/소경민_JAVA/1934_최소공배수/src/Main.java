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
		int[] gcdArray = new int[N];
		int[][] arr = new int[N][2];
		for(int i=0;i<N;i++) {
			arr[i][0]=a.nextInt();
			arr[i][1]=a.nextInt();
			gcdArray[i]=Euclidean(arr[i][0],arr[i][1]);
		} 
		
		for(int i=0;i<N;i++) {//�μ��� ��/�ִ�����=�ּҰ����
			System.out.println((arr[i][0]*arr[i][1])/gcdArray[i]);
		}
		
		a.close();


	}

}
