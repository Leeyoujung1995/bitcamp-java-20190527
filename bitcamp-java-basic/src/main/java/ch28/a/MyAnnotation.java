package ch28.a;

// 애노테이션 정의
// 
public @interface MyAnnotation {

}
//한줄주석이나 여러줄 주석은 컴파일 할 때 .class 파일에 포함되지 않음
//소스코드의 설명을 붙일 때 사용
/**
javadoc 주석 :javadoc.exe를 통해 HTML API 문서를 생성할 때 사용됨
컴파일 할 때 .class 파일에 포함되지 않음
*/
//@xxx(프로퍼티=값,프로퍼티=값)애노테이션
//컴파일러에게 정보 전달할 때 사용
//실행 중에 정보를 추출할 때 사용
//.class파잉ㄹ에 포함할 수 있다.
//