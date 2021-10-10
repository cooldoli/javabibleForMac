package book.jb.ch07.comment;

class Tv {
    //1.변수선언
    //1.1 tv power
    //1.2 channel 숫자
    boolean power;
    int channel;
    //2.파워 상태 전환
    //return void;
    void power() { power = !power; }
    //3.채널 위로 올리기
    //return void;
    void channelUp() { channel++; }
    //4.채널 아래로 내리기 이거 git 테스트
    //return void;
    void channelDown() { channel--; }

}

class CaptionTv extends Tv {
    //캡션 변수
    boolean caption;
    //캡션 기능 - 보여주기(캡션이 켜있을 때만)
    void displayCaption(String text) {
        if(caption) {
            System.out.println(text);
        }
    }
}

public class CaptionTvTest {
    public static void main(String[] args) {
        //1.CaptionTv 초기화
        CaptionTv ctv = new CaptionTv();
        //2.10번 채널 선택
        ctv.channel = 10;
        //3.한 채널 위로 올리기
        ctv.channelUp();
        //4.현재 채널 보여주기
        System.out.println("channel["+ctv.channel+"]");
        //5.Hello, World 찍어 보기
        ctv.displayCaption("Hello, World");
        //6.캡션켜기
        ctv.caption = true;
        //7.다시 Hello, World 찍어 보기
        ctv.displayCaption("Hello, World");
    }
}
