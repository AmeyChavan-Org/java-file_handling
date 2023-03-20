//a53
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class a53 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java FileSplitter <input file>");
            System.exit(1);
        }

        String inputFile = args[0];

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            int lineNumber = 1;

            FileWriter evenWriter = new FileWriter("even.txt");
            FileWriter oddWriter = new FileWriter("odd.txt");

            while ((line = reader.readLine()) != null) {
                if (lineNumber % 2 == 0) {
                    evenWriter.write(line + "\n");
                } else {
                    oddWriter.write(line + "\n");
                }
                lineNumber++;
            }

            evenWriter.close();
            oddWriter.close();

            System.out.println("File split completed.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}//q3 file even odd
