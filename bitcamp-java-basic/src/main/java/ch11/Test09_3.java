// Wrapper 클래스 : 사용 후
package ch11;

import java.util.Date;

public class Test09_3 {
  public static void main(String[] args) {
    // Primitive Type의 값을 전달할 때는 Test09_2의 경우와 같이
    // 각 타입의 값을 받는 메서드를 여러 개 만들어야하지만,
    // Wrapper 클래스의 인스턴스를 사용하면 타입의 종류와 상관없이
    // 파라미터로 값을 받는 메소드는 한 개만 만들어도 된다.
    //printFloat(ss); // 파라미터 변수가 값을 요구하는 primitive 타입의 변수이다.
                    // 인스턴스의 주소를 넘길 수 없다.
    
    // 그런데 Wrapper 클래스를 사용하면 primitive도 인스턴스로 다룰 수 있기 때문에
    // primitive 데이터를 다루는 메서드를 여러 개 만들 필요가 없다.
    Integer a = Integer.valueOf(1000);
    Float b = Float.valueOf(3.14f);
    String c = "Hello";
    Date d = new Date();
   
    printObject(a); // primitive 값을 인스턴스에 담아서 넘길 수 있다. 
    printObject(b); // 이것이 Wrapper 클래스가 필요한 이유이다.
    printObject(c);
    printObject(d);
    
  }
  
  static void printObject(Object obj) {
    System.out.println("값 => " + obj.toString());
  }
}












