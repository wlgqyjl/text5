package IO;
import java.util.*;
import java.io.*;

public class write {
public  void write(){
	File directory = new File(".");
	String filename="scr.txt";
	String path = null;
	try{
	File writename=new File(".\\src.txt");
	writename.createNewFile();
	BufferedWriter out=new BufferedWriter(new FileWriter(writename));
	String info="";
	System.out.print("����src.txt�е�����:");
	 Scanner sc = new Scanner(System.in);
	 info = sc.nextLine();
	 out.write(info);
	out.flush();
	out.close();
	}catch(Exception e){e.printStackTrace();}
}
}
