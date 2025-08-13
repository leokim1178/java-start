package variable;

public class Var8 { // 클래스는 파스칼 케이스
    public static void main(String[] args) {
        // 정수
        byte b = 127; // - 128 ~ 127
        // 범위를 넘어가면 컴파일 오류
        short s = 32767; // -32768 ~ 32767
        int i = 2147483647; // -2147483648 ~ 2147483647 (약 20억) 2의 32승

        // - 2의 64승 ~ 2의 64승 -1
        long l =  6410491204912419423L; // 20억을 넘어가면 대문자 L을 붙여서 정수 리터럴을 long으로 변경해야한다
        //  8 byte 2의 64승
        //실수
        float f = 10.0f; // f를 붙여서 float형으로 지정해야한다, 부동소수점 // 4byte 2의 32승
        double d = 10.0; // float보다 더 큰 범위, 고정소수점 //  8 byte 2의 64승

        // string은 동적 타입

        String orderDetail; // 변수는 카멜 케이스
        // 패키지는 전부 소문자

    }
}
