package com.eomcs.lms.Handler;

import java.sql.Date;
import com.eomcs.lms.domain.Member;
import com.eomcs.util.ArrayList;
import com.eomcs.util.Input;

public class MemberHandler {
  private ArrayList memberList = new ArrayList();
  
 public  Input input;
 
 public MemberHandler(Input input) {
   this.input=input;
 }
 
 public  void addMember() {
    Member member = new Member();
    member.setNo(input.getIntValue("번호? "));
    member.setName(input.getStringValue("이름? "));
    member.setEmail(input.getStringValue("이메일? "));
    member.setPassword(input.getStringValue("암호? "));
    member.setPhoto(input.getStringValue("사진? "));
    member.setTel(input.getStringValue("전화? "));
    member.setRegisteredDate(new Date(System.currentTimeMillis())); 
      
    memberList.add(member);
    System.out.println("저장하였습니다.");
  }

 public void listMember() {
   Object [] objects = memberList.toArray();
   for (Object object :objects) {
     Member member =(Member) object;
      System.out.printf("%s, %s, %s, %s, %s\n", 
          member.getNo(), member.getName(), member.getEmail(), 
          member.getTel(), member.getRegisteredDate());
    }
  }
}
  
