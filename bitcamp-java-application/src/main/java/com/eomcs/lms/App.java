//애플리케이션 메인 클래스
//==>애플리케이션을 실행할 때 이 클래스를 실행한다.
package com.eomcs.lms;

import java.util.Scanner;
import java.sql.Date;
public class App {
  static Scanner keyScan;
  
  
  public static void main(String[] args) {
    java.io.InputStream keyboard = System.in;
    keyScan = new Scanner(keyboard);
   
    int num =getIntValue("번호?");  
    String lectureName = getStringValue("수업명?");
    String description = getStringValue("설명?");
    Date StartDate = getDateValue("시작일?");
    Date endDate = getDateValue("종료일?");
    int dayHours =getIntValue("일수업시간?");
    int totalHours =getIntValue("총수업시간?");
    
  
    System.out.println();
    
    
    System.out.printf("번호: %s\n", num);
    System.out.printf("수업명: %s\n" , lectureName);
    System.out.printf("설명: %s\n" , description);
    System.out.printf("시작일: %s\n" , StartDate);
    System.out.printf("종료일: %s\n" , endDate);
    System.out.printf("일수업시간: %s\n" , dayHours);
    System.out.printf("총수업시간: %s\n" , totalHours);
    
  }
  
  private static int getIntValue(String message)  {
    java.io.InputStream keyboard = System.in;
    while (true) {
    try {//예외처리
        System.out.print(message);
        return Integer.parseInt(keyScan.nextLine()); //메모리를 넘투에 할당한다.
      } catch (NumberFormatException e) {
        System.out.println("숫자를 입력하세요");
        //System.exit(0);//시스템을 나가는 문법
      }//블럭처리해준건 밖에서 못씀
    }
    }
  
  private static Date getDateValue(String message)  {
    java.io.InputStream keyboard = System.in;
    while (true) {
    try {//예외처리
        System.out.print(message);
        return Date.valueOf(keyScan.nextLine()); //메모리를 넘투에 할당한다.
      } catch (java.lang.IllegalArgumentException e) {
        System.out.println("2019-07-05형식으로 입력하세요");
        //System.exit(0);//시스템을 나가는 문법
      }//블럭처리해준건 밖에서 못씀
    }
    }
 

  private static String getStringValue(String message)  {
   java.io.InputStream keyboard = System.in;
   System.out.println(message);
   return keyScan.nextLine();
    }
 





}
