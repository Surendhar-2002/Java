package Practice;

import java.io.FileReader;
import java.io.IOException;

public class ThrowExam {

    // public static void main(String[] args) {
    //     int age=16;
    //     if(age<18){
    //         throw new ArithmeticException("Not eligibale");
    //     }
    //     System.out.println("Eligibale");
    // }

    //  static void checkFile() throws IOException{
    //         FileReader file = new FileReader(("abc.text"));
    //     }
    // public static void main(String[] args) {
    //     try{
    //         checkFile();
    //     }catch(IOException e){
    //         System.out.println("file not found");
    //     }
    // }

    static void checkAge(int age) throws Exception{
        if(age<18){
            throw new Exception("UnderAge");
        }
        System.out.println("statisfied");
    }

    public static void main(String[] args) {
        try{
            checkAge(19);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
