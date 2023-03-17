import java.io.*;

public class extFilter implements FilenameFilter
{
	String ext;

public extFilter(String e)
	{
	ext = e;	
	}

	public boolean accept(File dir,String name)
	{
		return name.endsWith(ext);
	}
}

class check
{
	public static void main(String args[])
	{
	File fname = new File(args[0]);
	String extension = ".txt";

	if(fname.isDirectory())
	{
	FilenameFilter filt = new extFilter(extension);
	
	String[] file_list = fname.list();
	String[] txt_file = fname.list(filt);

	System.out.println("Total files present in Directory : "+file_list.length);

	System.out.println("\n Content of the given directory : ");

	for(String f : file_list)
	{
		System.out.println(f);	
	}
	System.out.println("Files in directory ends with .txt ");
	for(String f:txt_file)
	{
	System.out.println(f);
	}
	}
	else
	{
	System.out.println("     File Details      ");
	System.out.println("File Name : "+fname.getName());
	System.out.println("Length of file : "+fname.length());
	System.out.println("Relative Path : "+fname.getPath());
	System.out.println("Absolute Path : "+fname.getAbsolutePath());
	System.out.println("Parent : "+fname.getParent());
	System.out.println("Readable : "+fname.canRead());
	System.out.println("Writeable : "+fname.canWrite());
	System.out.println("Last Modified : "+fname.lastModified());
	}
		
	}
	
}
