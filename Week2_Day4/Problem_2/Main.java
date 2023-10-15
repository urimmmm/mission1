package mission.Week2_Day4.Problem_2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // 1. 고객 생성합니다.
        Customer customer1 = new Customer("John Doe", 30, Gender.MALE);
        Customer customer2 = new Customer("Jane Smith", 28, Gender.FEMALE);
        Customer customer3 = new Customer("Jane ho", 23, Gender.MALE);
        Customer customer4 = new Customer("Bob", 21, Gender.FEMALE);

        // 2. 주문 아이템을 만듭니다.
        OrderItem item1 = new OrderItem(1, "Keyboard", 35.99, 2);
        OrderItem item2 = new OrderItem(2, "Mouse", 19.99, 3);
        OrderItem item3 = new OrderItem(3, "Monitor", 149.99, 1);

        // 3. 주문 ItemList 제작합니다.
        List<OrderItem> orderItems1 = new ArrayList<>();
        orderItems1.add(item1);
        orderItems1.add(item2);
        orderItems1.add(item3);

        List<OrderItem> orderItems2 = new ArrayList<>();
        orderItems2.add(item1);
        orderItems2.add(item3);

        // 4. 주문 List를 만듭니다.
        List<Order> orders= new ArrayList<>();
        orders.add(new Order(1001, customer1, LocalDate.of(2023, 11, 9), OrderStatus.PAID, orderItems1)); //주문처리
        orders.add(new Order(1002, null, LocalDate.of(2023, 11, 9), OrderStatus.SHIPPED, orderItems2)); //고객누락
        orders.add(new Order(1003, customer3, LocalDate.of(2023, 11, 9), OrderStatus.SHIPPED, orderItems2)); //주문처리
        orders.add(new Order(1004, customer2, LocalDate.of(2023, 11, 9), OrderStatus.ON_ORDER, null)); //주문 전, 아이템 누락
        orders.add(new Order(1005, customer4, LocalDate.of(2023, 11, 9),OrderStatus.PAID, null)); //아이템 누락
        orders.add(new Order(1006, customer1, LocalDate.of(2023, 11, 9), OrderStatus.SHIPPED, orderItems2)); //아이템누락

        // 5. 오늘 주문 수 및 정산 진행합니다.
        double totalRevenue = 0;
        int totalOrderCount = 0;

        Set<OrderStatus> validStatus = new HashSet<>();
        //ON_ORDER, NOT_PAID 주문중과 결제전은 처리하지 않기 때문에
        validStatus.add(OrderStatus.ON_ORDER); //주문 중
        validStatus.add(OrderStatus.NOT_PAID); //결제 전
        //validStatus.add(OrderStatus.PAID); //주문완료
        //validStatus.add(OrderStatus.SHIPPED); //배송 중
        //validStatus.add(OrderStatus.DELIVERED); //배송완료
        for(Order order: orders){
            try {
                //고객정보가 없는 경우 고객정보가 없어 주문 누락
                Customer customer = order.getCustomer().orElseThrow( () -> { throw new RuntimeException("고객이 누락 되었습니다."); } );
                //만약에 결제 전이거나 주문 중일 때 고객정보를 출력하고 아직 주문처리 중이므로 주문 스킵
                if (validStatus.contains(order.getStatus())) throw new RuntimeException(customer + "님의 주문이 아직 주문 처리 중입니다.");
                //아이템 리스트를 가져왔을 때 없다면 고객 정보를 출력하고 아이템 누락으로 주문 스킵
                List<OrderItem> orderItems = order.getOrderItems().orElseThrow( () -> { throw new RuntimeException( customer + "님의 주문 아이템들이 누락 되었습니다."); } );
                //총 주문 개수
                totalOrderCount++;
                for (OrderItem orderItem: orderItems){
                    //아이템 리스트를 돌면서 가격을 가져와 더해줌
                    totalRevenue += orderItem.getTotalPrice();
                }
            } catch (RuntimeException e){
                System.out.println(e.getMessage() + " 문제로 해당 주문은 SKIP 합니다.");
            }
        }
        System.out.println("오늘 총 " + totalOrderCount + " 주문을 처리 하여 " + totalRevenue + " 수익을 올렸습니다.");
    }
}