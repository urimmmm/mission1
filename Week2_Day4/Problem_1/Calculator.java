package mission.Week2_Day4.Problem_1;

public class Calculator {
    public static void main(String[] args) {
        // 변수 선언 및 초기화
        int num1 = 0;
        int num2 = 0;
        char operator;

        try {
            // 숫자1 입력
            num1 = 10;
            // 숫자2 입력
            num2 = 0;
            // 연산자 입력
            operator = '/';
            // calculate 메소드 호출
            int res = calculate(num1, num2, operator);
            // 결과 출력
            System.out.println("결과: "+ res);

        } catch (DivideByZeroException e) {
            System.out.println(e.getMessage());
        } catch (InvalidOperatorException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("예상치 못한 오류가 발생했습니다.");
        }
    }

    public static int calculate(int num1, int num2, char operator) throws DivideByZeroException, InvalidOperatorException {
        // 사칙연산 수행 및 예외 처리
        int result;
        switch (operator){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if(num2 == 0){
                    throw new DivideByZeroException();
                }
                result = num1 / num2;
                break;
            default:
                throw new InvalidOperatorException();
        }
        return result;
    }

}
