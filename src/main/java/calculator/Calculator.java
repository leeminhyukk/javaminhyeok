package calculator;

import java.util.ArrayList;

public class Calculator {


    //연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성
    // private 추가 = App 클래스의 main 메서드에서
    // Calculator 클래스의 연산 결과를 저장하고 있는 컬렉션 필드에 직접 접근하지 못하도록 수정합니다. (캡슐화)
    private ArrayList<Double> doubleList =new ArrayList<>();
    //받을 숫자 2개 생성 num1 첫번째, num2 두번째
    int num1 =0;
    int num2 =0;
    double result =0;
    char operator;

    // 삭제 기능 추가.
    public void removeResult(){
        doubleList.remove(0);
    }

    private ThreadLocal<Object> doubleList() {
    }

    public ArrayList<Double> getDoubleList(){ //가져온다.
        return doubleList;
    }

    public void setDoubleList(ArrayList<Double> doubleList){ // 정한다.
        this.doubleList =doubleList;
    }


    //반환 타입,결과값 double 로 변경.
    // 결과값 변수 초기화.

    // 연산 기호를 매개변수로 받아 사칙연산(+,-,*,/) 기능을 수행한 후 결과 값을 반환하는 메서드 4개 add , sub, mul , div

    public double addCalculate(int num1,char operator, int num2){
        result = num1 + num2;
        return result;
    }

    public double subCalculate(int num1,char operator, int num2){
        result = num1 - num2;
        return result;
    }

    public double mulCalculate(int num1,char operator, int num2){
        result = num1 * num2;
        return result;
    }

    public double divCalculate(int num1,char operator, int num2){
        if (num2 != 0){
        result = num1 / num2;
        return result;
        } else {
        throw new ArithmeticException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
        }



    }
    public void addList(){
        doubleList.add(result);
    }

                    //예외처리. 구글링 참고








}



//        switch (operator) {
//            // case 뒤에는 조건!! 변수에 따라 뒤에 result 값이 이렇게 계산되고, break 되도록 설정했습니다.
//            case '+':
//                result = num1 + num2;
//                break;
//            case '-':
//                result = num1 - num2;
//                break;
//            case '*':
//                result = num1 * num2;
//                break;
//            case '/':
//                if (num2 != 0) {
//                    result = num1 / num2;
//                } else {
//                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
//                    //결과값을 아예 텍스트로 표현하고 싶지만 result 는 int result 로 선언했기 때문에 숫자로 입력했습니다.
//                    result = 999999999;
//                    break;
//                }
//                intList.add(result);
//                // 위에 값 중 예상된 값이 입력되지 않을 경우. ex. 기호 자리에 숫자입력.
//            default:
//                System.out.println("잘못 입력하셨습니다.");
//        switch ()
//        result = num1 +num2;


