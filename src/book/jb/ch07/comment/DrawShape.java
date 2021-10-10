package book.jb.ch07.comment;
//DrawShape 클래스
public class DrawShape {
    public static void main(String[] args) {
        //세개의 포인트 설정

        //삼각형 객체 생성
        //원 객체 생성

        //삼각형을 그린다.
        //원을 그린다.
    }
}

//최상위 클래스
class Shape {
    //color = black
    //그리기 색깔만 표현
}

//Point 클래스
class Point {
    //변수 선언, x,y

    //생성자 초기화 x=0, y=0

    //생성자 x, y 이용 객체 할당

    //x, y 값 리턴
}

//Triangle 클래스
class Triangle extends Shape {
    //좌표 선언
    //생성자 초기화
    /* 메소드명: draw()
     * 그리기 대신 출력(아래 참고)
     * [p1=(100,100), p2=(140,50), p3=(200,100), color=black]
     */
}

//Circle 클래스
class Circle extends Shape {
    //원의 원점 좌표
    //반지름
    //원 생성자, 초기화: x=0, y=0, r=100

    /*원 생성자, 초기화
    * 파라미터: Point p, int r
     */

    /*원을 그리는 대신 원의 정보를 출력
    *메소드명: draw()
    *[center=(150, 150), r=50, color=black]
     */

}