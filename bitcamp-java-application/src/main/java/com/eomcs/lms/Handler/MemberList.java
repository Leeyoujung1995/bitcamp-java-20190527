package com.eomcs.lms.Handler;


import com.eomcs.lms.domain.Member;

public class MemberList {
  private static final int DEFAULT_Capacity=100;
  
  private  Member[] list;
  private int size = 0;
  
public MemberList() {
  this(DEFAULT_Capacity);
}

public MemberList(int initialCapacity) {
  if(initialCapacity <50 || initialCapacity>10000)
    list = new Member[DEFAULT_Capacity];
  else
    list = new Member[initialCapacity];
}
  
  
  public void add(Member member) {
    if(this.size == list.length)
      throw new RuntimeException("배열이 꽉 찼습니다");
    list[size++] = member;
  }
  
  public Member[] toArray() {
    Member[] arr = new Member[this.size];
    for(int i=0; i<this.size;i++) {
      arr[i] =this.list[i];
    }
    return arr;
  }
}
