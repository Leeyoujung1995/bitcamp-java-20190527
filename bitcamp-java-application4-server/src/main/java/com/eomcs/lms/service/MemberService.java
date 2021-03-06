package com.eomcs.lms.service;

import java.util.List;
import com.eomcs.lms.domain.Member;

// 역할:
// => 게시물 관리 업무를 수행
// => 트랜잭션 제어
// => 여러 페이지 컨트롤러가 사용한다.
//
public interface MemberService {
  List<Member> list() throws Exception;
  List<Member> seach(String ketword) throws Exception;
  Member get(int no) throws Exception;
  void insert(Member member) throws Exception;
  void update(Member member) throws Exception;
  void delete(int no) throws Exception;
}










