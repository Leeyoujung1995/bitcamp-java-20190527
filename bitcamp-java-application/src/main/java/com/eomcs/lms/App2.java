package com.eomcs.lms;

import java.sql.Date;
import java.util.Scanner;

public class App2 {
  static Scanner scan;
  
  public static void main(String[] args) {
    
    scan = new Scanner(System.in);
    
    
    int num =getIntValue("번호?");
    
    String name =getStringValue("이름?");
  
    String email =getStringValue("이메일?");
    
    int password = getIntValue("암호?");
    
    String picture = getStringValue("사진?");
   
    int phoneNum = getIntValue("전화?");
    
    Date ed =getDateValue("가입일?");
    
    
    
    
    
    
    System.out.printf("번호:%s\n " ,num);
    System.out.printf("이름:%s\n " , name);
    System.out.printf("이메일:%s\n " , email);
    System.out.printf("암호:%s\n " , password);
    System.out.printf("사진:%s\n " , picture);
    System.out.printf("전화:%s\n " , phoneNum);
    System.out.printf("가입일:%s\n " , ed);
    
  }
  
  
  
  private static int getIntValue(String message)  {
   
    while (true) {
    try {//예외처리
        System.out.print(message);
        return Integer.parseInt(scan.nextLine()); 
      } catch (NumberFormatException e) {
        System.out.println("숫자를 입력하세요");
        
      }
    }
  
  }
  
  
  
  
  private static String getStringValue(String message)  {
   
    System.out.println(message);
    return scan.nextLine();
     }
  
  
  
  
  
  private static Date getDateValue(String message)  {
   
    while (true) {
    try {
        System.out.print(message);
        return Date.valueOf(scan.nextLine()); 
      } catch (java.lang.IllegalArgumentException e) {
        System.out.println("2019-07-05형식으로 입력하세요");
        
      }
    }
    }
  
  
  
  
  
  
  
  
  
  
}
