package mission.Week2_Day3;

public class StringTest {
    public static void main(String[] args){
        // 1. String Equals와 "==" 비교하기
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");

        //TODO: str1 <-> str2,  str1 <-> str3를 ==으로 값을 비교 및 출력해주세요.
        System.out.println("str1과 str2의 참조 비교 결과: "+ ((str1 == str2)?"같은참조":"다른참조"));
        System.out.println("str1과 str3의 참조 비교 결과: "+ ((str1 == str3)?"같은참조":"다른참조"));

        //TODO: str1 <-> str2, str1 <-> str3를 equals으로 값을 비교 및 출력해주세요 .
        System.out.println("str1과 str2의 참조 비교 결과: "+ (str1.equals(str2)?"같음":"다름"));
        System.out.println("str1과 str3의 참조 비교 결과: "+ (str1.equals(str3)?"같음":"다름"));

        // 2. String Builder로 개선하기
        String[] words = {"Java", "is", "a", "powerful", "programming", "language"};

        String concatenatedString = "";
        for (String word : words) {
            concatenatedString += word + " ";
        }
        System.out.println("일반 String 합치기 방식: " + concatenatedString);

        //TODO: StringBuilder를 사용하여 words배열의 요소들을 조합한 후 출력하세요.
        StringBuilder sb = new StringBuilder();
        for(String word: words){
            sb.append(word).append(" ");
        }
        System.out.println("StringBuilder 사용: " + sb);
    }
}
