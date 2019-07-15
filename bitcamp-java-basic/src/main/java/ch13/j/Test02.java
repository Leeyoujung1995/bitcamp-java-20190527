// 추상 클래스: 서브 클래스에 공통 기능을 물려주는 목적으로 존재하는 클래스
package ch13.j;

public class Test02 {

  public static void main(String[] args) {
   m1(new DumpTruck());
   //m2(new Car());오류
   m2(new DumpTruck());
   m2(new Convertible());
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
