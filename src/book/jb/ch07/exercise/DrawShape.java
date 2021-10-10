package book.jb.ch07.exercise;

//DrawShape 클래스
public class DrawShape {
    public static void main(String[] args) {
        //세개의 포인트 설정
        Point[] p = {new Point(100, 100), new Point(200, 300), new Point(120, 30)};
        //삼각형 객체 생성
        Triangle t = new Triangle(p);
        //원 객체 생성
        Circle c = new Circle(new Point(150, 150), 50);
        //삼각형을 그린다.
        t.draw();
        //원을 그린다.
        c.draw();
    }
}

//최상위 클래스
class Shape {
    //color = black
    String color = "black";
    //그리기 색깔만 표현
    void draw() {
        System.out.println("[color="+color+"+]");
    }
}

//Point 클래스
class Point {
    //변수 선언, x,y
    int x;
    int y;

    //생성자 초기화 x=0, y=0
    Point() {
        this(0, 0);
    }

    //생성자 x, y 이용 객체 할당
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /*
      x, y 값 리턴
      (10, 20)
    */
    String getXY() {
        return "("+x+", "+y+")";
    }
}

//Triangle 클래스
class Triangle extends Shape {
    //좌표 선언
    Point[] p;
    //생성자 초기화
    Triangle(Point[] p) {
        this.p = p;
    }
    /*
     * 메소드명: draw()
     * 그리기 대신 출력(아래 참고)
     * [p1=(100,100), p2=(140,50), p3=(200,100), color=black]
     */
    void draw() {
        System.out.printf("[p1="+p[0].getXY()+", p2="+p[1].getXY() +", p3=" +p[2].getXY()
                +", color="+color+"]%n");
    }
}

//Circle 클래스
class Circle extends Shape {
    //원의 원점 좌표
    Point p = new Point();
    //반지름
    int r;
    //원 생성자, 초기화: x=0, y=0, r=100
    Circle() {
        this(new Point(), 100);
    }
    /*원 생성자, 초기화
     * 파라미터: Point p, int r
     */
    Circle(Point p, int r) {
        this.p = p;
        this.r = r;
    }
    /*원을 그리는 대신 원의 정보를 출력
     *메소드명: draw()
     *[center=(150, 150), r=50, color=black]
     */
    void draw() {
        System.out.printf("[center=%s, r=%d, color=%s]", p.getXY(), r, color);
    }

}