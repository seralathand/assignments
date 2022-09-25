package ZohoGraduationSchool;
import java.io.*;

public class FileTask {
    public static void main(String args[]) throws Exception{
       FileReader f=new FileReader("C:\\Users\\KARTHIKA.D\\IdeaProjects\\com.java\\src\\Alpabhet.java");
       BufferedReader br=new BufferedReader(f);
       FileOutputStream fos=new FileOutputStream("C:\\Users\\KARTHIKA.D\\Desktop\\java\\text.txt");

       int lineCount=0;
       int wordCount=0;
       int charCount=0;
       String x;
       while((x=br.readLine())!=null){
           lineCount++;
           String word[]=x.split(" ");
           wordCount+=word.length;
           for(String letters:word)
               charCount+=letters.length();
            fos.write(x.getBytes());
            String next="\n";
            fos.write(next.getBytes());
       }
        String str="line count "+lineCount;
       fos.write(str.getBytes());
       String str1="\nword count "+wordCount;
       fos.write(str1.getBytes());
       String str2="\nchar count "+charCount;
       fos.write(str2.getBytes());
        System.out.println();
    }
}