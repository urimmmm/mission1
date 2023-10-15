package mission.Week1_Day1;

public class ChuncheonTicket2 {
    public static void main(String[] args){
        int ticket = 1111;

        int person = ticket / 4;
        int leftTicket = ticket % 4;

        System.out.println("티켓을 가져갈 수 있는 근무자들 수는?");
        System.out.println(person);
        System.out.println("티켓을 다 나줘주고, 남는 티켓 수는?");
        System.out.println(leftTicket);
    }
}
