package mission.Week2_Day1.Problem_2;

public interface ReviewerRole {
    default void writeReview(){
        System.out.println("ReviewRole을 맡아서 리뷰할 수 있습니다");
    };
    default void giveRating(){
        System.out.println("ReviewRole을 맡아서 점수 평가할 수 있습니다");
    };
}