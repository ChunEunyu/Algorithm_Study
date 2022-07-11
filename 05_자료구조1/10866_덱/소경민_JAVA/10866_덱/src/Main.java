import java.io.IOException;
import java.util.*;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;	
public class Main {

	public static void main(String[] args) throws IOException{
		Scanner a = new Scanner(System.in);
		int N = a.nextInt();  //�m�ɾ��� ����
		int[] Deque = new int[2*N+1]; //�� �迭 ����
		int front_index = N;  //������ ���� �ǹ��ϴ� ���� ��ȣ(�� �迭�� �߰����� ����)
		int back_index = N;    //������ �ڸ� �ǹ��ϴ� ���� ��ȣ(�� �迭�� �߰����� ����)
		int size=0;			//���� ���� ����
		int[] print = new int[N];  //����Ʈ �迭 ����
		int count=0;  	//����Ʈ �迭 ���Ұ���
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		for(int i=0;i<N;i++) {
			String str = a.next(); //��ɾ� �Է�
			switch (str) {  //��ɾ ���� case��
			case "push_front":
				if(size==0) {
					Deque[front_index]=a.nextInt();
					size++;
				}
				else {
					front_index--;
					Deque[front_index]=a.nextInt();
					size++;
				}
				break;
			case "push_back":
				if(size==0) {
					Deque[front_index]=a.nextInt();
					size++;
				}
				else{
					back_index++;
					Deque[back_index]=a.nextInt();
					size++;
				}
				break;
			case "pop_front":
				if(size==0) {
					print[count]=-1;
					count++;
					break;
				}
				else {
					print[count]=Deque[front_index];
					Deque[front_index]=0;
					count++;
					size--;
					if(back_index==front_index) {
						break;
					}
					else {
						front_index++;
						break;
					}
				}
			case "pop_back":
				if(size==0) {
					print[count]=-1;
					count++;
					break;
				}
				else {
					print[count]=Deque[back_index];
					Deque[back_index]=0;
					count++;
					size--;
					if(back_index==front_index) {
						break;
					}
					else {
						back_index--;
						break;
					}
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
					print[count]=Deque[front_index];
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
					print[count]=Deque[back_index];
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
