package mission.Week1_Day6.Me;

public class Customer {
    private long customerAmount;
    private String feeling;
    private boolean isCustomerLikeDelivery; // 고객의 배송 주문 선호 여부

    //setter
    public void setCustomerAmount(long customerAmount) {
        this.customerAmount = customerAmount;
    }
    public void setCustomerLikeDelivery(boolean customerLikeDelivery) {
        isCustomerLikeDelivery = customerLikeDelivery;
    }


    //매장직원에게 운동화 물어봄
    public void askSneakers(){
        System.out.println("손님: Nike 운동화에 대해 알려주세요.");
    }


    //신발 결제 가능여부 (구매가능 true, 불가능하면 false)
    public boolean paySneakersYesOrNo(Sneakers sneakers){
        if(this.customerAmount > sneakers.getNikeSneakersPrice()){
            System.out.println("손님: 결제할게요");
            return true;
        }
        else{
            System.out.println("손님: 다음에 올게요");
            return false;
        }
    }
    //재고부족으로 물품배송 여부
    public boolean payDeliveryAndSneakers(Sneakers sneakers){
        //가지고 있는 돈이 더 많은 경우
        //신발을 빼고 남은 돈이 배송료보다 크면
        if(this.customerAmount >= sneakers.getCostForDeliver()){
            System.out.println("손님: 주문해주세요");
            return true;
        }
        else{
            System.out.println("손님: 환불 부탁드립니다");
            return false;
        }
    }
    //배송여부
    public boolean isDelivery(){
        //배송 선호하지 않는 경우
        if(!this.isCustomerLikeDelivery){
            System.out.println("손님: 다음에 올게요");
            upgradeMyFeeling(false);
            printMyFeeling();
        }
        else{
            System.out.println("손님: 배송주문 할게요");
        }
        return this.isCustomerLikeDelivery;
    }
    //고객 운동화결제
    public void paySneakers(Sneakers sneakers) {
        this.customerAmount -= sneakers.getNikeSneakersPrice();
        System.out.println("[손님이 가진 돈은 "+this.customerAmount+"]");
    }
    //고객 환불요청
    public void refundSneakers(Sneakers sneakers){
        this.customerAmount += sneakers.getNikeSneakersPrice();
        System.out.println("[손님이 가진 돈은 " +this.customerAmount+"]");
        System.out.println("손님: 다음에 올게요");

    }
    //고객 배송료를 배송 담당자에게 지불
    public void payCostDelivery(Sneakers sneakers){
        this.customerAmount -= sneakers.getCostForDeliver();
        System.out.println("[손님이 가진 돈은 "+this.customerAmount+"]");
    }

    //운동화를 받고 특징을 말하고 기분 좋아짐
    public void getSneakers(Sneakers sneakers){
        System.out.println("손님: 감사합니다. 신발이 정말 "+sneakers.getNikeSneakersFeature()+"이네요");
    }
    //신발을 받고 기분이 좋아짐
    public void upgradeMyFeeling(boolean emotion){
        if(emotion) {
            this.feeling = "너무 좋아요";
        }
        else{
            this.feeling = "너무 아쉬워요";
        }
    }
    //기분을 알려줌
    public void printMyFeeling(){
        System.out.println("손님: 지금 제 기분은 " + this.feeling);
    }
}
