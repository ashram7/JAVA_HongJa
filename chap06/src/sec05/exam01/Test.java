package sec05.exam01;

public class Test {
	static String nation;                                  //정적 필드
    String color;                                          //인스턴스 필드
    void setColor(String color) { this.color = color; }    //인스턴스 메소드
    static int plus(int x, int y) { return x + y; }        //정적 메소드
    static int minus(int x, int y) { return x - y; }       //정적 메소드
}
