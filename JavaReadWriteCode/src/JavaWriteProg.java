import java.io.*;

public class JavaWriteProg {
    public static void main(String [] args) {

        
        String fileName = "temp.txt";

        try {
            
            FileWriter fileWriter =
                new FileWriter(fileName);
            try (BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
                bufferedWriter.write("I am Kakon");
                bufferedWriter.write("JusT finish writing my program");
                bufferedWriter.newLine();
                bufferedWriter.write("RU CSE");
                bufferedWriter.write(" Thank You for supporting me");
            }
        }
        catch(IOException ex) {
            System.out.println(
                "Error writing to file '"
                + fileName + "'");
            ex.printStackTrace();
        }
    }
}