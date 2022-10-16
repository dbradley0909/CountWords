import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.*;  

public class App {
  //private static PrintWriter read;
  // public static int countFile(String outputfileName) {
  //  int word = 0;
  //    try {
  //  BufferedReader read = new BufferedReader(new FileReader("outputfileName"));    
  //  String lineWord;
  //  String countW[];
  //   while((lineWord =read.readLine()) != null)
  // {
      
  // countW = lineWord.split(" ");
  //    word = word + countW.length;
  //  }
  //  read.close();
  //   } catch(IOException e)
  //  {
  //   e.printStackTrace();
  //  }
  //  return word;
   //}
    public static void main(String args[]) throws Exception{
   Scanner sc = new Scanner(System.in);
   System.out.print("Welcome to The Word Count App, You will input & ouput a file name, /n this app will count the words and numbers of times it appears in the file name! First enter a name of the file example ");
   System.out.print(" Please enter an input file name: ");
   String inputFileName = sc.next();
   System.out.print(" Please enter an output file name: ");
   String outputFileName = sc.next();
   File fileO = new File(inputFileName);
   if (!fileO.exists()){
System.out.print(" Invalid file name try again with exp... name.txt! ");
   }else{
    }
   try (PrintWriter fileScan = new PrintWriter(outputFileName)) {
  FileInputStream fileByteStream = null; 
   Scanner inFS = null;                  
   String userWord;
   int wordFreq = 0;
   String currWord;
   fileByteStream = new FileInputStream("outPutFile.txt");
   inFS = new Scanner(fileByteStream);
   System.out.print("Enter a word: ");
   userWord = sc.next();
   while (inFS.hasNext()) {
      currWord = inFS.next();
      if(currWord.equals(userWord)) {
         ++wordFreq;
      }
   }

   System.out.println(userWord + " appears in the file " +
    wordFreq + " times.");   
   fileByteStream.close(); 
   sc.close();
   inFS.close();
}
    
   //}
  //  catch(Exception e)
  //  {
  //    e.printStackTrace();
  //  }
//    File fileO = new File(inputFileName);
//    if (!fileO.exists()){
// System.out.print(" Invalid file name try again with exp... name.txt! ");
//    }else{
//        int word = countFile(outputFileName); 
//        System.out.print("Total count of words:" + word);
//     }
    sc.close();
}
}

// BufferedWriter input = new BufferedWriter(new FileWriter("outPutFile.txt"));    
// String[] words = {"java", "java", "she" , "java", "she", "java","engineer", "java", "engineer", "female", "male"};
// for (String word: words){
//   input.write(word + "\n" );
// }
// input.close();
//    } catch(IOException e)
//   {
//    e.printStackTrace();
//   }
//   try {
//   BufferedReader read = new BufferedReader(new FileReader("outPutFile.txt"));  
//    System.out.println(read.readLine());
//    read.close();
//   } catch(IOException e)
//   {
//    e.printStackTrace();
//   }
//   return 0;
// }
