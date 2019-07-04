package com.eomcs.lms;

import java.util.Scanner;

public class App3 {

  public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  
  System.out.println("번호?");
  String num = scan.nextLine();
  System.out.println("내용?");
  String descrition= scan.nextLine();
  System.out.println("작성일?");
  String writeDate = scan.nextLine();
  System.out.println("조회수?");
  String visitNum = scan.nextLine();
  
  
  System.out.println("번호: " + num);
  System.out.println("내용: " + descrition);
  System.out.println("작성일: " + writeDate);
  System.out.println("조회수: " + visitNum);
  }

}
