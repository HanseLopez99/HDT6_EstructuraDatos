import java.io.*;
/*
* @author: Hansel Lopez & Eduardo Ramírez
*	Hoja de Trabajo #6
*	Algoritmos y estructuras de datos //lectura de archivo .txt
*/

public class Main{

    public static void main(String [] args) {

        String fileName = "cards_desc.txt";

        String line = null;

        try {

            FileReader fileReader = 
                new FileReader(fileName);

            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }   

            bufferedReader.close();         
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
