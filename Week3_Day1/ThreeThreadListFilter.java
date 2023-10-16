package mission.Week3_Day1;

import java.util.Arrays;
import java.util.List;

public class ThreeThreadListFilter {
    public static void main(String[] args) {
        // TODO: 작업할 List 생성
        int listSize = 1000;
        List<Integer> list = Arrays.asList(new Integer[listSize]);

        // 결과 확인
        System.out.println("List의 길이: " + list.size());
        System.out.println("List의 내용: " + list);

        // TODO: 3개의 쓰레드 생성, 업무 분담 실행
        Thread thread1 = new Thread(new ListFillerTask(list, 0));
        Thread thread2 = new Thread(new ListFillerTask(list, 1));
        Thread thread3 = new Thread(new ListFillerTask(list, 2));

        // TODO: 3개 Thread 작업 진행
        thread1.start();
        thread2.start();
        thread3.start();

        // 결과 확인
        System.out.println("List의 길이: " + list.size());
        System.out.println("List의 내용: " + list);
    }

    // TODO: 자신이 맡은 리스트 인덱스의 값을 각각 0, 1, 2로 채우도록 구현하는 Task 구현 필요
    static class ListFillerTask implements Runnable {
        private List<Integer> list;
        private int remainder;

        public ListFillerTask(List<Integer> list, int remainder) {
            this.list = list;
            this.remainder = remainder; //나머지
        }
        @Override
        public void run() {
            for(int i = remainder; i <list.size(); i += 3){
                list.set(i, remainder); //해당 인덱스에 나머지 값 설정
            }
        }
    }
}
