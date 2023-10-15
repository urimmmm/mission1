package mission.Week1_Day3;

public class Day3_IfElse {
    public static void main(String[] args){
        int age = 4;

        if(age < 0) {
            System.out.printf("유아 관람불가");
        }else if(age >= 0 && age < 12){
            System.out.printf("전체 관람가");
        }else if(age >=12 && age < 15){
            System.out.printf("12세 이상 관람가");
        }else if(age >= 12 && age < 19){
            System.out.printf("15세 이상 관람가");
        }else if(age >= 19){
            System.out.print("청소년 관람불가");
        }
    }
}
