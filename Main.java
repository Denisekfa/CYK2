//Denise Keiko Ferreira Adati - 10430962

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

class Main {
  public static void main(String[] args) {
    lerArquivo();
  }
      public static void lerArquivo(){
        try {
            File file = new File("inp-glc.txt");
            System.out.println(file.exists());
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}