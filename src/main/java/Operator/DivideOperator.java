package Operator;


public class DivideOperator {
    public DivideOperator(){

    }

    public double dividenum(int num1 , int num2){

        if (num2 != 0){
            return  num1 / num2;

        } else {
            throw new ArithmeticException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
        }

    }
}