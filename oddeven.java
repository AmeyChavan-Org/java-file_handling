import java.io.*;
public class oddeven
{
	public static void main(String args[]) throws IOException
	{
		FileOutputStream even = new FileOutputStream("./even.txt");
		FileOutputStream odd = new FileOutputStream("./odd.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(args[0])));

		char lines[];
		int lcnt=0;

		String line;
	try
	{
	while((line = br.readLine())!=null)
	{
		lcnt++;
		lines = line.toCharArray();

		if(lcnt%2==0)
		{
			for(char ch : lines)
			
				even.write(ch);
			even.write('\n');
		}
		else
		{
			for(char ch : lines)
				odd.write(ch);
			odd.write('\n');
		
		}
	}
	System.out.println("Operation Successful !! ");
}
	
	catch(IOException ioe)
	{
		System.out.println(ioe);
	}
	try
	{
		odd.close();
		even.close();
	}
	catch(IOException ioe)
	{
		System.out.println("ioe");
	}
    }
}

