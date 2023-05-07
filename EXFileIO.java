import java.io.*;
import javax.swing.JOptionPane;

class EXFileIO
{
         public static void main(String[] args)
        {
              //Variable Section:

              //Input Section:
              String sentence = JOptionPane.showInputDialog(null, "Enter a sentence:");

              //Process Section
              /*ADD YOUR INSTRUCTION TE READ FROM FILE . e.g. Output.txt*/
              
               try 
                 {
                  FileWriter writer = new FileWriter("output.txt");
                  writer.write(sentence);
                  writer.close();
                 } 
                    
               catch (IOException e) 
                  {
                     JOptionPane.showMessageDialog(null, "An error occurred while writing to the file.");
                     System.exit(1);
                  }

              //Output Section
              /*ADD YOUR CODE HERE TO DISPLAY THE DIALOGUE. e.g. use JOptionPane.showMessageDialog( )*/
              
                try 
                  {
                     FileReader reader = new FileReader("output.txt");
                     BufferedReader bufferedReader = new BufferedReader(reader);
                     String fileSentence = bufferedReader.readLine();
                     bufferedReader.close();

                     JOptionPane.showMessageDialog(null, "The sentence from the file is:\n" + fileSentence);
                  } 
        
        
                 catch (IOException e) 
                  {
                     JOptionPane.showMessageDialog(null, "An error occurred while reading from the file.");
                     System.exit(1);
                  }
          }
}