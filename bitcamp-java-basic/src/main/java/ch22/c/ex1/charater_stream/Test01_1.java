// 버퍼 사용 -(for 텍스트 파일)-사용전
// 
package ch22.c.ex1.charater_stream;

import java.io.FileInputStream;
import java.io.FileReader;

public class Test01_1 {
  public static void main(String[] args) throws Exception{
    
 
     FileReader in = new FileReader("temp/jls12.txt");
      
      System.out.println("데이터 읽는 중...");
      
      long start = System.currentTimeMillis();
      
      int b;
      while ((b = in.read()) != -1) {
        //
      }
      
      long end = System.currentTimeMillis();
      System.out.println(end - start);
      
      in.close();
      

    
    System.out.println("출력 완료!");
  }
}








