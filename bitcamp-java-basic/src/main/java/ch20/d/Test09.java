// Hashtable에서 value 목록 꺼내기 - elements()
package ch20.d;

import java.util.Enumeration;
import java.util.Hashtable;

public class Test09 {
  
  public static void main(String[] args) {
    
    class Student {
      String name;
      int age;
      
      public Student(String name, int age) {
        this.name = name;
        this.age = age;
      }

      @Override
      public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
      }
    }
    
    Hashtable<String, Student> map = new Hashtable<>();
    map.put("aaa", new Student("홍길동", 20));
    map.put("bbb", new Student("임꺽정", 30));
    
    Student s = new Student("안중근", 25);
    map.put("ccc", s);
    map.put("ddd", s);
    
    //HashTable도 Hashmap과 마찬가지로 values()를 사용하여 값 목록만 꺼낼 수 있다.
    //또한 Hashtable은 Enumeration으로 값 목록을 꺼내는 메서드를 추가로 제공한다.
    //=>Enmeration의 사용법은 Iterator 사용법과 비슷하다.
    // value 목록 꺼내기
    Enumeration<Student> values = map.elements();
    while (values.hasMoreElements()) {
      System.out.println(values.nextElement());
    }
    
  }
}

/* 
List vs Set vs Map

항목                           List               Set                  Map
1) 중복 저장            |        가능        |     불가능         | key 불가능, value 가능
2) null 허용 여부       |        가능        |      가능(한 개만)  | HashMap(key/value 가능), 
                                                               Hashtable(key/value 불가능)
                                                               
 */




















