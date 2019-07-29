package ch22.c.ex3.byte_stream;

import java.io.IOException;
import ch22.c.ex1.byte_stream.BufferedInputStream;

public class BufferedDataInputStream2 extends BufferedInputStream{

  public BufferedDataInputStream2(String name) throws IOException {
    super(name);
   
  }
  
  public int readInt() throws IOException {
    int value = 0;
    value |= read() << 24;
    value |= read() << 16;
    value |= read() << 8;
    value |= read();
    return value;
  }
  
  
  public short readShort() throws IOException {
    short value = 0;
    value |= read() << 8;
    value |= read();
    return value;
  }

  
  public long readLong() throws IOException {
    long value = 0L;
    value |= (long)read() << 56;
    value |= (long)read() << 48;
    value |= (long)read() << 40;
    value |= (long)read() << 32;
    value |= (long)read() << 24;
    value |= (long)read() << 16;
    value |= (long)read() << 8;
    value |= (long)read();
    return value;
  }
  
  
  public boolean readBoolean() throws IOException{
    return read() ==0?true:false;
    
  }
  
  public String readUTF() throws IOException{
    //먼저 UTF-8바이트의 개수를 의미하는 2바이트를 읽는다
    int len = readShort();
    
    //해당 개수 만큼 바이트 배열을 만든다
    byte[] bytes = new byte[len];
    
    //준비한 바이트 배열에 파일 데이터를 읽어 온다
    for(int i =0; i<bytes.length;i++) {
      bytes[i] =(byte)read();
    }
    
    //읽어 온 바이트 배열을 가지고 String 객체를 만든다.
    return new String(bytes,"UTF-8");
  }
  
  
  
  
}
