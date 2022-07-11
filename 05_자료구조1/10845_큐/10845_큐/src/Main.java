import java.io.BufferedWriter;	
import java.io.IOException;	
import java.io.OutputStreamWriter;	
import java.util.*;	
public class Main {		
	
	public static void main(String[] args) throws IOException{
		
		Scanner a = new Scanner(System.in);
		
		int N = a.nextInt();  //�m�ɾ��� ����
		int[] queue = new int[N]; //ť �迭 ����
		int push_index = -1;  //ť���� Ǫ���� ���� ��ȣ
		int pop_index = 0;    //ť���� ���� ���� ��ȣ
		int size=0;	//ť���� ��ȣ
		int[] print = new int[N];  //����Ʈ �迭 ����
		int count=0;  //����Ʈ �迭 ���Ұ���
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		for(int i=0;i<N;i++) {
			String str = a.next(); //��ɾ� �Է�
			switch (str) {  //��ɾ ���� case��
			case "push":
				push_index++;
				queue[push_index]=a.nextInt();
				size++;
				break;
			case "pop":
				if(size==0) {
					print[count]=-1;
					count++;
					break;
				}
				else {
					print[count]=queue[pop_index];
					queue[pop_index]=0;
					count++;
					pop_index++;
					size=push_index-pop_index+1;
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
			case "front":
				if(size==0) {
					print[count]=-1;
					count++;
					break;
				}
				else {
					print[count]=queue[pop_index];
					count++;
					break;
				}
			case "back":
				if(size==0) {
					print[count]=-1;
					count++;
					break;
				}
				else {
					print[count]=queue[push_index];
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
