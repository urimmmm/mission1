package mission.Week1_Day6.Me;

public class DeliveryManager {
    private long deliveryAmount;

    //setter
    public void setDeliveryAmount(long deliveryAmount) {
        this.deliveryAmount = deliveryAmount;
    }

    //배송 담당자가 매장직원에게 정보 알려줌
    public void noticeDelivery(Sneakers sneakers){
        System.out.println("배송 담당자 (매장직원에게): 택배는 "+ sneakers.getDaysForDeliver()+"일이 걸리고 배송료는 "+ sneakers.getCostForDeliver()+"원 입니다");
    }
    //배송 담당자 택배 만듬
    public void makePackage(){
        System.out.println("배송 담당자: 운동화가 들어있는 택배를 만듭니다");
    }
    //배송 담당자 택배 전달
    public void sendToCustomer(){
        System.out.println("배송 담당자: 고객에게 택배 패키지를 전달합니다");
    }
    //배달 담당자 매상 추가
    public void addCostDelivery(Sneakers sneakers){
        this.deliveryAmount += sneakers.getCostForDeliver();
        System.out.println("[배송 담당자의 매상: "+this.deliveryAmount+"]");
    }
}
