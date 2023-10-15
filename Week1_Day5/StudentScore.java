package mission.Week1_Day5;

import java.util.Arrays;

public class StudentScore {
    //시험점수를 저장하고 접근하는 기능
    //모든 학생들의 시험점수를 관리하는 allScores 기능도 제공
    //allScores는 방의 모든 StudentScore가 공동으로 접근하는 값

    // static 변수는 this. 사용불가능
    private static int serialIndex; //학생 객체가 생성될 때마다 1씩 증가
    private static int[] allScores; //모든 학생 점수를 저장하는 배열

    private int myIndex; //allScores의 값을 수정할 떄 유용
    private int score;

    public static int[] getAllScores() {
        return allScores;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
        allScores[myIndex] = score;
    }

    //학생 객체가 추가될 때 생성자
    public StudentScore(int score) {
        this.myIndex = serialIndex++; //학생이 증가했다는 것을 표현
        this.score = score; //값에 넣어줌
        addAllScore(score); //점수를 추가하는 함수를 호출
    }

    //allScores 배열의 값이 없을 때 실행
    //맨 처음에 null값이 때문에 초기값을 넣어주기 위해서
    private static void initializeAllScore(int score){
        allScores = new int[]{score};
    }

    //학생 점수가 추가될 때 실행하는 함수
    private static void addAllScore(int score) {
        if (allScores == null){
            initializeAllScore(score);
            return;
        }
        int length = allScores.length; //배열의 길이를 계산
        //다음 값에 연결하기 위해서 배열의 길이를 늘려주었다
        allScores = Arrays.copyOf(allScores, length + 1);
        allScores[length] = score; //해당 위치에 점수 넣어줌
    }
}
