package mission.Week1_Day1;

public class ChuncheonTicket1 {
    public static void main(String[] args){
        int priceKim = 3000;
        int pricePark = 5000;
        int priceLee = 2000;
        int priceHong = 2000;

        int finalTicketPrice = (priceKim+pricePark+priceLee+priceHong) / 4;
        System.out.println(finalTicketPrice);
    }

}
