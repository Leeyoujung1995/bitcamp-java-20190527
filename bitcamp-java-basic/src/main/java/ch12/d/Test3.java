//잘못된 값을 넣었을 때 무시하지 않고 강력하게 오류를 알리기
package ch12.d;

public class Test3 {

  public static void main(String[] args) {
   

  Patient3 p = new Patient3();
  p.setName("이유정");//메소드=오퍼레이트
  p.setAge(25);
  p.setHeight(163);
  p.setWeight(47);
  p.setGender(Patient.WOMAN);
  
  System.out.println(p);//toString메소드를 만들면 불러올필요가없다
  
  //환자르 컴퓨터에서 다루려면 데이터화 해야한다.
  //Patient는 이럴 목적으로 정의한 클래이다.
  //이렇게 Patient의 경우처럼 컴퓨터에서 다루기 위해 데이터화하여 정의하는 것을
  //"추상화"라 부른다.
  //꼭 데이터만 해당하는 것은 아니다.
  //MemberHandler 클래스의 경우처럼 특정 업무를 정의하는 것도
  //"추상화"라 부른다.
  //=>즉 실세계의 객체(예:사람,물건,업무 등)를 컴퓨터에서 다룰 수 있도록 클래스로 정의하는 행위를 "추상화"라 부른다.
  Patient3 p2 = new Patient3();
  p2.setName("고성재");
  p2.setAge(300);
  p2.setHeight(-50);
  p2.setWeight(700);
  p2.setGender(3);
  
  
  System.out.println(p2);//toString메소드를 만들면 불러올필요가없다
  
  //위의 p2 인스턴스를 보면
  //나이가 300이면 환자가 아니라 몬스터이다.
  //몸무게가 -50이면 이해 불가하다.
  //키가 4m이면 나무다.
  //즉 Patient 클래스는 환자의 데이터를 저장할 목적으로 정의한 클래스인데
  //환자의 데이터와 무관한 몬스터 데이터를 저장하고 있다.
  //차라리 클래스 이름을 Monster 로 변경하는 것이 바람직하다.
  //이렇게 클래스 목적에 맞지 않는 데이터가 들어 갈 수 있다면,
  //"추상화"가 무너지게 된다.
  //이를 방지하기 위해서는 클래스 목적(추상화 목적)에 맞춰
  //인스턴스 변수에 무효한 값이 들어가지 않도록 해야 한다.
  //그럴 목저으로 만든 문법이 캡슐화이다.
  //
  //"캡슐화"?추상화가 무너지지 않도록 인스턴스의 멤버(변수와 메서드)의 접근을 제어하는 문법이다.
  //"추상화"?실세계의 객체를 프로그램에서 다룰 수 있도록 클래스로 정의하는 것.
  //추상화 기법?
  //-데이터 타입을 정의
  //-유관 메서드를 묶기
  
  }

}