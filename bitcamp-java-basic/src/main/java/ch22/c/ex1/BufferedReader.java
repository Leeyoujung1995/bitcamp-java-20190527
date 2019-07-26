package ch22.c.ex1;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;



//상속을 이용한 기능 추가
//=>기존의 FileInputStream에 버퍼링 기능을 추가하기
public class BufferedReader extends FileReader {
  
  InputStream in;
  char[] buf = new char[1024];
  int size = 0;
  int cursor = 0;
  int counnt =0;
 
  public BufferedReader(String name) throws IOException{
    super(name);
  }
  @Override
  public int read() throws IOException {

    if (cursor >= size) {//버퍼에 보관된 데이터를 다 읽었으면
      size = read(buf);//다시 FileInputStream을 사용하여 1024 바이트를 읽어 온다
      if (size == -1)//물론 파일에 읽은 데이터가 없다면 즉 다 읽었다면 -1을 리턴한다
        return -1;
      cursor = 0;//FileInputStream을 사용하여 새로 1024 바이트를 읽어 버퍼에 저장했다면
    }            //다시 커서의 위치를 0으로 설정한다
    
   
    return buf[cursor++];
  }
  
}






