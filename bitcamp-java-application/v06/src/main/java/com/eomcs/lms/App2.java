package com.eomcs.lms;

import java.sql.Date;
import java.util.Scanner;

public class App2 {
  static Scanner scan;
  
  public static void main(String[] args) {
    scan = new Scanner(System.in);
    
    int [] num = new int [100];
    String [] name = new String [100];
    String [] email = new String [100];
    int [] password = new int [100];
    String [] picture = new String [100];
    int [] phoneNum = new int [100];
    Date [] ed = new Date [100];
    
   
    
    int i=0;
    for( ;i<num.length;i++) {
     num[i] =getIntValue("번호?");
    
     name[i] =getStringValue("이름?");
  
     email[i] =getStringValue("이메일?");
    
     password[i] = getIntValue("암호?");
    
     picture[i] = getStringValue("사진?");
   
     phoneNum[i] = getIntValue("전화?");
    
     ed[i] =getDateValue("가입일?");
    
     System.out.println("계속 입력하시겠습니까? Y/n");
     String response = scan.nextLine();
     if(response.equals("n"))
       break;
    }
    
    
    for(int i2=0; i2<=i; i2++) {
      System.out.printf("%s,%s,%s,%s,%s,%s,%s\n",num[i2],name[i2],email[i2],password[i2],picture[i2],phoneNum[i2],ed[i2]);
    
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
