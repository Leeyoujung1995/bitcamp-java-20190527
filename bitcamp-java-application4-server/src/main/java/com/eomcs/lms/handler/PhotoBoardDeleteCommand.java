package com.eomcs.lms.handler;

import java.io.BufferedReader;
import java.io.PrintStream;
import com.eomcs.lms.dao.PhotoBoardDao;
import com.eomcs.lms.dao.PhotoFileDao;
import com.eomcs.util.Component;
import com.eomcs.util.Input;
import com.eomcs.util.PlatformTransactionManager;
@Component("/photoboard/delete")
public class PhotoBoardDeleteCommand implements Command {

  private PlatformTransactionManager txManager;
  private PhotoBoardDao photoBoardDao;
  private PhotoFileDao photoFileDao;

  public PhotoBoardDeleteCommand(PlatformTransactionManager txManager,PhotoBoardDao photoBoardDao,PhotoFileDao photoFileDao) {
    this.txManager =txManager;
    this.photoBoardDao = photoBoardDao;
    this.photoFileDao = photoFileDao;
  }


  @Override
  public void excute(BufferedReader in ,PrintStream out) {
 
    try {txManager.beginTransaction();
    
      int no = Input.getIntValue(in,out,"번호? ");

      if(photoBoardDao.findBy(no) == null) {
        out.println("해당 데이터가 없습니다.");
        return;
      }
      //먼저 게시물의 첨부파일을 삭제한다.
      photoFileDao.deleteAll(no);

      //게시물을 삭제한다
      photoBoardDao.delete(no);

      txManager.commit();
      out.println("데이터를 삭제하였습니다.");

    } catch (Exception e) {
      //=>DBMS 쪽 담당자(스레드)에게 임시 보관된 데이터 변경 결과를 모두 취소할 것을 명령한다.
      //예외가 발생하면 DBMS의 임시 데이터베이스에 보관된 데이터 변경 작업들을 모두 취소한다.
      try {txManager.rollback();}catch(Exception e2) {}
      out.println("데이터 저장에 실패했습니다!");
      System.out.println(e.getMessage());
      e.printStackTrace();
    }
  }
}
