package com.eomcs.lms.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import com.eomcs.lms.dao.serial.AbstractDataSerializer;
import com.eomcs.lms.domain.Member;

public interface MemberDao  {



  int insert(Member member) throws Exception ;
  List<Member> findAll() throws Exception ;
  Member findBy(int no) throws Exception ;
  int update(Member member) throws Exception ;
  int delete(int no) throws Exception ;


}








