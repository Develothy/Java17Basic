package basic.study.mission.Cafe;

public class StrawberryFrap extends Frappuccino {

    String flavor = "딸기 ";

    StrawberryFrap(boolean isWithWhip, Size size, int cnt) {
        this.name = flavor + name;
        this.isWithWhip = isWithWhip;
        this.size = size;
        this.cnt = cnt;
        this.price = 6000;
    }

    @Override
    public void addPoint() {
        System.out.println("딸기 이벤트!! 딸기 음료 한잔 당 3포인트를 적립해드립니다!");
    }
}
