package �ɮ�;
import java.util.*;
import java.io.*;
public class �ɮ� {
	public static void main(String[] args) throws IOException{
		PrintWriter file = new PrintWriter("D://BMI������.txt");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�п�J1�}�l:");
		file.write("�m�W\tBMI��\r\n");
		while(sc.hasNext()){
			String num = sc.next();
			if(num.equals("1")){
				System.out.println("�п�J�m�W:");
				String name = sc.next();
				System.out.println("�п�J����(����):");
				double m,kg,BMI;
				m=sc.nextDouble();
				System.out.println("��J�魫(����):");
	            kg=sc.nextDouble();
	            BMI = kg/(m*m);
	            System.out.printf("�z��BMI�O%.2f\r\n",BMI);
	            System.out.println(BMI < 18.5 ? "�ӽG�F�@":BMI >= 24 ? "���I�L����":"�����A���n~���~��O��");
	            System.out.println("�n�~����սп�J1�A�����սЫ����N��");
	            file.printf("%s\t%.2f\r\n",name,BMI);
			}
			else{
				break;
			}
		}
		file.close();
		
		BufferedReader br = new BufferedReader(new FileReader("D://BMI������.txt"));
		while(br.ready()){
			System.out.println(br.readLine());
		}
	}
}