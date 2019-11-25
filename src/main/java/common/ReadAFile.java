package common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadAFile {

    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader(new File("123.txt")))){
            String str;
            while((str = reader.readLine())!=null ){
                System.out.println(str);
            }
            reader.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
