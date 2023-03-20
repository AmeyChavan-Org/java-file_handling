


import java.io.*;
import java.io.FileReader;

public class a52 {
    public static void main(String word[]) {
        int f; 
        if (word.length == 0) {
            System.out.println("invalid  Arguement:");
            System.exit(0);
        }
        String fname = word[0];

        try {
            String fileName;
            BufferedReader br = new BufferedReader(new FileReader(fname));
            int nol = 0, noc = 0, now = 0,htc=0;

            String line;

            while (((line = br.readLine()) != null)) {
                nol++;
                noc += line.length();
                String[] w = line.trim().split("\\s+");
                if(line.length()==0)   //if length is zero that means it is an empty line 
                {
                htc=htc+1; //count the number of empty lines 
               // System.out.println("Number of Lines:");
                }
                now += w.length;
              
            } 
            f=now-htc; //subtract the number of empty lines from the wrod count so that it does not count the empty line as an additonnal word 
            br.close();//close reading to the file 
            System.out.println("Number of Lines:" + nol);
            System.out.println("Number of Characters:" + (noc+nol));
            System.out.println("Number of Words:" + f);
        } catch (Exception e1) {
            System.out.println("Error Occured" + e1.getMessage());
        }
    }
}





