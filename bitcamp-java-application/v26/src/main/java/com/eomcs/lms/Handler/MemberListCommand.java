package com.eomcs.lms.Handler;

import java.sql.Date;
import java.util.List;
import com.eomcs.lms.domain.Member;
import com.eomcs.util.Input;

public class MemberListCommand implements Command{
  
  private List<Member> list;
  private Input input;
  
  public MemberListCommand(Input input,List<Member>list) {
    this.input = input;
    this.list=list;
  }

 
  @Override
  
  public void excute() {
    Member[] members = list.toArray(new Member[] {});
    for (Member member : members) {
      System.out.printf("%d, %-5s , %-20s , %-15s , %s\n", member.getNo(), member.getName(), 
          member.getEmail(), member.getTel(), member.getRegisteredDate());
    }
  }

}

  

