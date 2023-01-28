import java.util.Date;
import java.util.logging.Logger;

public class VarType {

    Date today = new Date();

    // 상수 Constant && 리터럴 literal
    final int MAX_SPEED = 10;
    //상수는 반드시 선언과 동시에 초기화를 해야하며 변경하는것을 허용하지 않는다.


    //  literal 그 자체로 값을 의미하는것
    int year = 2023;
    final int MAX_VALUE = 200;

    //  year 변수 MXA_VALUE 상수 2023, 200 리터럴

    //리터럴의 타입과 접미사

    int octNum = 010; // 8진수 10, 10진수로 8
    int hexNum = 0x10; // 16진수 10, 10진수 16
    int binNum = 0b10;

    long big = 100_000_000_000L;
    float pi = 3.14f; // f F  둘다 사용가능
    double rate = 1.618d; //  d D 둘다 사용가능₩


    // 타입 불일치시
    static int i = 'A'; // 문자 A  유니코드 값인 64가 저장된다
    long lo = 123;
    double dou = 3.14f;

    char ch = 'j'; // 'java' 로 저장 하면 에러남
    String chStr = "java";  // 문자열 Java를 저장

    // 문자열 리터럴에는  "" 공백허용 가능 , 문자 리터럴은 공백 허용안함
    String emptyStr = "";
    //  char emptyCh = '';
    char emCh = ' '; // 반드시 무언가하나는 있어야함;

    String name = new String("java");

    String addName = "Ja" + "va";
    String arrStr = name + "8.0";

    public static void main(String[] arg){

        System.out.println(i);

        // 기본형 . 참조형

        /* 기본형 8개 */
        /*
        * 논리 - boolean
        * 문자 - char
        * 정수 - byte short int long
        * 실수 - float double
        *
        * */
    }

}
