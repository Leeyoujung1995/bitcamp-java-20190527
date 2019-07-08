// 애플리케이션 메인 클래스

// => 애플리케이션을 실행할 때 이 클래스를 실행한다.

package com.eomcs.lms;



import java.sql.Date;

import java.util.Scanner;



public class App {

  static Scanner keyScan;

  public static void main(String[] args) {

    java.io.InputStream keyboard = System.in;

    keyScan = new Scanner(keyboard);


    Lesson[] lessons = new Lesson[100];
    int lessonSize = 0;
    Member[] members = new Member[100];
    int memberSize = 0;
    
    

    while (true) {

      System.out.print("명령> ");
      String command = keyScan.nextLine();
      
      if(command.equals("quit")) {
        break;
      }
      else if (command.equals("/lesson/add")) {
        // 수업 데이터를 저장할 메모리는 Lesson 설계도에 따라 만든다.

        Lesson lesson = new Lesson();


        // 사용자가 입력한 값을 Lesson 인스턴스의 각 변수에 저장한다.

        lesson.no = getIntValue("번호?");

        lesson.title = getStringValue("수업명? ");

        lesson.contents = getStringValue("설명? ");

        lesson.startDate = getDateValue("시작일? ");

        lesson.endDate = getDateValue("종료일? ");

        lesson.totalHours = getIntValue("총수업시간? ");

        lesson.dayHours = getIntValue("일수업시간? ");



        lessons[lessonSize++] = lesson;
      System.out.println("저장하였습니다.");
      
      }else if(command.equals("/member/add")) {
        
        Member member = new Member();
        
        
        member.num =getIntValue("번호?");
       
        member.name =getStringValue("이름?");
     
        member.email =getStringValue("이메일?");
       
        member.password = getIntValue("암호?");
       
        member.photo = getStringValue("사진?");
      
        member.tel = getIntValue("전화?");
       
        member.registeredDate =getDateValue("가입일?");
        
        members[memberSize++] =member;
        System.out.println("저장하였습니다.");
      }
      else if(command.equals("/lesson/list")) {
        for (int i = 0; i <lessonSize; i++) {
          // 레퍼런스 배열에서 한 개의 인스턴스 주소를 꺼낸다. 
        Lesson lesson = lessons[i];
          // 그 인스턴스 주소로 찾아가서 인스턴스의 각 변수 값을 꺼내 출력한다.
        System.out.printf("%d, %s, %s ~ %s, %d\n",
            lesson.no, lesson.title,lesson.startDate, lesson.endDate, lesson.totalHours);
        }
      }else if(command.equals("/member/list")){
          for (int i = 0; i <memberSize; i++) {
            Member member = members[i];
            System.out.printf("%s,%s,%s,%s,%s,%s,%s\n"
                ,member.num,member.name,member.email,member.password,member.photo,member.tel,member.registeredDate);
        }

      }else {
        System.out.println("해당 명령을 지원하지않습니다.");
      }
     System.out.println();
    }


    
    

      


    

    

  }

  

  private static int getIntValue(String message) {

    int value = 0;

    while (true) {

      try {

        System.out.print(message);

        return Integer.parseInt(keyScan.nextLine());

      } catch (NumberFormatException e) {

        System.out.println("숫자를 입력하세요.");

      }

    }

  }

  

  private static String getStringValue(String message) {

    System.out.print(message);

    return keyScan.nextLine();

  }

  

  private static Date getDateValue(String message) {

    while (true) {

      try {

        System.out.print(message);

        return Date.valueOf(keyScan.nextLine());

      } catch (IllegalArgumentException e) {

        System.out.println("2019-07-05 형식으로 입력하세요.");

      }

    }

  }

  

}
