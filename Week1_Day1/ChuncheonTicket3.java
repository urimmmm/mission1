package mission.Week1_Day1;

public class ChuncheonTicket3 {
    public static void main(String[] args){
        final int SENIOR_AGE_STANDARD = 65;

        int ageAlice = 70;
        int ageKim = 65;
        int ageYoo = 42;

        String countryAlice = "USA";
        String countryKim = "KOREA";
        String countryYoo = "KOREA";

        boolean Alice = ageAlice >= SENIOR_AGE_STANDARD && countryAlice == "KOREA";
        boolean Kim = ageKim >= SENIOR_AGE_STANDARD && countryKim == "KOREA";
        boolean Yoo = ageYoo >= SENIOR_AGE_STANDARD && countryYoo == "KOREA";

        System.out.println("Alice는 적용 대상자인가?");
        System.out.println(Alice);
        System.out.println("Kim은 적용 대상자인가?");
        System.out.println(Kim);
        System.out.println("Yoo는 적용 대상자인가?");
        System.out.println(Yoo);

    }
}
