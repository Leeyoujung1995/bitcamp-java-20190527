//바이트 배열 객체에 출력하기 -Stream API를 사용하여 데이터 출력하기
package ch22.i.charater_stream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class Test01_2 {
  public static void main(String[] args) throws Exception {
    //문자를 '가'에서 부터 100자 출력한다

    //1)값 저장할 바이트 배열을 준비한다
    try(FileOutputStream out = new FileOutputStream("temp/data.bin")){


      //2)'가'에서 시자하여 다음 문자를 100자를 출력하라
      for(int i = 0,ch='가'; i <100; i++, ch++) {
        out.write((char)(ch));
      }
      System.out.println("출력완료");
    }catch(Exception e) {
      System.out.println("파일에 예외발생");
      e.printStackTrace();
    }


  }
}








