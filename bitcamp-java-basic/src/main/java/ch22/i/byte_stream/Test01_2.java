//파일에 출력하기 -Stream API를 사용하여 데이터 출력하기
package ch22.i.byte_stream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class Test01_2 {
  public static void main(String[] args) throws Exception {
    
    //1~100중에서 짝수만 바이트 배열에 넣어 보자
    
    //1)값 저장할 바이트 배열을 준비한다
    try(FileOutputStream out = new FileOutputStream("temp/data.bin")){
      
      
      //2)짝수를 파일에 출력한다
      for( int i = 1; i<=100; i++) {
        if(i % 2 == 0)
          out.write(i);
      }
      System.out.println("출력완료");
    }catch(Exception e) {
      System.out.println("파일에 예외발생");
      e.printStackTrace();
    }
    

  }
}








