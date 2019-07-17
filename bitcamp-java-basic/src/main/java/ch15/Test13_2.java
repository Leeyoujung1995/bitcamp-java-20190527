// Object 클래스 - shallow copy
package ch15;

// clone()은 인스턴스를 복제할 때 호출하는 메서드이다.

public class Test13_2 {

  // 인스턴스 복제 기능을 활성화하려면 Cloneable 인터페이스를 구현해야 한다.
  // => 이 인터페이스에는 메서드가 선언되어 있지 않다.
  // => 따라서 클래스는 따로 메서드를 구현할 필요가 없다.
  // => Cloneable을 구현하는 이유는
  // JVM에게 이 클래스의 인스턴스를 복제할 수 있음을 표시하기 위함이다.
  // 이 표시가 안된 클래스는 JVM이 인스턴스를 복제해 주지 않는다. 즉 clone 을 호출할수없다 .   
  
  
  
  // 인스턴스를 복제할 때는,
  // => Object에서 상속 받은 clone()을 호출해야 한다.
  // => 그런데 clone()의 접근 제어가 protected 이라서
  // 같은 패키지의 멤버이거나 서브 클래스만이 호출할 수 있다.
  // => 다른 패키지의 멤버가 호출하려면 public 으로 접근 제어의 범위를 넓혀야 한다.
  // => 어떻게? 오버라이딩 하라!
  static class Engine implements Cloneable{
    int cc;
    int value;
    
    public Engine (int cc, int value) {
      this.cc = cc;
      this.value =value;
      
    }
    public Engine clone() throws CloneNotSupportedException {
      return (Engine) super.clone();
    }
    @Override
    public String toString() {
      return "Engine [cc=" + cc + ", value=" + value + "]";
    }
  }
  
  static class Car implements Cloneable {
   
    String name;
    String maker;
    Engine engine;

    public Car(String maker,String name, Engine engine) {
      this.name = name;
      this.maker = maker;
      this.engine=engine;
    }


    @Override
    public String toString() {
      return "Car [name=" + name + ", maker=" + maker + "]";
    }


    @Override
    public Car clone() throws CloneNotSupportedException {
      //deep copy
      //=>포함하고 있는 하위 객체에 대한 복제를 수행하려면 다음과 같이
      //개발자 직접 하위 객체를 복제하는 코드를 작성해야 한다.
      Car copy = (Car)super.clone();
      copy.engine =this.engine.clone();
      return (Car)super.clone();
    }
  }

  public static void main(String[] args) throws Exception {
    Engine engine = new Engine(3000,16);
    Car car = new Car("비트자동차","비트비트",engine);
    
    //자동차 복제
    Car car2 =car.clone();
    
    System.out.println(car==car2);
    System.out.println(car);
    System.out.println(car2);
    System.out.println(car.engine==car2.engine);
    
    
    //clone()은 해당 객체의 필드 값만 복제한다.
    //그 객체가 포함하고 있는 하위 객체는 복제하지 않는다.
    //"Shallow copy"라 부른다
    
    //그 객체가 포함하고 있는 하위 객체까지 복제하는 것을
    //"deep copy"라 부른다
    //deep copy는 개발자가 직접 clone()메서드안에
    //deep copy
}
}


