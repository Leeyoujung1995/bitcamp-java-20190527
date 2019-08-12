package com.eomcs.lms.dao;

import java.util.List;
import com.eomcs.lms.domain.Board;

public interface BoardDao  {
  
 
  
  
  //DAO 사용규칙을 정의한다
 int insert(Board board) throws Exception; 
 List<Board> findAll() throws Exception ;
Board findBy(int no) throws Exception; 
int update(Board board) throws Exception; 
 int delete(int no) throws Exception ;
  }
  
  
  









