//애플리케이션 메인 클래스
//==>애플리케이션을 실행할 때 이 클래스를 실행한다.
package com.eomcs.lms;

import java.sql.Date;
import java.util.Scanner;

public class App {
  static Scanner keyScan;
  
  
  public static void main(String[] args) {
    java.io.InputStream keyboard = System.in;
    keyScan = new Scanner(keyboard);
   
    
    int [] num = new int[100];
    String [] lectureName = new String[100];
    String [] description = new String[100];
    Date [] startDate = new Date[100];
    Date [] endDate = new Date[100];
    int [] totalHours = new int[100];
    int [] dayHours = new int[100];
    
    
    int i=0;
    for( ; i<num.length; i++){
      num[i] =getIntValue("번호?");  
      lectureName[i] = getStringValue("수업명?");
      description[i] = getStringValue("설명?");
      startDate[i] = getDateValue("시작일?");
      endDate[i] = getDateValue("종료일?");
      dayHours[i] =getIntValue("일수업시간?");
      totalHours[i] =getIntValue("총수업시간?");
     
      System.out.println("계속 입력하시겠습니까?(Y/n)");
      String response = keyScan.nextLine();
      
      if(response.equals("n"))
        break;
      
    }
    
    
    System.out.println();
    
   
    for(int i2=0; i2<=i; i2++) {
      System.out.printf("%s,%s,%s,%s~%s,%s,%s\n",
          num[i2],lectureName[i2],description[i2],startDate[i2],endDate[i2],dayHours[i2],totalHours[i2]);
    }
 
    
    
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
