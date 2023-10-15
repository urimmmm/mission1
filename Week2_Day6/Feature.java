package mission.Week2_Day6;

public enum Feature {
    UNKNOWN("모름", "Unknown"),
    STABLILITY("안정성", "Stability"),
    COMFORT("편안함", "Comfort"),
    CLASSIC("클래식함", "Classic"),
    TRENDINESS("트렌디함", "Trendiness"),
    DURABILITY("내구성", "Durability"),
    PERFORMANCE("운동성", "Performance");

    private String korean;
    private String english;

    Feature(String korean, String english) {
        this.korean = korean;
        this.english = english;
    }

    public static Feature valueOfTerm(String str){
        for(Feature feature: values()){
            if (str.equals(feature.english) || (str.equals(feature.korean))){
                return feature;
            }
        }
        return UNKNOWN;
    }

    @Override
    public String toString() {
        return korean;
    }
}
