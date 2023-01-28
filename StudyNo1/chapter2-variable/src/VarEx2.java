public class VarEx2 {

    public static void main(String[] args) {

        // 변수 값 교환
        int x = 10, y= 20;

        //x y 교환 -> temp 생성
        int temp = 0;

        temp    = x;
        x       = y;
        y       = temp;

        System.out.println("변환 후 X : " + x + ",  변환 후 Y : " + y);
        System.out.println("temp : " + temp);




    }


}
