package IO;
import java.io.*;
import java.util.*;
public class copy {
public void Copy() {
 	File directory = new File(".");
 	String filename="dest.txt";
 	String line="";
     String path = null; 
     try{
			File file = new File(".\\src.txt");
			InputStreamReader reader = new InputStreamReader(new FileInputStream(file));
			BufferedReader br = new BufferedReader(reader);
			File writename=new File(".\\dest.txt");
	     	writename.createNewFile();
	     	BufferedWriter out =new BufferedWriter(new FileWriter(writename));
	     	System.out.println("dest.txtÖÐµÄÄÚÈÝ:");
			while((line=br.readLine())!=null) {
				out.write(line);
				System.out.println(line);
			}
			br.close();
			out.flush();
	     	out.close();
		}catch(Exception e){
			e.printStackTrace();
		}
         
     
}
}
