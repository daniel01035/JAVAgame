package 檔案;
import java.util.*;
import java.io.*;
public class 檔案 {
	public static void main(String[] args) throws IOException{
		PrintWriter file = new PrintWriter("D://BMI紀錄表.txt");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入1開始:");
		file.write("姓名\tBMI值\r\n");
		while(sc.hasNext()){
			String num = sc.next();
			if(num.equals("1")){
				System.out.println("請輸入姓名:");
				String name = sc.next();
				System.out.println("請輸入身高(公尺):");
				double m,kg,BMI;
				m=sc.nextDouble();
				System.out.println("輸入體重(公斤):");
	            kg=sc.nextDouble();
	            BMI = kg/(m*m);
	            System.out.printf("您的BMI是%.2f\r\n",BMI);
	            System.out.println(BMI < 18.5 ? "太瘦了哦":BMI >= 24 ? "有點過重喔":"不錯，剛剛好~請繼續保持");
	            System.out.println("要繼續測試請輸入1，不測試請按任意鍵");
	            file.printf("%s\t%.2f\r\n",name,BMI);
			}
			else{
				break;
			}
		}
		file.close();
		
		BufferedReader br = new BufferedReader(new FileReader("D://BMI紀錄表.txt"));
		while(br.ready()){
			System.out.println(br.readLine());
		}
	}
}