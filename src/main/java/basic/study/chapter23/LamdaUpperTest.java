package basic.study.chapter23;

import java.util.function.Consumer;
import java.util.function.Function;

public class LamdaUpperTest {

    public static void main(String[] args) {

        // 인스턴스 메서드
        Function<String, String> upper = String::toUpperCase;
        System.out.println(upper.apply("korea"));

        // 객체의 인스턴스 메서드
        Consumer<String> print = System.out::print;
        print.accept("korea");
    }
}
