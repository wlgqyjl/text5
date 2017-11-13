package catalogue;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.*;
public class ComparatorFile implements Comparator{
	public int compare(Object obj0, Object obj1) {
		 File t1=(File)obj0;
		 File t2=(File)obj1;
		 if(t1.getName().compareTo(t2.getName())==1)
			 return 1;
		 else if(t1.getName().compareTo(t2.getName())==0)
			 return 0;
		 return -1;
	}

}
