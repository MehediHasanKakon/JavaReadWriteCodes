import java.io.*;

public class ORead {
    public static void main(String [] args) {

        
        String fileName;
        fileName = "temp.txt";

       
        String line;
        line = null;

        try {
           
            FileReader fileReader =  new FileReader(fileName);
            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                while((line = bufferedReader.readLine()) != null) {
                    System.out.println(line);
                }
            }         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            
        }
    }
}

