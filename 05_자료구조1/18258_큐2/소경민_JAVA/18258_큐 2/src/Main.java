import java.util.Queue;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Scanner;
import java.io.BufferedWriter;	
import java.io.IOException;	
import java.io.OutputStreamWriter;	
public class Main {

	public static void main(String[] args) throws IOException {
		Scanner a = new Scanner(System.in);
		Queue<Integer> queue = new LinkedList<>();
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = a.nextInt();  //�m�ɾ��� ����
		int[] print = new int[N];  //����Ʈ �迭 ����
		int count=0;  //����Ʈ �迭 ���Ұ���
		
		int tail = 0; //ť�� ��������
		
		for(int i=0;i<N;i++) {
			String str = a.next(); //��ɾ� �Է�
			switch (str) {  //��ɾ ���� case��
			case "push":
				int x=a.nextInt();
				queue.add(x);
				tail=x;
				break;
			case "pop":
				if(queue.isEmpty()) {
					print[count]=-1;
					count++;
					break;
				}
				else {
					print[count]=queue.poll();
					count++;
					break;
				}
			case "size":
				if(queue.isEmpty()) {
					print[count]=0;
					count++;
					break;
				}
				else {
					print[count]=queue.size();
					count++;
					break;
				}
			case "empty":
				if(queue.isEmpty()) {
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
				if(queue.isEmpty()) {
					print[count]=-1;
					count++;
					break;
				}
				else {
					print[count]=queue.peek();
					count++;
					break;
				}
			case "back":
				if(queue.isEmpty()) {
					print[count]=-1;
					count++;
					break;
				}
				else {
					print[count]=tail;
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
