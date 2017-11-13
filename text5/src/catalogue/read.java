package catalogue;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.*;
 
public class read {
    public read() {
    }
    public static List<File> readfile(String filepath,List<File> l) throws FileNotFoundException, IOException {
            File file = new File(filepath);
            if (file.isDirectory()) {
                String[] filelist = file.list();
                for (int i = 0; i < filelist.length; i++) {
                    File readfile = new File(filepath + "\\" + filelist[i]);
                    if (!readfile.isDirectory()) {
                        l.add(readfile);
                    } else if (readfile.isDirectory()) {
                        l.add(readfile);
                          }
                }
 
            }     
        return l;
    }
    public void read() {
        try {
        	String path="";
        	System.out.println("请输入路径:");
        	 Scanner sc = new Scanner(System.in);
        	 path = sc.nextLine();
        	List<File> l=new ArrayList();
            l=readfile(path,l);
            try{
            	List<File> tmp=new ArrayList();
            	String pathName=".\\目录.txt";
            	File writename=new File(pathName);
            	writename.createNewFile();
            	BufferedWriter out =new BufferedWriter(new FileWriter(writename));
            	for(int i=0;i<l.size();i++) {
            		if(l.get(i).isDirectory()) {
            			tmp.add(l.get(i));
            			l.remove(i);
            		}
            		
            	}
            	ComparatorFile comparator=new ComparatorFile();
            	Collections.sort(tmp, comparator);
            	Collections.sort(l, comparator);
            	for(int i=0;i<tmp.size();i++) {
            		java.text.SimpleDateFormat df = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            		String dateTime=df.format(new Date(+tmp.get(i).lastModified()));
            		out.write("文件夹名:"+tmp.get(i).getName()+" "+"最后修改日期:"+dateTime+"\r\n");
            	}

            	for(int i=0;i<l.size();i++) {
            		java.text.SimpleDateFormat df = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            		String dateTime=df.format(new Date(+l.get(i).lastModified()));
            		out.write("文件名:"+l.get(i).getName()+" "+"最后修改日期:"+dateTime+" "+"大小:"+l.get(i).length()+"\r\n");
            	}
            	out.flush();
            	out.close();
            	}catch(Exception e){
            		e.printStackTrace();
            	}

        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        }
    }
 
}