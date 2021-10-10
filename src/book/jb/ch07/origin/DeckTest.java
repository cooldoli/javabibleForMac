package book.jb.ch07.origin;

public class DeckTest {
    public static void main(String[] args) {
        //카드 한번(Deck)을 만든다.
        Deck d = new Deck();
        //섞기 전에 맨 위에 카드를 뽑는다.
        Card c = d.pick(0);
        //뽑은 카드 출력
        System.out.println(c);
        //카드 섞기
        d.shuffle();
        //카드 뽑기 
        c = d.pick(0);
        //뽑은 카드 출력
        System.out.println(c);
    }
}

class Deck {
    //카드 숫자: 13*4 = 52;
    final int CARD_NUM = 52;
    //Card클래스를 배열 처리
    Card cardArr[] = new Card[CARD_NUM];
    /*
     * 생성자
     * 카드 종류별 카드 숫자에 카드 객체 할당
     */
    Deck() {
        int i = 0;
        for(int k=Card.KIND_MAX; k > 0; k--)
            for(int n=0; n < Card.NUM_MAX; n++)
                cardArr[i++] = new Card(k, n+1);
    }
    //카드객체 리턴
    Card pick(int index) {
        return cardArr[index];
    }
    //임이의 카드 객체 반환
    Card pick() {
        int index = (int)(Math.random() * CARD_NUM);
        return pick(index);
    }
    /*
     * 메소드명:shuffle
     * 카드객체 하나와 다른 하나를 바꾸는 형태
     * 리턴: 없음
     */
    void shuffle() {
        for(int i=0; i < cardArr.length; i++) {
            int r = (int)(Math.random() * CARD_NUM);

            Card temp = cardArr[i];
            cardArr[i] = cardArr[r];
            cardArr[r] = temp;
        }
    }
}

class Card {
    //카드 무늬의 수
    static final int KIND_MAX = 4;
    //무늬별 카드 수
    static final int NUM_MAX = 13;

    static final int SPADE = 4;
    static final int DIAMOND = 3;
    static final int HEART = 2;
    static final int CLOVER = 1;
    int kind;
    int number;
    //카드 초기화 SPADE, 숫자 1
    Card() {
        this(SPADE, 1);
    }
    //카드 초기화 및 값 할당
    Card(int kind, int number) {
        this.kind = kind;
        this.number = number;
    }
    //toString
    public String toString() {
        String[] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};
        String numbers = "0123456789XJQK";

        return "kind : " + kinds[this.kind]
                + ", number : " + numbers.charAt(this.number);
    }
}