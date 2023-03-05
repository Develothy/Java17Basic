package basic.study.mission.Cafe;

abstract class Coffee extends CafeMenu {

    String coffeeBean;
    String name = "커피";
    int shot = 2;

    public Coffee(String coffeeBean) {
        super();
        order(coffeeBean);
    }

    public void order(String coffeeBean) {
        System.out.println(coffeeBean + " 원두를 선택하셨군요?");
    }

    public void grind(String coffeeBean) {
        System.out.println(coffeeBean + "원두를 갑니다!");
    }

    public void addShot(int amount) {
        shot += amount;
        name += " 샷 추가 ";
        price += 500;
        System.out.println("샷 추가하여 총 " + shot + "샷입니다!");
    }

    public String setNameIsIce(String name, boolean isIce) {
        return isIce ? "아이스 " + name : name;
    }

    @Override
    public void printRecipe() {
        String orderSuccess ="""
                ===============================
                메뉴 :\s""" + name + size + """
                사이즈
                수량 :\s""" + cnt + """
                잔
                총 가격 :\s""" + getTotalPrice(price, size, cnt) + """
                원
                ===============================
                """;
        System.out.println(orderSuccess);
    }

    @Override
    public void addPoint() {
        System.out.println("음료 1잔당 1포인트입니다!");
    }

    @Override
    public void useCoupon() {
        System.out.println("쿠폰으로 결제합니다.");
    }
}
