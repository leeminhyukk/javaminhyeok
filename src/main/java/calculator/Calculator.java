package calculator;

import java.util.ArrayList;

public class Calculator {


    //연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성
    ArrayList<Integer> intList =new ArrayList<Integer>();
    //받을 숫자 2개 생성 num1 첫번째, num2 두번째
    int num1 =0;
    int num2 =0;
    double result =0;
    char operator;

    //반환 타입,결과값 double 로 변경.
    public double calculate(int num1, char operator, int num2) {
        switch ()
        result = num1 +num2;

}

        // 결과값 변수 초기화.
        double result = 0;

        double operator(char type) {


        // 연산 기호를 매개변수로 받아 사칙연산(+,-,*,/) 기능을 수행한 후 결과 값을 반환하는 메서드

        double add(num1, num2){
            result = num1 + num2;
            return result;
        }

        double sub(num1, num2){
            result = num1 - num2;
            return result;
        }

        double mul(num1, num2){
            result = num1 * num2;
            return result;
        }

        double div(num1, num2){
            if (num2 != 0)
            result = num1 / num2;
            return result;
            if (num2 = 0)
            throw new ArithmeticException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
        }

                    //예외처리. 구글링 참고



                }
                intList.add(result);

            default:
                System.out.println("잘못 입력하셨습니다.");


        }







    }
}
