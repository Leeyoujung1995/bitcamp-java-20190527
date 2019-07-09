// 애플리케이션 메인 클래스
// => 애플리케이션을 실행할 때 이 클래스를 실행한다.
package com.eomcs.lms;

import java.util.Scanner;
import com.eomcs.lms.Handler.BoardHandler;
import com.eomcs.lms.Handler.LessonHandler;
import com.eomcs.lms.Handler.MemberHandler;
import com.eomcs.lms.util.Input;

public class App {
  
 public static Scanner keyScan;
  

 

  public static void main(String[] args) {
   
    keyScan = new Scanner(System.in);
    Input.keyScan=keyScan;
    
    LessonHandler lessonHandler = new LessonHandler();
    LessonHandler.keyScan =keyScan;
                  //인스턴스
    MemberHandler memberHandler = new MemberHandler();   
    MemberHandler.keyScan=keyScan;
    
    BoardHandler boardHandler = new BoardHandler();
    BoardHandler boardHandler2 = new BoardHandler();//boardHandler 어떤 인스턴스를 써줄지만 해준다.//같은 메소드로 주소값만 다르게                                                    
    BoardHandler.keyScan=keyScan;
   

    while (true) {
      
      String command = prompt();
      
      if (command.equals("quit")) {
        break;
        
      } else if (command.equals("/lesson/add")) {
        lessonHandler.addLesson(); // addLesson() 메서드 블록에 묶어 놓은 코드를 실행한다.
        
      } else if (command.equals("/lesson/list")) {
        lessonHandler.listLesson();
        
      } else if (command.equals("/member/add")) {
        memberHandler.addMember();
      
      } else if (command.equals("/member/list")) {
        memberHandler.listMember();
      } else if (command.equals("/board/add")) {
        boardHandler.addBoard();
        
      } else if (command.equals("/board/list")) {
        boardHandler.listBoard();
        
      } else if (command.equals("/board2/add")) {
        boardHandler2.addBoard();
        
      } else if (command.equals("/board2/list")) {
        boardHandler2.listBoard();
        
      }else {
        System.out.println("해당 명령을 지원하지 않습니다!");
      }
      
      System.out.println();
    }
  }
 public static String prompt() {
    System.out.print("명령> ");
    return keyScan.nextLine();
    
  }
 
 
 

  

  

}










