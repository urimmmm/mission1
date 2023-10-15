package mission.Week2_Day4.Problem_2;

public enum OrderStatus {
    PAID("주문완료"),
    SHIPPED("배송 중"),
    DELIVERED("배송완료"),
    NOT_PAID("결제 전"),
    ON_ORDER("주문 중");

    private final String description;

    OrderStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
