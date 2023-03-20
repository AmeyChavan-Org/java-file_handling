//1
import java.io.*;

public class a51 {
   public static void main(String[] args) {
      //Check if command line argument is passed
      if (args.length == 0) {
         System.out.println("Please enter a file or directory name as command line argument.");
         System.exit(0);
      }

      //Get the input from command line argument
      String fileName = args[0];
      File file = new File(fileName);

      //Check if the input is a directory
      if (file.isDirectory()) {
         System.out.println("The input is a directory.");
         System.out.println("Contents of the directory:");

         //List the contents of the directory
         String[] fileList = file.list();
         int fileCount = 0;
         for (String name : fileList) {
            System.out.println(name);

            //Count the number of files in the directory
            File tempFile = new File(file.getAbsolutePath() + "/" + name);
            if (tempFile.isFile()) {
               fileCount++;

               //Display the names of all files in the directory having the extension .txt
               if (name.endsWith(".txt")) {
                  System.out.println("Found .txt file: " + name);
               }
            }
         }
         System.out.println("Total number of files in the directory: " + fileCount);

      //Check if the input is a file
      } else if (file.isFile()) {
         System.out.println("The input is a file.");
         System.out.println("File path: " + file.getAbsolutePath());
         System.out.println("File size: " + file.length() + " bytes");
        // System.out.println("File attributes: " + file.canRead() + ", " + file.canWrite() + ", " + file.canExecute());
        System.out.println("File attributes: " );
        System.out.println("is file a readable file : " + file.canRead() );
        System.out.println(" is File a writable file : "  + file.canWrite() );
        System.out.println("is File an executable file  : " + file.canExecute());
      //Display error message if the input is neither a file nor a directory
      } else {
         System.out.println("The input is neither a file nor a directory.");
      }
   }
}
//q1 file 
