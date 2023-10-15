package mission.Week2_Day6;

public class VIPCustomer extends Customer{

    private double sneakerDisCountRatio = 0.2;
    private double deliveryDisCountRatio = 1.0;

    public VIPCustomer(String customerName, Long cache, String sneakerModel, Boolean likeDelivery) {
        super(customerName, cache, sneakerModel, likeDelivery);
        this.customerLevel = CustomerLevel.VIP;
    }

    @Override
    public long calculateNikePrice(long nikePrice) {
        System.out.printf("손님: 저 %s 등급이어서 운동화 할인 %.2f 되는 걸로 알고 있습니다.\\n", this.customerLevel, this.sneakerDisCountRatio);
        return Math.round(nikePrice * (1 - sneakerDisCountRatio)); // 20% 할 인
    }

    @Override
    public long calculateDeliveryCost(long cost) {
        System.out.printf("손님: 저 %s 등급이어서 배송 할인 %.2f 되는 걸로 알고 있습니다.\\n", this.customerLevel, this.deliveryDisCountRatio);
        return Math.round(cost * (1 - deliveryDisCountRatio)); // 100% 할 인
    }
}