package com.eomcs.lms.handler;


import java.io.BufferedReader;
import java.io.PrintStream;
import com.eomcs.lms.dao.LessonDao;
import com.eomcs.lms.domain.Lesson;
import com.eomcs.util.Input;

public class LessonUpdateCommand implements Command {
  private LessonDao lessonDao;

  public LessonUpdateCommand(LessonDao lessonDao) {
    this.lessonDao=lessonDao;
  }


  @Override
  public void excute(BufferedReader in ,PrintStream out) {
    //사용자가 입력한 번호를 가지고 목록에서 그 번호에 해당하는 Lesson 객체를 찾는다.
    try {
      int no = Input.getIntValue(in,out,"번호? ");
      Lesson lesson = lessonDao.findBy(no);
      if(lesson == null) {
        out.println("해당 번호의 데이터가 없습니다!");
        return;
      }

      //사용자로부터 변경할 값을 입력 받는다.
      String str =Input.getStringValue(in,out,"수업명(" +lesson.getTitle() + ")?");
      if(str.length() >0) {
        lesson.setTitle(str);
      }
      str =Input.getStringValue(in,out,"수업내용?");
      if(str.length() >0) {
        lesson.setTitle(str);
      }

      lesson.setStartDate(Input.getDateValue(in,out,"시작일(" +lesson.getStartDate()+")?"));

      lesson.setEndDate( Input.getDateValue(in,out,"종료일(" +lesson.getStartDate()+")?"));

      lesson.setTotalHours(Input.getIntValue(in,out,"총수업시간(" +lesson.getTotalHours()+")?"));

      lesson.setDayHours(Input.getIntValue(in,out,"일수업시간(" +lesson.getDayHours()+")?"));
      out.println("데이터가 변경되었습니다.");
      lessonDao.update(lesson);

    }catch (Exception e) {
      out.println("데이터 변경에 실패했습니다!");
      System.out.println(e.getMessage());
    }

  }

}