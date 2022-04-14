import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException{ //���۶����� ���
		Scanner a = new Scanner(System.in);
		
		int N = a.nextInt();  //�m�ɾ��� ����
		int[] stack = new int[N]; //���� �迭 ����
		int size=0;	//���ÿ��� ��ȣ
		int[] print= new int[N];  //����Ʈ �迭 ����
		int count=0;  //����Ʈ �迭 ���Ұ���
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		for(int i=0;i<N;i++) {
			String str = a.next(); //��ɾ� �Է�
			switch (str) {  //��ɾ ���� case��
			case "push":
				stack[size]=a.nextInt();
				size++;
				break;
			case "pop":
				if(size==0) {
					print[count]=-1;
					count++;
					break;
				}
				else {
					print[count]=stack[size-1];
					count++;
					stack[size-1]=0;
					size=size-1;
					break;
				}
			case "size":
				if(size==0) {
					print[count]=0;
					count++;
					break;
				}
				else {
					print[count]=size;
					count++;
					break;
				}
			case "empty":
				if(size==0) {
					print[count]=1;
					count++;
					break;
				}
				else {
					print[count]=0;
					count++;
					break;
				}
			case "top":
				if(size==0) {
					print[count]=-1;
					count++;
					break;
				}
				else {
					print[count]=stack[size-1];
					count++;
					break;
				}
				
			}			
			
		}
		for(int i=0;i<count;i++) {  //��ɾ ���� ��°��� ����Ʈ�迭�� ����
			bw.write(print[i]+"\n");
		}
		
		bw.flush();  //�ѹ��� ���
		a.close();
		
	}

}
