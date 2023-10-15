package mission.Week1_Day6.Me;

public class Sneakers {
    private int daysForDeliver = 3; //배송날짜
    private int costForDeliver = 15_000; //배송비
    private long nikeSneakersPrice = 50_000; //신발가격
    private String nikeSneakersFeature = "안정감"; // 안정감 | 편안함 | 가벼움 등 신발 특징

    //setter
    public void setDaysForDeliver(int daysForDeliver) {
        this.daysForDeliver = daysForDeliver;
    }

    public void setCostForDeliver(int costForDeliver) {
        this.costForDeliver = costForDeliver;
    }

    public void setNikeSneakersPrice(long nikeSneakersPrice) {
        this.nikeSneakersPrice = nikeSneakersPrice;
    }

    public void setNikeSneakersFeature(String nikeSneakersFeature) {
        this.nikeSneakersFeature = nikeSneakersFeature;
    }

    //getter
    public int getDaysForDeliver() {
        return daysForDeliver;
    }

    public int getCostForDeliver() {
        return costForDeliver;
    }

    public long getNikeSneakersPrice() {
        return nikeSneakersPrice;
    }

    public String getNikeSneakersFeature() {
        return nikeSneakersFeature;
    }
}
