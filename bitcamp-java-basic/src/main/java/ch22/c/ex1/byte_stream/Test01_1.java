// 버퍼 사용 - 사용 전
// 
package ch22.c.ex1.byte_stream;

import java.io.FileInputStream;

public class Test01_1 {
  public static void main(String[] args)throws Exception {

 
      FileInputStream in = new FileInputStream("temp/jls12.pdf");
      
      System.out.println("데이터 읽는 중...");
      
      long start = System.currentTimeMillis();
      int count=0;
      int len=0;
      int b;
      while ((b = in.read()) != -1) {
        count++;
        //파일에서 읽은 1바이트를 암호화한다고 가정해 보자.
        //바이트 배열에 데이터를 읽어 왔으면
        //다음과 같이 바이트 배열을 또 반복하여 특정 작업을 수행해야 한다.
        //1바이트를 읽었으면 1바이트를 암호화한다고 가정하자
        //그러면 여기에 그 암호화 하는 코드를 작성해야한다.
        for(int i=0; i<len;i++) {
          //각 바이트를 암호화시키는 코드를 여기에 작성해야 한다
          //데이터를 읽는 속도를 높이기 위해 바이트 배열 단위로 읽는 것은 좋지만
          //반복문 안에 반복문을 넣고 코드를 작성해야하는 불편하는 생겼다.
          
          
        }
        
      }
      
      long end = System.currentTimeMillis();
      System.out.println(end - start);
      
      in.close();
      
    
    
    System.out.println("출력 완료!");
  }
}








