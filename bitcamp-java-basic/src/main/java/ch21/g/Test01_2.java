//예외 처리 연습-try~catch로 예외 처리하기
package ch21.g;


import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test01_2 {

  public static void main(String[] args) {
    FileReader in;
 try {
    in =new FileReader("build.gradle");//컴파일오류
 }catch(FileNotFoundException e) {
   System.out.println("해당 파일을 찾을수 없습니다");
 }
  }

}