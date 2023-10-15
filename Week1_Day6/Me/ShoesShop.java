package mission.Week1_Day6.Me;

public class ShoesShop {
    public static void main(String[] args) {
        // 변수 변경 가능
        // Customer 의 잔액, DeliveryManager 매상, Staff 매상은 모두 10만원 시작 입니다.

        Customer customer = new Customer();
        customer.setCustomerAmount(100_000); //손님의 잔액
        customer.setCustomerLikeDelivery(true); //배송여부


        Staff staff = new Staff();
        staff.setShopAmount(100_000); //매장직원 매상
        staff.setHavingNikeSneakersInStore(false); //운동화 재고 여부


        DeliveryManager deliveryManager = new DeliveryManager();
        deliveryManager.setDeliveryAmount(100_000); //배송 담당자 매상


        Sneakers sneakers = new Sneakers();
        sneakers.setDaysForDeliver(3); //배송 소요일
        sneakers.setCostForDeliver(300_000); //배송료
        sneakers.setNikeSneakersPrice(50_000); //운동화 가격
        sneakers.setNikeSneakersFeature("편안함"); //운동화 특징


        customer.askSneakers(); //손님 물어봄
        staff.noticeSneakersPrice(sneakers.getNikeSneakersFeature(), sneakers); //매장직원 운동화 특징과 가격을 손님에게 알려줌

        boolean customerPay = customer.paySneakersYesOrNo(sneakers); //예산을 확인해서 살지 안살지 결정
        //손님의 구매여부
        if (customerPay) {
            //매장직원의 재고에 따라서 실행
            boolean staffHaveStock = staff.checkSneakersStock(sneakers);
            //재고가 있는 경우
            if (staffHaveStock) {
                customer.paySneakers(sneakers); //고객이 결제 진행
                staff.addAmount(sneakers); //매상에 돈을 더함
                staff.giveToCustomer(); //신발 건내줌
                customer.getSneakers(sneakers); //신발받고 어떤지 말함
                customer.upgradeMyFeeling(staff.isHavingNikeSneakersInStore()); //신발받고 기분이 변경
                customer.printMyFeeling(); //기분에 대해 말함
            }
            //재고가 없는 경우
            else {
                boolean wantDelivery = customer.isDelivery(); //고객의 배송여부 확인
                //배송을 원하는 경우에만 실행
                if (wantDelivery) {
                    customer.paySneakers(sneakers); //손님 결제
                    staff.addAmount(sneakers); //매상 더하기
                    staff.askDeliveryManager(sneakers); //배송담당자에게 요청
                    deliveryManager.noticeDelivery(sneakers); //배송담당자가 매장직원에게 응답
                    staff.deliveryInfo(sneakers); //매장직원이 손님에게 배송정보 전달
                    boolean customerDelivery = customer.payDeliveryAndSneakers(sneakers); //손님의 잔액으로 배송을 할지 안할지 여부
                    //배송 결제를 할 수 있는 경우
                    if (customerDelivery) {
                        deliveryManager.makePackage(); //배송 담당자가 택배를 만듬
                        deliveryManager.sendToCustomer(); //배송 담당자가 택배를 전달
                        customer.payCostDelivery(sneakers); //배송 담당자에게 배송료 지불
                        deliveryManager.addCostDelivery(sneakers); //배송 담장자가 배송료를 매상에 저장
                        customer.getSneakers(sneakers);
                        customer.upgradeMyFeeling(true);
                        customer.printMyFeeling();
                    }
                    //운동화 가격 환불을 원하는 경우
                    else {
                        staff.minusAmount(sneakers);
                        customer.refundSneakers(sneakers);
                        customer.upgradeMyFeeling(false);
                        customer.printMyFeeling();

                    }
                }
            }

        }
    }
}
