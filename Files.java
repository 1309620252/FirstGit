import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 1、文件的基本操作：创建、删除、读、写
 * 2、对于大文件的读：读取x.txt的内容并输出
*/
public class Files {
	/*创建文件*/
	public static void createFile(String fileName) throws IOException{
		File file = new File(fileName);
		boolean isExist = file.createNewFile();
		if(isExist)
			System.out.println("file has been created");
		else
			System.out.println("file already exists");
	}
	/*删除文件*/
	public static void deleteFile(String fileName){
		File file = new File(fileName);
		boolean isSuccess = file.delete();
		if(isSuccess)
			System.out.println("file has been deleted");
		else
			System.out.println("file has not been deleted");
	}
	/*读文件(小文件)*/
	public static void readFile(String fileName) throws IOException{
		File file = new File(fileName);
		InputStream in = new FileInputStream(file);
		char[] chars = new char[1024];
		int len = 0;
		for(int i=0;i<1024;i++){
			int x = in.read();
			if(x == -1){
				len = i;
				break;
			}
			chars[i] = (char)x;
		}
		for(int i=0;i<len;i++){
			System.out.print(chars[i]);
		}
		in.close();
	}
	/*写文件*/
	public static void writeFile(String fileName,String str) throws IOException{
		File file = new File(fileName);
		OutputStream out = new FileOutputStream(file);
		for(int i=0;i<str.length();i++){
			char x = str.charAt(i);
			out.write(x);
		}
		out.close();
		System.out.println("content has been written to file");
	}
	/*对于大文件的读：读取x.txt的内容并输出(写入到另一个文件中去)*/
	public static void readBigFile(String readFile,String writeFile) throws IOException{
		FileReader fr = new FileReader(readFile);  //创建FileReader对象，用来读取字符流
		BufferedReader br = new BufferedReader(fr);//缓存指定文件的输入
		FileWriter fw = new FileWriter(writeFile); //创建FileWriter对象，用来写入字符流
		BufferedWriter bw = new BufferedWriter(fw);//将缓存对文件的输出
		String line;                               //line用来读取一行
		while(br.ready()){
			line = br.readLine();
			bw.write(line);
			System.out.println(line);
		}
		bw.flush();
		bw.close();
		br.close();
		fw.close();
		br.close();
		fr.close();
	}
	
	public static void main(String[] args) throws IOException {
		String fileName = "zh.txt";
		String str = "Hello,I am a good student!";
		String readFile = "x.txt";
		String writeFile = "test.txt";
		//createFile("zh.txt");
		//deleteFile("zh.txt");
		//readFile("zh.txt");
		//writeFile(fileName,str);
		readBigFile(readFile,writeFile);
	}

}
