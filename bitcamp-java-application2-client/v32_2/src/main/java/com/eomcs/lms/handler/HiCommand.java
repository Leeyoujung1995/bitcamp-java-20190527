package com.eomcs.lms.handler;

import com.eomcs.util.Input;

public class HiCommand implements Command {

  Input input;
  
  public HiCommand(Input input) {
    this.input = input;
  }
  
  @Override
  public void excute() {
    String k = input.getStringValue("이름?");
    System.out.println("안녕하세요"+k+"님!");
   }
}
