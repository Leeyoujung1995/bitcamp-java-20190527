//예외 처리 연습-예외 처리를 호출자에게 넘기기
package ch21.g;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test01_3 {

  public static void main(String[] args)throws FileNotFoundException {
    FileReader in;
 
    in =new FileReader("build.gradle");//컴파일오류
    //Exception 예외인 경우 반드시 예외 처리를 요구한다.
    //(RuntimeException은 제외)
   
  }

}
