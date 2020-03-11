/*
* @author: Hansel Lopez 19026 & Eduardo Ramírez 19946
*	Hoja de Trabajo #6
*	Algoritmos y estructuras de datos 
*/
import java.io.*;
import java.util.ArrayList;

public class fileRead{
    ArrayList<String> list;
    String[] parts;

	public ArrayList<String> Reader(){
        list = new ArrayList<String>();

		String fileName = "cards_desc.txt";

        String line = null;

        try {

            FileReader fileReader = 
                new FileReader(fileName);

            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                parts = line.split("\\|");
                list.add(parts[0]);
                parts = null;
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
        return list;
    }

    public ArrayList<String> Reader2(){
        list = new ArrayList<String>();

		String fileName = "cards_desc.txt";

        String line = null;

        try {

            FileReader fileReader = 
                new FileReader(fileName);

            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                parts = line.split("\\|");
                list.add(parts[1]);
                parts = null;
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
        return list;
    }
}