import java.io.*;
public class wordschk
{
	public static void main(String args[]) throws IOException
	{
		String fname = args[0];		
		File f = new File(fname);

		int lcnt = 0,ccnt = 0, wcnt = -1;

		if(f.isDirectory())
		{
			System.out.println("Invalid name");
		} 
		else if(f.isFile())
		{
			BufferedReader br = new BufferedReader(new FileReader(fname));
			String[] words = {};
			String lines;
		while((lines = br.readLine())!=null)
		{
			lcnt++;
			ccnt+=lines.length();
	
			if(!lines.isEmpty())
			{
				words = lines.trim().split("\\s+");	
				wcnt+=words.length;
			}
		}	
		System.out.println("Total number of Lines : "+lcnt);
		System.out.println("Total number of Characters : "+ccnt);
		System.out.println("Total number of Words : "+wcnt);
		}
		else
		{
			System.out.println(" Invalid File Name !!");	
		}
	}

}
