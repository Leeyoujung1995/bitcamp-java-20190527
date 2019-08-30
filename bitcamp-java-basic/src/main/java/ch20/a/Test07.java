// java.util.LinkedList 사용법
package ch20.a;

import java.util.ArrayList;

public class Test07 {

  public static void main(String[] args) {

    ArrayList<String> names = new ArrayList<>();
    names.add("홍길동");
    names.add("임꺽정");
    names.add("이유정");
    names.add("김구");
    names.add("김유빈");
    names.add("최태훈");
    names.forEach(item -> {
        System.out.println(item);
    });
  }
}




