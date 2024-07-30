package calculator;

import java.util.ArrayList;
import java.util.Scanner;
//Queue 배열을 사용하기 위해 2개의 import 추가. 2주차 2-16 강의 참고했습니다.


public class App {


    public static void main(String[] args) {
        double result =0;
        Scanner sc = new Scanner(System.in);
        // textString 이라는 문자를 사용하기 위한 선언. "exit" 라는 문자를 받기 위함입니다.
        String textString ="";
        String removeString;
        // removeString 이라는 문자를 사용하기 위한 선언. "remove" 라는 문자를 받기 위함입니다. 1-7

        String inquiryString;
        // 메서드 외 접근 호출.
        Calculator plus = new Calculator();


        //1-7 무한이 저장될 수 있도록 동적 배열 생성했습니다.
        ArrayList<Double> List =new ArrayList<Double>();

        // 반복문 do -while 을 사용했습니다.while 이 false 가 나오기 전까지 반복됩니다.
        // 반복 여부 상관없이 첫번째 계산값은 나타내고 싶어서 do -while 을 사용했습니다.

        do {

            System.out.print("첫 번째 숫자를 입력하세요: ");
            // Scanner 를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            int num1 = sc.nextInt();

            System.out.println("사칙연산 기호를 입력하세요: "); // +, -, *, /
            /* charAt(idx) : charAt 메서드는 메개변수로 char 타입으로 변환 하고자하는 문자열의 위치(index)를 받는다*/
            char operator = sc.next().charAt(0);
            //switch 문을 통해 기호에 맞는 연산이 되도록 설정.

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();
            // Scanner 를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.

            // 선언. 강의 2-7 int month= 8을 참고했습니다.


            //사칙연산 기호를 저장한 변수 = operator


        switch (operator) {
            // case 뒤에는 조건!! 변수에 따라 뒤에 result 값이 이렇게 계산되고, break 되도록 설정했습니다.
            case '+':
                plus.addCalculate(num1,'+',num2);
                break;
            case '-':
                plus.subCalculate(num1,'-',num2);
                break;
            case '*':
                plus.mulCalculate(num1,'*',num2);
                break;
            case '/':
                if (num2 != 0) {
                    plus.divCalculate(num1,'/',num2);
                } else {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    //결과값을 아예 텍스트로 표현하고 싶지만 result 는 int result 로 선언했기 때문에 숫자로 입력했습니다.
                    throw new ArithmeticException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");

                }

                // 위에 값 중 예상된 값이 입력되지 않을 경우. ex. 기호 자리에 숫자입력.
            default:
            {System.out.println("잘못 입력하셨습니다.");
                break;} }
            plus.addList();
            System.out.println("결과: " + plus.result);

            removeString = sc.nextLine(); // 안에 있던 enter 값 삭제를 위해. (버퍼)
            // remove 라는 값을 입력받으면 가장 먼저 입력된 결과가 삭제될 수 있도록 구현. 첫번째 인덱스 intList.remove(0);
            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
             removeString = sc.nextLine();
            if( removeString.equals("remove")) {
                plus.removeResult(); // 앞에 get 추가. // 2-4 에서 Calculator 에서 처리하도록 수정.
            }

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            inquiryString = sc.nextLine();
            if(inquiryString.equals("inquiry")){
                List = plus.getDoubleList();
                for(double list: List){
                    System.out.println(list);
                }
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");

            // 위에 있는 int num2 = sc.nextInt(); 참고했고,
            // 숫자가 아니라서 Int 는 지우고 적어봤습니다.
            textString = sc.nextLine();

            // 2주차 강의 2-6 if 에서 가위바위보 Objects.eqauls 를 참고해서 넣었습니다.
            // 해당 강의에서는 nextLine 을 사용했었는데
            //  sc.nextLine 으로 입력하니 더 계산하시겠습니까? 에 답을 입력 못해서 수정했습니다.





        }while(!(textString.equals("exit")));

    }
}





