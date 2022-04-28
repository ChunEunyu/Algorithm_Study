import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int T = a.nextInt(); //�Է� �������� ��
		String[] str = new String[T]; //���ڿ� �迭 ����
		
		for(int i=0;i<T;i++) {
			str[i]=a.next();
		}
		
		int size=0;
		
		for(int i=0;i<T;i++) {
			String[] stack = new String[str[i].length()];  //���ڿ��� ���� ��ŭ�� ���� ����
			String[] arr = str[i].split("");  //�Է¹��� ���ڿ��� �ѱ��ھ� ����
			
			loop:  //for���� �̸�
			for(int j=0;j<str[i].length();j++) {
				switch(arr[j]) {  //switch�� ���
				case "(":         //�Է¹��� ��ȣ�� '('�̸� ���ÿ� �״µ� ���� ���������� ���� ��ȣ�� '('��� NO�� ���
					stack[size]=arr[j];
					size++;
					if(j==str[i].length()-1) {
						System.out.println("NO");
						break loop;
					}
					break;
				case ")":        //�Է¹��� ��ȣ�� ')'�� ��� ������ ��������� NO�� ����ϰ� �ƴϸ� ���ÿ� �ִ� '('�ϳ��� ����µ� ������ ����ְ� ���̻��� �Է� ���� ��ȣ�� ���ٸ� YES�� ��� �ƴϸ� NO�� ��� 
					if(stack[0]==null) {
						System.out.println("NO");
						break loop;
					}
					stack[size-1]=null;
					size=size-1;
					if(stack[0]==null && j==str[i].length()-1) {
						System.out.println("YES");
						break loop;
					}
					else if(stack[0]!=null && j==str[i].length()-1) {
						System.out.println("NO");
						break loop;
					}
					break;
				}
			}
			size=0;  //size�ʱ�ȭ
		 }
		a.close();

	}

}
