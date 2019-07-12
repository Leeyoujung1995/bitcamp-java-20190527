package com.eomcs.lms.Handler;

import com.eomcs.lms.domain.Board;
import com.eomcs.lms.domain.Lesson;

public class LessonList {
  private static final int DEFAULT_Capacity =100;
  
  private Lesson[] list;
  private  int size = 0;
  
  public LessonList() {
    this(DEFAULT_Capacity);
  }
  public LessonList(int initialCapacity) {
    if(initialCapacity < 50 || initialCapacity >10000)
      list = new Lesson[DEFAULT_Capacity];
    else
      list = new Lesson[initialCapacity];
  }
  
  public void add(Lesson lesson) {
    if(this.size == list.length)
    throw new RuntimeException("배열이 꽉 찼습니다");
    this.list[this.size++] = lesson;
  }
  
  public Lesson[] toArray() {
    Lesson[] arr = new Lesson[this.size];
    for(int i=0; i<this.size;i++) {
      arr[i] =this.list[i];
    }
    return arr;
  }
}
