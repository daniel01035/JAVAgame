package ÀÉ®×;
import java.util.*;
import java.io.*;
public class file {
	public static void main(String[] args) throws IOException{
       	PrintWriter file=new PrintWriter("D://test.txt");
       	file.println("123");
       	file.println("abc");
       	file.close();
       	FileReader fr = new FileReader("D://test.txt");
       	BufferedReader br = new BufferedReader(fr);
       	while (br.ready()) {
       		System.out.println(br.readLine());
        }
	}
}
