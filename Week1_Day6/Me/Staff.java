package mission.Week1_Day6.Me;

public class Staff {
    private long shopAmount;
    private boolean havingNikeSneakersInStore; // 매장 Nike sneakers 재고 여부

    //setter
    public void setShopAmount(long shopAmount) {
        this.shopAmount = shopAmount;
    }

    public void setHavingNikeSneakersInStore(boolean havingNikeSneakersInStore) {
        this.havingNikeSneakersInStore = havingNikeSneakersInStore;
    }

    //getter
    public boolean isHavingNikeSneakersInStore() {
        return havingNikeSneakersInStore;
    }

    //운동화 확인하고 특징 가격 설명
    public void noticeSneakersPrice(String nikeSneakersFeature, Sneakers sneakers){
        System.out.println("매장직원: Nike 운동화는 "+ nikeSneakersFeature+"이 있습니다. 가격은 "+sneakers.getNikeSneakersPrice()+"원 입니다");

    }
    //재고확인함
    public boolean checkSneakersStock(Sneakers sneakers){
        //고객이 살 수 있고 재고가 있는 경우
        if(this.havingNikeSneakersInStore){
            System.out.println("매장직원: 구매하실 수 있습니다");
            System.out.println("매장직원: 운동화 가격은 "+sneakers.getNikeSneakersPrice()+"원 입니다");
        }
        //고객이 살 수 있고 재고가 없는 경우
        else{
            System.out.println("매장직원: 재고가 부족하여 물품배송 하시나요?");
        }
        return this.havingNikeSneakersInStore;
    }
    //배송 담당자에게 운동화 요청
    public void askDeliveryManager(Sneakers sneakers){
        System.out.println("매장직원: 배송담당자에게 운동화를 요청합니다");
    }
    //배송담당자가 전해준 내용을 고객에게 전달
    public void deliveryInfo(Sneakers sneakers){
        System.out.println("매장직원 (손님에게): 배송소요일은 "+ sneakers.getDaysForDeliver()+"일 이고 배송료는 "+ sneakers.getCostForDeliver()+"원 입니다");
    }
    //매상에 돈 더함
    public void addAmount(Sneakers sneakers){
        this.shopAmount += sneakers.getNikeSneakersPrice();
        System.out.println("[매상은 "+this.shopAmount+"]");
    }
    //환불을 해서 매상에 돈을 뺌
    public void minusAmount(Sneakers sneakers){
        this.shopAmount -= sneakers.getNikeSneakersPrice();
        System.out.println("[매상은 "+this.shopAmount+"]");
    }
    //고객에게 운동화 전달
    public void giveToCustomer(){
        System.out.println("매장직원: 찾으신 운동화 드리겠습니다");
    }

}
