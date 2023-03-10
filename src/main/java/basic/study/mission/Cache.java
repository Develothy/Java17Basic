package basic.study.mission;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Cache {

    private static Map<Integer, Integer> cache = new HashMap<>();

    //@Cacheable(value = "calc")
    public static int calc(int value) {

        if (!cache.isEmpty() && cache.containsKey(value)) {
            return cache.get(value);
        }

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("슬립 중 interrupt 발생!");
        }
        cache.put(value, value *= 100000);
        return value;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;

        for (int i = 0; i <= 10; i++) {

            System.out.println("숫자를 입력하세요(1 ~ 10) : " + i);
            while (!sc.hasNextInt()) {
                System.out.println(sc.next() + "는 숫자가 아닙니다!! 다시!");
            }
            num = sc.nextInt();
            System.out.println("호출 시간 : " + ZonedDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss:SSS")));
            System.out.println(calc(num));
            System.out.println("응답 시간 : " + ZonedDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss:SSS")));

        }
        sc.close();

    }
}