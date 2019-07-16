package com.eomcs.lms.Handler;


import com.eomcs.lms.domain.Lesson;
import com.eomcs.util.ArrayList;
import com.eomcs.util.Input;

public class LessonHandler {
 private ArrayList lessonList = new ArrayList();
 
 private  Input input;
 
 public LessonHandler(Input input) {
   this.input=input;
 }
 
 public  void addLesson() {
    // 수업 데이터를 저장할 메모리를 Lesson 설계도에 따라 만든다.
    Lesson lesson = new Lesson();
    
    // 사용자가 입력한 값을 Lesson 인스턴스의 각 변수에 저장한다.
    lesson.setNo(input.getIntValue("번호? "));
    lesson.setTitle(input.getStringValue("수업명? "));
    lesson.setContents(input.getStringValue("설명? "));
    lesson.setStartDate(input.getDateValue("시작일? "));
    lesson.setEndDate(input.getDateValue("종료일? "));
    lesson.setTotalHours(input.getIntValue("총수업시간? "));
    lesson.setDayHours(input.getIntValue("일수업시간? "));
    
    // 수업 데이터를 저장하고 있는 인스턴스의 주소를 레퍼런스 배열에 저장한다.
    //LessonHandler에서 데이터를 저장하지않고 Lessonlist에 저장한다  
    lessonList.add(lesson);
    
    System.out.println("저장하였습니다.");
  }

 public  void listLesson() {
   Object [] objects = lessonList.toArray();
    for (Object object : objects) {  
      Lesson lesson = (Lesson) object;
      System.out.printf("%s, %s, %s ~ %s, %s\n", 
          lesson.getNo(), lesson.getTitle(), 
          lesson.getStartDate(), lesson.getEndDate(), lesson.getTotalHours());
    }
  }
 
  
}
