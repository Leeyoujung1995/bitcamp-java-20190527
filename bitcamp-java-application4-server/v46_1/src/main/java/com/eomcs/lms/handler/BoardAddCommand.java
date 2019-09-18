package com.eomcs.lms.handler;

import java.io.BufferedReader;
import java.io.PrintStream;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import com.eomcs.lms.dao.BoardDao;
import com.eomcs.lms.domain.Board;
import com.eomcs.util.Input;

public class BoardAddCommand implements Command {
  private BoardDao boardDao;

  public BoardAddCommand( BoardDao boardDao) {
    this.boardDao = boardDao;
  }
  
  public String getCommandName() {
    return "/board/add";
  }
   
  @Override
  public void excute(BufferedReader in ,PrintStream out) {


    try {
      Board board = new Board();
      board.setContents(Input.getStringValue(in,out,"내용? "));

      boardDao.insert(board);
      out.println("저장하였습니다.");

    }catch(Exception e) {
      out.println("데이터에 저장에 실패했습니다");
      System.out.println(e.getMessage());
    }
  }
}
