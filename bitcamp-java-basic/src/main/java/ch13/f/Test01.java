// 상속 관계에서 생성자 호출 과정 - super()
package ch13.f;

public class Test01 {

  public static void main(String[] args) {
    B obj = new B();//B클래스와 그 상위 클래스들의 설계도에 따라 인스턴스를 생성한 후 B클래스의 default 생성자를 호출한다.
    
    // 생성자 호출 과정
    // 1) B() 생성자 호출
    // 2) B의 수퍼 클래스인 A() 생성자 호출
    // 3) A의 수퍼 클래스인 Object() 생성자 호출
    //    - 초기화 문장 실행
    //    - 인스턴스 블록 실행 
    //    - Object() 생성자 실행
    //    - A() 생성자로 리턴한다.
    // 4) A() 생성자 실행
    //    - 초기화 문장 실행
    //    - 인스턴스 블록 실행
    //    - A() 생성자 실행
    //    - B() 생성자로 리턴한다.
    // 5) B() 생성자 실행
    //    - 초기화 문장 실행
    //    - 인스턴스 블록 실행
    //    - B() 생성자 실행
    // 
    // 정리!
    // => 인스턴스를 생성하면 해당 클래스의 생성자를 호출한 후 상위 클래스의 생성자 호출로 올라 간다.
    //    그런 후 수퍼 클래스의 생성자부터 실행하면서 내려 온다.
    
    obj.m1();
    obj.m2();
    
    // 결론!
    // => 수퍼 클래스부터 초기화 작업을 실행한다. 

  }

}
