package com.eomcs.lms;

import java.sql.Date;
import java.util.Scanner;

public class App2 {
  static Scanner scan;
  


  
  public static void main(String[] args) {
    
  
    scan = new Scanner(System.in);
    
    Member[] members = new Member[100];
    
    
    
    int i =0;
    for( ; i < members.length;i++) {

      Member member = new Member();
      
     member.num =getIntValue("번호?");
    
     member.name =getStringValue("이름?");
  
     member.email =getStringValue("이메일?");
    
     member.password = getIntValue("암호?");
    
     member.photo = getStringValue("사진?");
   
     member.tel = getIntValue("전화?");
    
     member.registeredDate =getDateValue("가입일?");
     
     members[i] =member;
    
     System.out.println("계속 입력하시겠습니까? Y/n");
     String response = scan.nextLine();
     if(response.equals("n"))
       break;
    }
    
    
    
    
    
    for(int i2=0; i2<=i; i2++) {
      Member member = members[i2];
      System.out.printf("%s,%s,%s,%s,%s,%s,%s\n"
          ,member.num,member.name,member.email,member.password,member.photo,member.tel,member.registeredDate);
    
    }
    
    
    
    
    
    
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
