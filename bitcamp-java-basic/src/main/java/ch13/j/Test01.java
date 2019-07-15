// 추상 클래스: 서브 클래스에 공통 기능을 물려주는 목적으로 존재하는 클래스
package ch13.j;

public class Test01 {

  public static void main(String[] args) {
    
    //지붕을 열 수 있는 자동차와 짐을 싣는 덤프트럭이 필요해서 해당 클래스르 정의하였고,
    //다음과 같이 사용한다.
    
    Convertible c1 = new Convertible();
    DumpTruck c2 = new DumpTruck();
    
    //그러다 두 클래스의 공통점이 있어
    //소스 코드의 유지관리를 쉽게하기 위해 수퍼 클래스 Car를 정의하였다.
    //Car클래스는 직접 사용하기 위해 정의한 클래스가 아니라,
    //소스 코드 관리를 위해 여러 클래스의 일반 기능을 모아 둔 클래스이다.
    //이런 클래스는 직접 사용하지 못하게 막는 것이 좋다.
    //특정 클래스의 인스턴스를 생성하지 못하도록 하기 위해 만든 문법이 "추상클래스"이다.
    //어떤 클래스를 추상 클래스로 지정하면 인스턴스를 생성할 수 있다.
    
    //특히 Car 클래스처럼 generalization을 통해 생성한 클래스라면
    //단지 서브 클래스에게 공통 필드나 메서드를 상속해주는 용도로만 사용하도록 만들기 위해
    //추상 클래스로 지정하는 것이 좋다
    
    //거꾸로 어떠 클래스가 추상 클래스라면
    //그 클래스를 만든 개발자는 해당 클래스를 직접 사용하지 말고
    //서브 클래스를 만들어 기능을 확장한 다음에 사용하라는 의도임을 알아야 한다.
    
    
    // 그러나 추상 클래스의 인스턴스는 생성할 수 없다.
    //Car c3 = new Car(); // 컴파일 오류!
  }
  
  static void m1(DumpTruck car) {
    //파라미터가 Dump Truck이면,
    //이 메소드를 호출할때 반드시 DumpTruck 의 인스턴스나 
    //또는 DumpTruck의 하위 클래스의 인스턴스를 넘기라는 뜻이다
    
  }
  static void m2(Car car) {
    //파라미터가 Car이다.
    //이 메서드를 호출할 떄 Car의 하위 클래스의 인스턴스를 넘기라는 뜻이다.
    //Car는 추상 클래스이기 떄문에 인스턴스를 생성할 수 없다.
    
  }

}
